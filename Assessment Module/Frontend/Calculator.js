//function that display value 
function dis(val) 
{ 
    document.getElementById("result").value+=val 
} 
  
//function that evaluates the digit and return result 
function solve() 
{ 
    let x = document.getElementById("result").value 

    //eval() is an inbuilt method which takes argument as a string 
    //& it automatically evaluates the expression
    let y = eval(x) 
    document.getElementById("result").value = y 
} 
  
//function that clear the display 
function clr() 
{ 
    document.getElementById("result").value = "" 
} 