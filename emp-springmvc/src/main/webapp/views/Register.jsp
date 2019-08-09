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
	<form action="./register" method="POST">
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">ID</label> <input type="number"
					class="form-control" placeholder="ID" name="id" name="id" required>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
					type="number" class="form-control" placeholder="ACCOUNT NUMBER"
					name="acnt_no">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					class="form-control" placeholder="NAME" name="name">
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
					name="password">
			</div>
			<div class="col">
				<label for="exampleInputConfirm">Confirm Password</label> <input
					type="password" class="form-control" placeholder="Confirm Password"
					name="confPas">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">AGE</label> <input type="number"
					class="form-control" placeholder="AGE" name="age">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DESIGNATION</label> <input
					type="text" class="form-control" placeholder="DESIGNATION"
					name="designation">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputGender">Gender</label> <select id="inputGender"
					class="form-control" name="gender">
					<option selected>--select one--</option>
					<option value="male">male</option>
					<option value="female">female</option>
					<option value="other">other</option>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">Date of Birth</label> 
				<input
					type="date" class="form-control" placeholder="yyyy-MM-dd"
					name="dob">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">SALARY</label> <input type="number"
					class="form-control" placeholder="SALARY" name="salary">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DEPARTMENT ID</label> <input
					type="text" class="form-control" placeholder="DEPARTMENT ID"
					name="deptId">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">PHONE NUMBER</label> <input
					type="number" class="form-control" placeholder="PHONE NUMBER"
					name="phone">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">MANAGER ID</label> <input
					type="number" class="form-control" placeholder="MANAGER ID"
					name="managerId">
			</div>
		</div>
		<div class="row">

			<div class="col-6">
				<label for="exampleInputEmail1">JOINING DATE</label> <input
					type="date" class="form-control" placeholder="JOINING DATE"
					name="joining_date">
			</div>

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
							<label for="exampleInputemergenum">Emergency Contact Name</label>
							<input type="text" class="form-control"
								placeholder="Please Enter Emergency Contact Name"
								name="otherInfo.emergency_contact_name">
						</div>
						<div class="col">
							<label for="exampleInputmotname">Mother Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Mother Name"
								name="otherInfo.mother_name">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Pan Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Pan Number" name="otherInfo.pan">
						</div>
						<div class="col">
							<label for="exampleInputemergeName">Emergency Contact
								Number</label> <input type="number" class="form-control"
								placeholder="Please Enter Emergency Contact Name"
								name="otherInfo.emergency_contact_number">
						</div>
						<div class="col">
							<label for="exampleInputspouse">Spouse Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Spouse Name"
								name="otherInfo.spouse_name">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputStatus">Marital Status</label> <select
								id="inputStatus" class="form-control" name="otherInfo.ismarried">
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>
						</div>
						<div class="col">
							<label for="inputnationality">Nationality</label> <select
								id="inputnationality" class="form-control"
								name="otherInfo.nationality">
								<option selected>---Select One---</option>
								<option value="indian">Indian</option>
								<option value="other">Other</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputpassport">Passport Number</label> <input
								type="number" class="form-control"
								placeholder="Please Enter Passport Number"
								name="otherInfo.passport">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputbloodgrp">Blood Group</label> <select
								id="inputbloodgrp" class="form-control"
								name="otherInfo.blood_grp">
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
								id="inputreligion" class="form-control"
								name="otherInfo.religion">
								<option selected>---Select One---</option>
								<option value="hindu">Hindu</option>
								<option value="christian">Christian</option>
								<option value="muslim">Muslim</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputaadhar">Aadhar Number</label> <input
								type="number" class="form-control"
								placeholder="Please Enter Aadhar Number" name="otherInfo.adhar">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputphysicallych">Physically Challnged</label> <select
								id="inputphysicallych" class="form-control"
								name="otherInfo.isChallenged">
								<option selected>---Select One---</option>
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputfather">Father Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Father Name"
								name="otherInfo.father_name">
						</div>

					</div style="">
					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EXPERIENCE INFO</label>

					<div style="margin-top: 20px; margin-bottom: 25px"
						class="input-group">
						<span class="input-group-addon">Company Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[0].expPKBean.company_name" value=""
							placeholder="Enter Company Name" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Designation</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[0].designation" value=""
							placeholder="Enter Designation">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Joining Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[0].joiningDate" value=""
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Leaving Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[0].leavingDate" value=""
							placeholder="yyyy-MM-dd">
					</div>

					<div style="margin-top: 20px; margin-bottom: 25px"
						class="input-group">
						<span class="input-group-addon">Company Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[1].expPKBean.company_name" value=""
							placeholder="Enter Company Name" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Designation</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[1].designation" value=""
							placeholder="Enter Designation">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Joining Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[1].joiningDate" value=""
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Leaving Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[1].leavingDate" value=""
							placeholder="yyyy-MM-dd">
					</div>

					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EDUCATIONAL INFO</label>
					<div style="margin-top: 20px" class="form-group"></div>
