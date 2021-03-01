/**
 * 
 */

window.onload=function(){
	console.log("js is linked");
	getSessionUser();

}


function getSessionUser(){
	let xhttp=new XMLHttpRequest();
	
	xhttp.onreadystatechange=function(){
		if(xhttp.readyState==4 && xhttp.status==200){
			let us=JSON.parse(xhttp.responseText);
			console.log(us);
		}
	}
		xhttp.open("GET","http://localhost:9023/user/session");
		xhttp.send();
}