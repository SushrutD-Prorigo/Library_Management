/**
 * 
 */



var name="vcedvev";
function greet()
{
	 var name=document.getElementById("myName").value;
	document.getElementById("greet").innerHTML="Welcome"+" "+name;
}


console.log("Welcome to js");

var arr=["Honda","Kawasaki","Hero","TVS"];

console.log(arr);
console.log("\n");
for(let i=0;i<arr.length;i++)
{
	console.log(arr[i]);
}

console.log(arr.concat(["Sushrut","Deore"]));

console.log(arr.unshift("BMW"));
console.log(arr.push("Tesla"));
console.log(arr.pop());
console.log(arr);


function modifyArray(arr)
{
	for(let i=0;i<arr.length;i++)
		{
			if(arr[i]=="BMW")
				arr[i]="newBMW";
		}
	
	console.log(arr);	
}

modifyArray(arr);
/*
var age=18;
	
	if(age >= 22)
		console.log("Eligible for voting and can also Nominate for Election");
	else if(age>= 18)
		console.log("Eligible for Voting");
	else
		console.log("Come after "+(18-age) +" Years for voting");

*/

function validateAge()
{
	var age=parseInt(document.getElementById("age").value);
	
	if(age >= 22)
		document.getElementById("validate").innerHTML="Eligible for voting and can also Nominate for Election";
	else if(age>= 18)
		document.getElementById("validate").innerHTML="Eligible for Voting";
	else
		document.getElementById("validate").innerHTML="Come after "+(18-age) +" Years for voting";

}

