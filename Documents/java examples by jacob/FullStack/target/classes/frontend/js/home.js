/**
 *		Getting a session user 
 */

window.onload=function(){
	console.log("js is linked");
	getSessionVillian();

}


function getSessionVillian(){
	let xhttp=new XMLHttpRequest();
	
	xhttp.onreadystatechange=function(){
		if(xhttp.readyState==4 && xhttp.status==200){
			let vill=JSON.parse(xhttp.responseText);
			console.log(vill);
		}
	}
		xhttp.open("GET","http://localhost:9019/villians/session");
		xhttp.send();
}



