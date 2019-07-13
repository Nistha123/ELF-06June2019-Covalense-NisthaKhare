// let name = document.getElementById('name');
// console.log(name);
// console.log(name.textContent);
// name.style.color = 'purple';

// let demo = document.getElementsByClassName('demo');
// console.log(demo);
// console.log(demo.textContent);
// demo[0].style.fontSize = '20px';
// demo[1].style.display='none';

// //document.getElementById('mybutton').className='button';
// document.getElementById('mybutton').classList='button button1';

// //var querySelect = document.querySelector('p');
// var querySelect = document.querySelectorAll('.demo');
// console.log(querySelect);

// let input = document.createElement('input');
// document.body.appendChild(input);

/* var demoClass = document.getElementsByClassName('demo');
console.log("By Class name"+demoClass.length);

var demoClass1 = document.querySelectorAll('.demo');
console.log("Query Selector"+demoClass1.length);

//write the number of elements in each array(values match)
console.log("number of elements with Query SelectorAll :" + demoClass1.length);
console.log("number of elements with By Class name :" + demoClass.length);

//change one element class to "bnlue"
document.getElementById("pe").className="blue";

//write the number of elements in each array(values differ)
console.log("number of elements with Query SelectorAll :" + demoClass1.length);
console.log("number of elements with By Class name :" + demoClass.length); */

 let button = document.getElementById('mybutton');
/*
button.onclick = function createNewElement(){
    document.getElementById('div1').innerHTML =
     '<a href="https://www.google.com">Anchor tag</a>';
} */

window.onload = function(){
    document.getElementById('mybutton').textContent = 'Dont click';
}

button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML =
    '<a href="https://www.google.com">Anchor tag</a>';
});

