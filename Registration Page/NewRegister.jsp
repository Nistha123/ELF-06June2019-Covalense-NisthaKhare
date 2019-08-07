<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<style type="text/css">
.collapsible {
	background-color: #777;
	color: white;
	cursor: pointer;
	padding: 18px;
	width: 100%;
	border: none;
	text-align: left;
	outline: none;
	font-size: 15px;
}

.active, .collapsible:hover {
	background-color: #555;
}

.collapsible:after {
	content: '\002B';
	color: white;
	font-weight: bold;
	float: right;
	margin-left: 5px;
}

.active:after {
	content: "\2212";
}

.content {
	padding: 0 18px;
	max-height: 0;
	overflow: hidden;
	transition: max-height 0.2s ease-out;
	background-color: #f1f1f1;
}
</style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous">
	
</script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


</head>

<body class="p-3 mb-2 bg-light text-dark">
	<h3 class="p-3 mb-2 bg-dark text-white" style="text-align: center;">EMPLOYEE
		INFORMATION</h3>
	<hr>
	<form action="./create" method="POST">
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">ID</label> <input type="text"
					class="form-control" placeholder="ID" name="id" name="id" required>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
					type="text" class="form-control" placeholder="ACCOUNT NUMBER"
					name="ac">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					class="form-control" placeholder="NAME" name="nm">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">EMAIL ID</label> <input type="text"
					class="form-control" placeholder="EMAIL ID" name="email">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputPass">Password</label> <input
					type="password" class="form-control" placeholder="Password"
					name="pas">
			</div>
			<div class="col">
				<label for="exampleInputConfirm">Confirm Password</label> <input
					type="password" class="form-control" placeholder="Confirm Password"
					name="confPas">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">AGE</label> <input type="text"
					class="form-control" placeholder="AGE" name="age">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DESIGNATION</label> <input
					type="text" class="form-control" placeholder="DESIGNATION"
					name="desig">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputGender">Gender</label> <select id="inputGender"
					class="form-control" name="gen">
					<option selected>--select one--</option>
					<option value="male">male</option>
					<option value="female">female</option>
					<option value="other">other</option>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">Date of Birth</label> <input
					type="date" class="form-control" placeholder="dd-mm-yyyy"
					name="dob">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">SALARY</label> <input type="text"
					class="form-control" placeholder="SALARY" name="sal">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
					type="text" class="form-control" placeholder="DEPAETMENT ID"
					name="deptId">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">PHONE NUMBER</label> <input
					type="text" class="form-control" placeholder="PHONE NUMBER"
					name="phone">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">MANAGER ID</label> <input
					type="text" class="form-control" placeholder="MANAGER ID"
					name="manId">
			</div>
		</div>
		<div class="row">

			<div class="col-6">
				<label for="exampleInputEmail1">JOINING DATE</label> <input
					type="date" class="form-control" placeholder="JOINING DATE"
					name="jdate">
			</div>
			<!-- <div class="col-3">
				<br>
				<button type="submit" class="form-control">Submit</button>

			</div>
			<div class="col-3">
				<br>
				<button type="reset" class="form-control">reset</button>
			</div> -->

		</div>
		<br> <br>
		<div class="row">
			<div class="container">
				<button type="button" class="btn btn-info" data-toggle="collapse"
					data-target="#demo">EMPLOYEE OTHER INFORMATION</button>
				<div id="demo" class="collapse">
					<div class="row" style="margin-top: 20px;">
						<!-- <div class="col">
							<label for="exampleInputEmail1">ID</label> <input type="text"
								class="form-control" placeholder="Please Enter ID" name="id">
						</div> -->
						<div class="col">
							<label for="exampleInputemergenum">Emergency Contact
								Number</label> <input type="text" class="form-control"
								placeholder="Please Enter Emergency Contact Number"
								name="emername">
						</div>
						<div class="col">
							<label for="exampleInputmotname">Mother Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Mother Name" name="mname">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Pan Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Pan Number" name="pan">
						</div>
						<div class="col">
							<label for="exampleInputemergeName">Emergency Contact
								Number</label> <input type="text" class="form-control"
								placeholder="Please Enter Emergency Contact Name" name="emernum">
						</div>
						<div class="col">
							<label for="exampleInputspouse">Spouse Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Spouse Name" name="sname">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputStatus">Marital Status</label> <select
								id="inputStatus" class="form-control" name="marst">
								<option selected>Married</option>
								<option value="married">Married</option>
								<option value="unmarried">Unmarried</option>
								<option value="divorcee">Divorcee</option>
							</select>
						</div>
						<div class="col">
							<label for="inputnationality">Nationality</label> <select
								id="inputnationality" class="form-control" name="nan">
								<option selected>---Select One---</option>
								<option value="indian">Indian</option>
								<option value="other">Other</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputpassport">Passport Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Passport Number" name="pass">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputbloodgrp">Blood Group</label> <select
								id="inputbloodgrp" class="form-control" name="blgrp">
								<option selected>---Select One---</option>
								<option value="AB+">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+">A+</option>
								<option value="A-">A-</option>
								<option value="o+">o+</option>
								<option value="o-">o-</option>
							</select>
						</div>
						<div class="col">
							<label for="inputreligion">Religion</label> <select
								id="inputreligion" class="form-control" name="rel">
								<option selected>---Select One---</option>
								<option value="hindu">Hindu</option>
								<option value="christian">Christian</option>
								<option value="muslim">Muslim</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputaadhar">Aadhar Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Aadhar Number" name="aad">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputphysicallych">Physically Challnged</label> <select
								id="inputphysicallych" class="form-control" name="phch">
								<option selected>---Select One---</option>
								<option value="yes">Yes</option>
								<option value="no">No</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputfather">Father Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Father Number" name="fname">
						</div>

					</div style="">
					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EXPERIENCE INFO</label>
					<!-- <div style="margin-top: 25px; margin-bottom: 25px"
						class="input-group">
						<span class="input-group-addon">Id</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="Enter Employee Id">
					</div> -->

					<div style="margin-top: 20px; margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Company Name</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="Enter Company Name" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Designation</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="Enter Designation">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Joining Date</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="dd-mm-yyyy">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Leaving Date</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="dd-mm-yyyy">
					</div>
					
					<div style="margin-top: 20px; margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Company Name</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="Enter Company Name" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Designation</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="Enter Designation">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Joining Date</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="dd-mm-yyyy">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Leaving Date</span> <input
							id="login-username" type="text" class="form-control"
							name="username" value="" placeholder="dd-mm-yyyy">
					</div>
					
					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EDUCATIONAL INFO</label>
					<div style="margin-top: 20px" class="form-group"></div>

					<!-- <div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Id</span> <input
							id="login-username" type="text" class="form-control" name="id"
							value="" placeholder="Enter Employee Id">
					</div> -->

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Education Type</span> <input
							id="login-username" type="text" class="form-control"
							name="edutype" value="" placeholder="Enter Education Type" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Degree Type</span> <input
							id="login-username" type="text" class="form-control"
							name="degree" value="" placeholder="Enter Degree Type">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Branch</span> <input
							id="login-username" type="text" class="form-control"
							name="branch" value="" placeholder="Enter Degree Branch">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">College Name</span> <input
							id="login-username" type="text" class="form-control"
							name="clgname" value="" placeholder="Enter College Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">University</span> <input
							id="login-username" type="text" class="form-control" name="univ"
							value="" placeholder="Enter University Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Year Of Passing</span> <input
							id="login-username" type="text" class="form-control" name="yop"
							value="" placeholder="dd-mm-yyyy">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Percentage</span> <input
							id="login-username" type="text" class="form-control"
							name="percnt" value="" placeholder="Enter Percentage">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Location</span> <input
							id="login-username" type="text" class="form-control" name="loc"
							value="" placeholder="Enter College Location">
					</div>
					<div style="margin-top: 10px" class="form-group"></div>
					
					
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Education Type</span> <input
							id="login-username" type="text" class="form-control"
							name="edutype" value="" placeholder="Enter Education Type" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Degree Type</span> <input
							id="login-username" type="text" class="form-control"
							name="degree" value="" placeholder="Enter Degree Type">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Branch</span> <input
							id="login-username" type="text" class="form-control"
							name="branch" value="" placeholder="Enter Degree Branch">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">College Name</span> <input
							id="login-username" type="text" class="form-control"
							name="clgname" value="" placeholder="Enter College Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">University</span> <input
							id="login-username" type="text" class="form-control" name="univ"
							value="" placeholder="Enter University Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Year Of Passing</span> <input
							id="login-username" type="text" class="form-control" name="yop"
							value="" placeholder="dd-mm-yyyy">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Percentage</span> <input
							id="login-username" type="text" class="form-control"
							name="percnt" value="" placeholder="Enter Percentage">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Location</span> <input
							id="login-username" type="text" class="form-control" name="loc"
							value="" placeholder="Enter College Location">
					</div>
					<div style="margin-top: 10px" class="form-group"></div>

					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						ADDRESS INFO</label>
					<div class="row" style="margin-top: 20px;">
						<div class="col">
							<label for="exampleInputId">Address Type</label> <input type="number"
								class="form-control" placeholder="Enter Address Type" required>
						</div>
						<div class="col">
							<label for="exampleInputCity">City</label> <input type="text"
								class="form-control" placeholder="Enter City">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputState">Landmark</label> <input type="text"
								class="form-control" placeholder="Enter State">
						</div>
						<div class="col">
							<label for="exampleInputState">State</label> <input type="text"
								class="form-control" placeholder="Enter State">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line1">
						</div>
						<div class="col">
							<label for="exampleInputCountry">Country</label> <input
								type="text" class="form-control" placeholder="Enter Country">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress2">Address2</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line2">
						</div>
						<div class="col">
							<label for="exampleInputPincode">Pincode</label> <input
								type="text" class="form-control" placeholder="Enter Pincode">
						</div>
					</div>
					
					<div class="row" style="margin-top: 20px;">
						<div class="col">
							<label for="exampleInputId">Address Type</label> <input type="number"
								class="form-control" placeholder="Enter Address Type" required>
						</div>
						<div class="col">
							<label for="exampleInputCity">City</label> <input type="text"
								class="form-control" placeholder="Enter City">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputState">Landmark</label> <input type="text"
								class="form-control" placeholder="Enter State">
						</div>
						<div class="col">
							<label for="exampleInputState">State</label> <input type="text"
								class="form-control" placeholder="Enter State">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line1">
						</div>
						<div class="col">
							<label for="exampleInputCountry">Country</label> <input
								type="text" class="form-control" placeholder="Enter Country">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress2">Address2</label> <input
								.type="text" class="form-control"
								placeholder="Enter Address Line2">
						</div>
						<div class="col">
							<label for="exampleInputPincode">Pincode</label> <input
								type="text" class="form-control" placeholder="Enter Pincode">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<br>
							<button type="submit" class="form-control btn btn-info">Submit</button>

						</div>
						<div class="col">
							<br>
							<button type="reset" class="form-control btn btn-info">reset</button>
						</div>
					</div>
				</div>

			</div>
	</form>

</body>

</html>