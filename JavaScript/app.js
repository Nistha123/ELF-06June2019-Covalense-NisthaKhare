// var a = 10;
// console.log(a);
// var b = a;
// console.log(b);
// b = 20;
// console.log(a);
// console.log(b);

// console.log("===========================================");


// var person = {

//     name : 'Nistha',
//     age : 27,
//     };

//     console.log("P Name = "+person.name);
//     console.log("p Age = "+person.age);

//     var person1 = person;
//     console.log("P1 Name = "+person1.name);

//     person1.name='Sourabh';
//     console.log("P Name = "+person.name);
//     console.log("P1 Name = "+person1.name);

// var person = {

//         firstName : 'Nistha',
//         lastName : 'khare',
//         age : 27,
//         getfullName : function(){
//             return this.firstName + " " + this.lastName;
//         },
//         address:{
//             city : 'Bangalore',
//             state : 'Karnataka',
//             pincode : 560075
//         },
//         hobbies : ['Over Sleeping','Asssignments','Watching TV']
//      };
//      console.log("First Name = "+person.firstName);
//      console.log("Full Name = "+person.getfullName());
//      console.log("City is = "+person.address.city);
//      console.log("Hobbies are = "+person.hobbies[1]);

//  console.log(Math.PI);
//  console.log(Math.pow(10,2));
//  console.log(Math.sqrt(8));
//  console.log(Math.floor(2.8));
//  console.log(Math.random());


// var hobbies = ['Over Sleeping', 'Asssignments', 'Watching TV', 'cricket'];
// //   document.getElementById('demo').innerHTML = hobbies;


// var arr = [10, 20, 40, 80];
// for (var i = 0; i <= arr.length; i++) {
//     console.log(i);
// }

// console.log("===========================================");

// var person = {

//     firstName: 'Nistha',
//     lastName: 'khare',
//     age: 27
// };

// hobbies.forEach((val, index) => {
//     console.log("Values is :" + val);
//     console.log("Index is :" + index);
// })

// console.log("===========================================");

// for (var val of hobbies) {
//     console.log('hobbies = ' + val);
// }

// console.log("===========================================");

// for (var val in hobbies) {
//     console.log('hobbies = ' + val);
// }

// console.log("===========================================");

// for (var index in person) {
//     console.log('person Value= ' + person[index]);
// }

// console.log("===========================================");

// for (var index in hobbies) {
//     console.log('person Index = ' + hobbies[index]);
// }

// console.log("===========================================");

// hobbies['test'] = 'something';
// for(var i in hobbies){
//     console.log('hobbies = ' + hobbies[i]);
// }

// for(var i in hobbies){
//     console.log('hobbies = ' + i);
// }

// var hobbies = ['Over Sleeping', 'Asssignments', 'Watching TV', 'cricket'];
// console.log("====For of loop====");
// console.time("forof")
// for(var i of hobbies){
//     var a = [];
// }
// console.timeEnd("forof");
// console.log("====For of Ended====");

// console.log("===========================================");

// console.log("====For in loop====");
// console.time("forin")
// for(var i in hobbies){
//     var a = [];
// }
// console.timeEnd("forin");
// console.log("====For in Ended====");

// console.log("===========================================");

// console.log("====For loop====");
// console.time("for")
// for(var i=0;i<=hobbies.length;i++){
//     var a = [];
// }
// console.timeEnd("for");
// console.log("====For Ended====");

// function alertMessage(val,number){
//     alert(`This is named function value = ${val} number = ${number}`);
// }

// // (function(){
// //     alert("This is IIFE");
// // }());
// alertMessage("nish",678);

// varKey();
// function varKey(){
//     a = 20;
//     console.log("aaa = "+a);
// }

// console.log("aaa = " + a);

// letKey();
// function letKey(){
//     let b=30;
//     console.log("bbbb = " + b);
// }

// console.log("bbb = " + b);

// constKey();
// function constKey(){
//     let c=40;
//     console.log("ccc = " + c);
// }

// console.log("ccc = " + c);

// ;
var hobbies = ['Over Sleeping', 'Asssignments', 'Watching TV', 'cricket'];

// var a = {};

// console.log(typeof hobbies);
// console.log(Array.isArray(a))

// var inc = hobbies.includes("cricket");
// console.log(inc);

// console.log("===========================================");
// hobbies.push("Kabbadi");
// console.log(hobbies)

// console.log("===========================================");
// hobbies.pop();
// console.log(hobbies)

// console.log("===========================================");
// hobbies.shift();
// console.log(hobbies)

// console.log("===========================================");
// hobbies.unshift("VolleyBall");
// console.log(hobbies)

// console.log("===========================================");
// hobbies.splice(0,2,"Hockey","football");
// console.log(hobbies)

// console.log("===========================================");
// let hob = hobbies.slice(1);
// console.log(hob)


// console.log(hobbies.join())


// console.log(hobbies.indexOf('cricket'))


//==================CallBack function=====================

// function first(sec){
//     setTimeout(()=>{
//         console.log("this is first this is first");
//         console.log("this is first this is first");      
//     },5000);
//     sec();
// }

// function second(){
//     console.log("this is second");
// }


// first(second);


const item = [{
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

            console.log(item);

        //    let mapId = item.map((value)=>{
        //                         return value.price;
        //                      });

        //     console.log(mapId);

        let filteredValue = item.filter((value)=>{
                                            return value.name==='Pen' || value.id===4;
                                     });

             console.log(filteredValue);

console.log("================================")

let a = 'NiSthA';
console.log(a.toLowerCase());

console.log(a.includes('iSt'));
