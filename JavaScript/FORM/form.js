window.onload = function(){
};

let button = document.getElementById('but1');
button.disabled=false;
button.onclick =  function validateForm(){
    let myEmail = document.forms[0].email.value;
    console.log(myEmail);
    let password = document.forms[0].password.value;
    let confirmPass = document.forms[0].confirm.value;
    if(password===confirmPass && password.length>6 && myEmail.length>15){
        console.log(password);
        console.log(confirmPass);
        console.log(myEmail);
        button.disabled=true;
    }else{
        console.log("Enter Details again");
    }

}

