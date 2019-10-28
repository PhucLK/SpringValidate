<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello JSP</h1>
	<form:form action="student" modelAttribute="student">

		<input type="text"  name="age"/>
		<form:errors path="age" cssClass="error"></form:errors>
		<br>
		<input type="text" name="name">
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		<input type="text" name="address">
		<form:errors path="address" cssClass="error"></form:errors>
		<br>
		<input type="submit" name="submit">

	</form:form>
</body>
</html>