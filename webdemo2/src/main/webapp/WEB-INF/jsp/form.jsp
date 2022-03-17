<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating new customer record</title>
<style>
table{
border: 1pt solid darkred;
padding: 5px;
width:500px;
}
</style>
</head>
<body>
<fm:form method="post" modelAttribute="customer">
	<table cellpadding="5px" cellspacing="0px">
	<tr>
	<td><fm:label path="custId">Customer ID</fm:label></td>
	<td><fm:input path="custId" /> </td>
	</tr>
	<tr>
	<td><fm:label path="firstName">First Name</fm:label></td>
	<td><fm:input path="firstName" /> </td>
	</tr>
	<tr>
	<td><fm:label path="lastName">Last Name</fm:label></td>
	<td><fm:input path="lastName" /> </td>
	</tr>
	<tr>
	<td><fm:label path="phone">Phone Number</fm:label></td>
	<td><fm:input path="phone" /> </td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td><input type="submit" value="Submit" />  </td>
	</tr>
	</table>
</fm:form>
</body>
</html>