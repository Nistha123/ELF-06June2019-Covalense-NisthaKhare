<%@page import="com.covalense.emp.util.HibernateUtil"%>
<%@page import="com.covalense.emp.dao.EmployeeDaoFactory"%>
<%@page import="com.covalense.emp.dao.EmployeeDao"%>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,
	initial-scale=1.0">

<meta http-equiv=\ "X-UA-Compatible\" content=\ "ie=edge\">

<title>Document</title>

<link rel="stylesheet" href=\
	"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="/Pentagram.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark primary-color"
		style="background-color: rgb(129, 124, 124)">

		<div class=\ "offset-3 input-group md-form form-sm form-2
			pl-0" style="width: 50%;">

			<h3 class="head text-center offset-3" style="color: azure;">Employee List Found</h3>
		</div>
	</nav>
	<hr>

	<BR>
	<% for (EmployeeInfoBean bean : (List<EmployeeInfoBean>) request.getAttribute("empbean")) { %>
	<BR>
	<BR>
	<a href='./getemp?id= <%=bean.getId()%>'>
	Id is : <%=bean.getId()%>	
	<%} %>

	<script src=
		"https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
		
	</script>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
		
	</script>

	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
		
	</script>

</body>
</html>