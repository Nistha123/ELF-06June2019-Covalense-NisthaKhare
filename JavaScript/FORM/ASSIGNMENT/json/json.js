/* const item = [{
    id : 1,
    name : 'Book',
    price : 200
 },
 {
    id : 2,
    name : 'Pen',
    price : 20 
 },
 {
    id : 3,
    name : 'Shirt',
    price : 500 
 },
 {
    id : 4,
    name : 'Laptop',
    price : 50000
 },
 {
    id : 5,
    name : 'Computer',
    price : 25000 
 }
];

var jsonItem = JSON.stringify(item);
console.log(jsonItem);


var objItem = JSON.parse(jsonItem);
console.log(objItem); */
/* let num = window.prompt("Enter the number");
console.log("factorial is :" + factorial(num));
function factorial(n){

    for(var i=1; i <=n ;i++){

      return factorial(n-1)*n;

    }
} */

/*     function counter(){
        var count=0;

        function getCount(){
            count++;
            return count;
        }
        return getCount;
    }
let c = counter();
var value = c();
console.log(value);

var value1 = c();
console.log(value1);
 */

 function sum(a,b){
    a=10;
    b=20;

    function countSum(){
        var val = a+b;
        return val;
    }
    return countSum;
} 

let c = sum();
var value = c();
console.log("Sum is :"+value);


