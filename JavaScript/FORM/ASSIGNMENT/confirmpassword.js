button.onclick =  function validateForm(){
    let password = document.forms[0].password.value;
    let confirmPass = document.forms[0].confirm.value;
    if(password!==confirmPass){
        console.log("Password and Confirm Password doesn't match");
        
        document.getElementById('con').innerHTML=

    }else{
        console.log("User registered successfully");
    }
}