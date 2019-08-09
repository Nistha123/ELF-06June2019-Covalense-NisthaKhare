<!DOCTYPE html>
<%@page import="com.covalense.emp.manytoone.EmployeeExperienceInfoBean"%>
<%@page import="com.covalense.emp.manytoone.EmployeeEducationalInfoBean"%>
<%@page import="com.covalense.emp.manytoone.EmployeeAddressInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
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

<%
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("infoBean");
%>

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
					class="form-control" placeholder="ID" name="id" value="<%=employeeInfoBean.getId()%>" name="id" required>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
					type="number" class="form-control" placeholder="ACCOUNT NUMBER"
					name="acnt_no" value="<%=employeeInfoBean.getAcnt_no()%>">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					class="form-control" placeholder="NAME" name="name" value="<%=employeeInfoBean.getName()%>">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">EMAIL ID</label> <input type="text"
					class="form-control" placeholder="EMAIL ID" name="email" value="<%=employeeInfoBean.getEmail()%>">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputPass">Password</label> <input
					type="password" class="form-control" placeholder="Password"
					name="password" value="<%=employeeInfoBean.getPassword()%>">
			</div>
			<div class="col">
				<label for="exampleInputConfirm">Confirm Password</label> <input
					type="password" class="form-control" placeholder="Confirm Password"
					name="confPas" >
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">AGE</label> <input type="number"
					class="form-control" placeholder="AGE" name="age" value="<%=employeeInfoBean.getAge()%>">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DESIGNATION</label> <input
					type="text" class="form-control" placeholder="DESIGNATION"
					name="designation" value="<%=employeeInfoBean.getDesignation()%>">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputGender">Gender</label> <select id="inputGender"
					class="form-control" name="gender">
					<%if(employeeInfoBean.getGender().equals("male")) {%>
					<option value="male" selected="selected">male</option>
					<option value="female">female</option>
					<%}else{ %>
					<option value="male">male</option>
					<option value="female" selected="selected">female</option>
					<%} %>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">Date of Birth</label> 
				<input
					type="date" class="form-control" placeholder="yyyy-MM-dd"
					name="dob" value="<%=employeeInfoBean.getDob()%>">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">SALARY</label> <input type="number"
					class="form-control" placeholder="SALARY" name="salary" value="<%=employeeInfoBean.getSalary()%>">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DEPARTMENT ID</label> <input
					type="text" class="form-control" placeholder="DEPARTMENT ID"
					name="deptId" value="<%=employeeInfoBean.getDeptId()%>">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">PHONE NUMBER</label> <input
					type="number" class="form-control" placeholder="PHONE NUMBER"
					name="phone" value="<%=employeeInfoBean.getPhone()%>">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">MANAGER ID</label> <input
					type="number" class="form-control" placeholder="MANAGER ID"
					name="managerId" value="<%=employeeInfoBean.getMngId()%>">
			</div>
		</div>
		<div class="row">

			<div class="col-6">
				<label for="exampleInputEmail1">JOINING DATE</label> <input
					type="date" class="form-control" placeholder="JOINING DATE"
					name="joining_date" value="<%=employeeInfoBean.getJoining_date()%>">
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
								name="otherInfo.emergency_contact_name" 
								value="<%=employeeInfoBean.getOtherInfo().getEmergency_contact_name()%>">
						</div>
						<div class="col">
							<label for="exampleInputmotname">Mother Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Mother Name"
								name="otherInfo.mother_name"
								value="<%=employeeInfoBean.getOtherInfo().getMother_name()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputPan">Pan Number</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Pan Number" name="otherInfo.pan"
								value="<%=employeeInfoBean.getOtherInfo().getPan()%>">
						</div>
						<div class="col">
							<label for="exampleInputemergeName">Emergency Contact
								Number</label> <input type="number" class="form-control"
								placeholder="Please Enter Emergency Contact Name"
								name="otherInfo.emergency_contact_number"
								value="<%=employeeInfoBean.getOtherInfo().getEmergency_contact_number()%>">
						</div>
						<div class="col">
							<label for="exampleInputspouse">Spouse Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Spouse Name"
								name="otherInfo.spouse_name"
								value="<%=employeeInfoBean.getOtherInfo().getSpouse_name()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputStatus">Marital Status</label> <select
								id="inputStatus" class="form-control" name="otherInfo.ismarried">
								<%if(employeeInfoBean.getOtherInfo().getIsmarried().equals(true)) {%>
								<option value="true" selected="selected">Yes</option>
								<option value="false">No</option>
								<%}else{ %>
								<option value="true">Yes</option>
								<option value="false" selected="selected">No</option>
								<%}%>
							</select>
						</div>
						<div class="col">
							<label for="inputnationality">Nationality</label> <select
								id="inputnationality" class="form-control"
								name="otherInfo.nationality">
								<%if(employeeInfoBean.getOtherInfo().getNationality().equals("Indian")) {%>
								<option value="indian" selected="selected">Indian</option>
								<option value="other">Other</option>
								<%}else{%>
								<option value="indian">Indian</option>
								<option value="other" selected="selected">Other</option>
								<%}%>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputpassport">Passport Number</label> <input
								type="number" class="form-control"
								placeholder="Please Enter Passport Number"
								name="otherInfo.passport"
								value="<%=employeeInfoBean.getOtherInfo().getPassport()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputbloodgrp">Blood Group</label> <select
								id="inputbloodgrp" class="form-control"
								name="otherInfo.blood_grp">
								<%if(employeeInfoBean.getOtherInfo().getBlood_grp().equals("AB+")) {%>
								<option value="AB+" selected="selected">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+">A+</option>
								<option value="A-">A-</option>
								<option value="o+">o+</option>
								<option value="o-">o-</option>
								<%}else if(employeeInfoBean.getOtherInfo().getBlood_grp().equals("AB-")){%>
								<option value="AB+">AB+</option>
								<option value="AB-" selected="selected">AB-</option>
								<option value="A+">A+</option>
								<option value="A-">A-</option>
								<option value="o+">o+</option>
								<option value="o-">o-</option>
								<%}else if(employeeInfoBean.getOtherInfo().getBlood_grp().equals("A+")){%>
								<option value="AB+">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+" selected="selected">A+</option>
								<option value="A-">A-</option>
								<option value="o+">o+</option>
								<option value="o-">o-</option>
								<%}else if(employeeInfoBean.getOtherInfo().getBlood_grp().equals("A-")){%>
								<option value="AB+">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+">A+</option>
								<option value="A-" selected="selected">A-</option>
								<option value="o+">o+</option>
								<option value="o-">o-</option>
								<%}else if(employeeInfoBean.getOtherInfo().getBlood_grp().equals("o+")){%>
								<option value="AB+">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+">A+</option>
								<option value="A-">A-</option>
								<option value="o+" selected="selected">o+</option>
								<option value="o-">o-</option>
								<%}else{%>
								<option value="AB+">AB+</option>
								<option value="AB-">AB-</option>
								<option value="A+">A+</option>
								<option value="A-">A-</option>
								<option value="o+">o+</option>
								<option value="o-" selected="selected">o-</option>
								<%}%>
							</select>
						</div>
						<div class="col">
							<label for="inputreligion">Religion</label> <select
								id="inputreligion" class="form-control"
								name="otherInfo.religion">
								<%if(employeeInfoBean.getOtherInfo().getReligion().equals("Hindu")) {%>
								<option selected>---Select One---</option>
								<option value="hindu" selected="selected">Hindu</option>
								<option value="christian">Christian</option>
								<option value="muslim">Muslim</option>
								<%}else if(employeeInfoBean.getOtherInfo().getReligion().equals("Christian")) {%>
								<option selected>---Select One---</option>
								<option value="hindu">Hindu</option>
								<option value="christian" selected="selected">Christian</option>
								<option value="muslim">Muslim</option>
								<%}else {%>
								<option selected>---Select One---</option>
								<option value="hindu">Hindu</option>
								<option value="christian">Christian</option>
								<option value="muslim" selected="selected">Muslim</option>
								<%}%>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputaadhar">Aadhar Number</label> <input
								type="number" class="form-control"
								placeholder="Please Enter Aadhar Number" name="otherInfo.adhar"
								value="<%=employeeInfoBean.getOtherInfo().getAdhar()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputphysicallych">Physically Challenged</label> <select
								id="inputphysicallych" class="form-control"
								name="otherInfo.isChallenged">
								<%if(employeeInfoBean.getOtherInfo().getIsChallenged().equals(true)) {%>
								<option selected>---Select One---</option>
								<option value="true" selected="selected">Yes</option>
								<option value="false">No</option>
								<%}else{%>
								<option selected>---Select One---</option>
								<option value="true">Yes</option>
								<option value="false" selected="selected">No</option>
								<%}%>
							</select>
						</div>
						<div class="col">
							<label for="exampleInputfather">Father Name</label> <input
								type="text" class="form-control"
								placeholder="Please Enter Father Name"
								name="otherInfo.father_name"
								value="<%=employeeInfoBean.getOtherInfo().getFather_name()%>">
						</div>

					</div style="">
					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EXPERIENCE INFO</label>
						
						<%List<EmployeeExperienceInfoBean> lstExepInfoBean = employeeInfoBean.getLstExperienceInfo();
						  int k = 0;
						  for(EmployeeExperienceInfoBean experienceInfoBean : lstExepInfoBean){
						%>

					<div style="margin-top: 20px; margin-bottom: 25px"
						class="input-group">
						<span class="input-group-addon">Company Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[<%=k%>].expPKBean.company_name" 
							value="<%=experienceInfoBean.getExpPKBean().getCompany_name()%>"
							placeholder="Enter Company Name" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Designation</span> <input
							id="login-username" type="text" class="form-control"
							name="lstExperienceInfo[<%=k%>].designation" 
							value="<%=experienceInfoBean.getDesignation()%>"
							placeholder="Enter Designation">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Joining Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[<%=k%>].joiningDate" 
							value="<%=experienceInfoBean.getJoiningDate()%>"
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Leaving Date</span> <input
							id="login-username" type="date" class="form-control"
							name="lstExperienceInfo[<%=k%>].leavingDate" 
							value="<%=experienceInfoBean.getLeavingDate()%>"
							placeholder="yyyy-MM-dd">
					</div>
					<%
						k++;
						  }
					%>