<!-- 
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Id</span> <input
							id="login-username" type="text" class="form-control" name="id"
							value="" placeholder="Enter Employee Id">
					</div>
 -->
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Education Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].pkBean.educationalType" value=""
							placeholder="Enter Education Type" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Degree Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].degreeType" value=""
							placeholder="Enter Degree Type">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Branch</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].branch" value=""
							placeholder="Enter Degree Branch">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">College Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].collegeName" value=""
							placeholder="Enter College Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">University</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].university" value=""
							placeholder="Enter University Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Year Of Passing</span> <input
							id="login-username" type="date" class="form-control"
							name="lstEducationalInfo[0].yop" value=""
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Percentage</span> <input
							id="login-username" type="number" class="form-control"
							name="lstEducationalInfo[0].percentage" value=""
							placeholder="Enter Percentage">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Location</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[0].location" value=""
							placeholder="Enter College Location">
					</div>
					<div style="margin-top: 10px" class="form-group"></div>


					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Education Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].pkBean.educationalType" value=""
							placeholder="Enter Education Type" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Degree Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].degreeType" value=""
							placeholder="Enter Degree Type">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Branch</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].branch" value=""
							placeholder="Enter Degree Branch">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">College Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].collegeName" value=""
							placeholder="Enter College Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">University</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].university" value=""
							placeholder="Enter University Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Year Of Passing</span> <input
							id="login-username" type="date" class="form-control"
							name="lstEducationalInfo[1].yop" value=""
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Percentage</span> <input
							id="login-username" type="number" class="form-control"
							name="lstEducationalInfo[1].percentage" value=""
							placeholder="Enter Percentage">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Location</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[1].location" value=""
							placeholder="Enter College Location">
					</div>
					<div style="margin-top: 10px" class="form-group"></div>

					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						ADDRESS INFO</label>
					<div class="row" style="margin-top: 20px;">
						<div class="col">
							<label for="exampleInputId">Address Type</label> <input
								type="text" class="form-control"
								name="lstAddressInfoBean[0].addresspKBean.addressType"
								placeholder="Enter Address Type" required>
						</div>
						<div class="col">
							<label for="exampleInputCity">City</label> <input type="text"
								class="form-control" placeholder="Enter City"
								name="lstAddressInfoBean[0].city">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputState">Landmark</label> <input
								type="text" class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[0].landmark">
						</div>
						<div class="col">
							<label for="exampleInputState">State</label> <input type="text"
								class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[0].state">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line1"
								name="lstAddressInfoBean[0].address1">
						</div>
						<div class="col">
							<label for="exampleInputCountry">Country</label> <input
								type="text" class="form-control" placeholder="Enter Country"
								name="lstAddressInfoBean[0].country">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress2">Address2</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line2"
								name="lstAddressInfoBean[0].address2">
						</div>
						<div class="col">
							<label for="exampleInputPincode">Pincode</label> <input
								type="number" class="form-control" placeholder="Enter Pincode"
								name="lstAddressInfoBean[0].pincode">
						</div>
					</div>

					<div class="row" style="margin-top: 20px;">
						<div class="col">
							<label for="exampleInputId">Address Type</label> <input
								type="text" class="form-control"
								name="lstAddressInfoBean[1].addresspKBean.addressType"
								placeholder="Enter Address Type" required>
						</div>
						<div class="col">
							<label for="exampleInputCity">City</label> <input type="text"
								class="form-control" placeholder="Enter City"
								name="lstAddressInfoBean[1].city">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputState">Landmark</label> <input
								type="text" class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[1].landmark">
						</div>
						<div class="col">
							<label for="exampleInputState">State</label> <input type="text"
								class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[1].state">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line1"
								name="lstAddressInfoBean[1].address1">
						</div>
						<div class="col">
							<label for="exampleInputCountry">Country</label> <input
								type="text" class="form-control" placeholder="Enter Country"
								name="lstAddressInfoBean[1].country">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress2">Address2</label> <input
								.type="text" class="form-control"
								placeholder="Enter Address Line2"
								name="lstAddressInfoBean[1].address2">
						</div>
						<div class="col">
							<label for="exampleInputPincode">Pincode</label> <input
								type="number" class="form-control" placeholder="Enter Pincode"
								name="lstAddressInfoBean[1].pincode">
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