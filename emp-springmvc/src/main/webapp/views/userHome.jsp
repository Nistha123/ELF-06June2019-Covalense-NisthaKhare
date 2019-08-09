<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
<%EmployeeInfoBean bean =(EmployeeInfoBean) request.getAttribute("empBean"); %>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="/Pentagram.css">
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark primary-color"
		style="background-color: rgb(250, 250, 250)">
		<!-- <form action="./validate2" method="get" class="form-inline"> -->
		 <form action="./validate3/empSearch" method="get" class="form-inline"> 
			<input name="empid" class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
				<input hidden type="text" name="url" value="empSearch">
			<button class="btn btn-outline-success my-2 my-sm-0"
				style="margin-right: 100px;" type="submit">Search</button>
			<button class="btn btn-outline-primary my-2 my-sm-0 offset-6"
				style="font: bold; float: right; margin-left: 700px;" type="button">
				<a href='./logout'>logout</a>
			</button>
		</form>
	</nav>

	</div>

	</div>
	<BR>
	User Id :
	 <%=bean.getId() %>
	<BR>name is :
	 <%=bean.getName()%>
	<BR>phone is :
	<%=bean.getPhone() %>
	<BR>Age is :
	 <%=bean.getAge() %>
	<BR>Salary is :
	 <%=bean.getSalary() %>
	<BR>Account no is :
	<%=bean.getAcnt_no() %>
	<BR>DOB is :
	 <%=bean.getDob() %>
	<BR>Designation is :
	 <%=bean.getDesignation() %>
	<BR>Dept ID is :
	
	
	
	<%-- <BR>Employee Other Info ID is : <%= bean.getOtherInfo()%> --%>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous">
		
	</script>
</body>

</html>