<!--					<div style="margin-top: 20px; margin-bottom: 25px"
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
					</div> -->

					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						EDUCATIONAL INFO</label>
						
						<%List<EmployeeEducationalInfoBean> lstEduInfoBean = employeeInfoBean.getLstEducationalInfo();
						  int j = 0;
						  for(EmployeeEducationalInfoBean educationalInfoBean : lstEduInfoBean){
						%>
					<div style="margin-top: 20px" class="form-group"></div>
					
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Education Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].pkBean.educationalType" 
							value="<%=educationalInfoBean.getPkBean().getEducationalType()%>"
							placeholder="Enter Education Type" required>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Degree Type</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].degreeType"
							value="<%=educationalInfoBean.getDegreeType()%>"
							placeholder="Enter Degree Type">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Branch</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].branch" 
							value="<%=educationalInfoBean.getBranch()%>"
							placeholder="Enter Degree Branch">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">College Name</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].collegeName" 
							value="<%=educationalInfoBean.getCollegeName()%>"
							placeholder="Enter College Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">University</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].university" 
							value="<%=educationalInfoBean.getUniversity()%>"
							placeholder="Enter University Name">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Year Of Passing</span> <input
							id="login-username" type="date" class="form-control"
							name="lstEducationalInfo[<%=j%>].yop" 
							value="<%=educationalInfoBean.getYop()%>"
							placeholder="yyyy-MM-dd">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Percentage</span> <input
							id="login-username" type="number" class="form-control"
							name="lstEducationalInfo[<%=j%>].percentage" 
							value="<%=educationalInfoBean.getPercentage()%>"
							placeholder="Enter Percentage">
					</div>
					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon">Location</span> <input
							id="login-username" type="text" class="form-control"
							name="lstEducationalInfo[<%=j%>].location" 
							value="<%=educationalInfoBean.getLocation()%>"
							placeholder="Enter College Location">
					</div>
					
					<%
						j++;
						  }
					%>
					<div style="margin-top: 10px" class="form-group"></div>

