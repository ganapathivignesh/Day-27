<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib "http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:action="./register" modelAttribute="cust">
<form:label path="custid">enter custid</form:label>
<form:input path="custid"/><br>

<form:label path="custname">enter custid</form:label>
<form:input path="custname"/><br>

<form:label path="custadd">enter custid</form:label>
<form:input path="custadd"/><br>
<input type="submit" value="submit"/>



</body>
</html>