<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from SpringMVC.....</h1>
	
	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.println("ID : "+id);
	out.println("Name : "+name);
	out.println("Salary : "+salary);
	%>
	
	<!--Below declaration is JSP expression tag while using this tag you need active the jsp expression -->
	Id: <b>${id}</b><br>
	Name: <b>${name}</b><br>
	Salary: <b>${salary}</b><br>
	
</body>
</html>