<!-- 
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
					</div> -->
					<div style="margin-top: 10px" class="form-group"></div>

					<label style="margin-top: 30px; text-align: center;">EMPLOYEE
						ADDRESS INFO</label>
						<%List<EmployeeAddressInfoBean> lstInfoBean = employeeInfoBean.getLstAddressInfoBean();
						  int i = 0;
						  for(EmployeeAddressInfoBean addressInfoBean : lstInfoBean){
						%>
					<div class="row" style="margin-top: 20px;">
						<div class="col">
							<label for="exampleInputId">Address Type</label> <input
								type="text" class="form-control"
								name="lstAddressInfoBean[<%=i%>].addresspKBean.addressType"
								placeholder="Enter Address Type" required
								value="<%=addressInfoBean.getAddresspKBean().getAddressType()%>">
						</div>
						<div class="col">
							<label for="exampleInputCity">City</label> <input type="text"
								class="form-control" placeholder="Enter City"
								name="lstAddressInfoBean[<%=i%>].city"
								value="<%=addressInfoBean.getCity()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputState">Landmark</label> <input
								type="text" class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[<%=i%>].landmark"
								value="<%=addressInfoBean.getLandmark()%>">
						</div>
						<div class="col">
							<label for="exampleInputState">State</label> <input type="text"
								class="form-control" placeholder="Enter State"
								name="lstAddressInfoBean[<%=i%>].state"
								value="<%=addressInfoBean.getState()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress1">Address1</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line1"
								name="lstAddressInfoBean[<%=i%>].address1"
								value="<%=addressInfoBean.getAddress1()%>">
						</div>
						<div class="col">
							<label for="exampleInputCountry">Country</label> <input
								type="text" class="form-control" placeholder="Enter Country"
								name="lstAddressInfoBean[<%=i%>].country"
								value="<%=addressInfoBean.getCountry()%>">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="exampleInputAddress2">Address2</label> <input
								type="text" class="form-control"
								placeholder="Enter Address Line2"
								name="lstAddressInfoBean[0].address2"
								value="<%=addressInfoBean.getAddress2()%>">
						</div>
						<div class="col">
							<label for="exampleInputPincode">Pincode</label> <input
								type="number" class="form-control" placeholder="Enter Pincode"
								name="lstAddressInfoBean[0].pincode"
								value="value="<%=addressInfoBean.getPincode()%>"">
						</div>
					</div>
					<%
						i++;
						}
					%>

					<!-- <div class="row" style="margin-top: 20px;">
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
					</div> -->
					
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