
window.onload= function(){
	console.log("js is linked")
	getReimbursementList();
}

function getReimbursementList() {
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function() {
		if(xhttp.readyState == 4 && xhttp.status ==200){
			let reimList  = JSON.parse(xhttp.responseText);
			console.log(reimList );
			for (let reims of reimList) {
				console.log(reims);
				reimburseLists(reims);
			}
		}
	}
	//xhttp.open("GET", "http://localhost:7002/reimbursement/list");
	xhttp.open("GET", "http://localhost:7002/reimbursement/listbyuser");
	xhttp.send();
}


function loadEmployeeReims() {

	console.log('inside employee Reimburse');

	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			let rus= JSON.parse(xhr.responseText);
			// console.log("reimb", reimbursements); 
			let r = rus.pop();

			reimburseLists(r);

		}

	}


	//xhr.open("GET", "http://localhost:7002/reimbursement/list");
	xhr.open("GET", "http://localhost:7002/reimbtype/session");
	xhr.send();

}


function reimburseLists(reims) {

	let status = "";
	let type = "";

	switch (reims.statusId) {
		case 1:
			status = "Pending";
			break;

		case 2:
			status = "Denied";
			break;

		case 3:
			status = "Approved";
			break;

		default:
			break;

	}

	switch (reims.typeId) {

		case 1:
			type = "Lodging";
			break;

		case 2:
			type = "Travel";
			break;

		case 3:
			type = "Food";
			break;

		case 4:
			type = "Other";
			break;

		default:
			break;


	}
	var submitTime = new Date(reims.submittedDate);
	var resolved = (reims.resolvedDate) ? reims.resolvedDate : '';
	
	var info = $(`
				<tr>
					<th>${reims.id}</th>
					<td>${reims.amount}</td>
					<td>${submitTime}</td>
					<td>${resolved}</td>
					<td>${reims.description}</td>
					<td>${reims.author}</td>
					<td>${status}</td>
					<td>${type}</td>
				</tr>`
	)

	$('#reimInfo').append(info);

}







