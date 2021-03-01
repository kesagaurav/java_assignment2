
/**
 * 
 */

window.onload=function(){
	console.log("js is linked");
	getSessionReimbursement();

}


function getSessionReimbursement(){
	let xhttp=new XMLHttpRequest();
	
	xhttp.onreadystatechange=function(){
		if(xhttp.readyState==4 && xhttp.status==200){
			let rus=JSON.parse(xhttp.responseText);
			console.log(rus);
		}
	}
		xhttp.open("GET","http://localhost:9023/reimbtype/session");
		xhttp.send();
}