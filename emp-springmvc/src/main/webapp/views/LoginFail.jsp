<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="Login.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<h3 class="head text-center" style="color: red">${errorMsg}</h3>
<h1 class="head text-center">Login Page</h1>
  <div class="card col-md-6 offset-3">
      <div class="card-body">
       <!--  <div class="head text-center" role="alert" style="color: red"> Invalid Credentials !!!!!</div> -->
      <div class="head text-center" style="color: red"> <%-- <%= request.getParameter("msg") %> --%></div>
       
        <form action="./login" method="POST">
                <div class="form-group-horizontal"><br>
                  <label for="exampleInputEmail1">Employee ID</label>
                  <input onkeyup="validateForm()" type="text" class="form-control" id="exampleInputEmail1" name="id" aria-describedby="emailHelp" placeholder="Enter Id">
                   <!-- <span class="alert-message"  id="emailMessage" > Enter a valid email address</span> -->
                </div>
                <br>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  
                  <input name="password" onkeyup="validateForm()" type="password" class="form-control" id="password1" placeholder="Password">
                <!-- <span class="alert-message-password"  id="passwordMessage" > Enter a valid Password</span> -->
                </div><br>
                      <button type="submit" id="submitButton" class="btn btn-outline-secondary form-control"  style="background-color:rgb(111, 114, 117); color: black">Login</button>
                      <br>
                      <br>
                      <div class="row">
                        <a class="col-md-6" href="./Register.html">Create Account</a>
                        <a class="offset-3" href=""> Forgot Password</a>
                           
                         
                      </div>
                <!-- <button type="submit" disabled id="submitButton" class="btn btn-primary" style="background-color:brown ">Submit</button> -->
              </form>
            </div>
        </div>
   
    <script src="Login.js"></script>
</body>
</html>

</body>
</html>