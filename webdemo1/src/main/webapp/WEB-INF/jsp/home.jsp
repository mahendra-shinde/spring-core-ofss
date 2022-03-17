<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Hello World</h1>
<p>${message}</p>
<table>
<thead>
<th>Customer ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Phone</th>
</thead>
<tbody>
<c:forEach items="${customers}" var="c">
<tr>
<td>${c.custId }</td>
<td>${c.firstName }</td>
<td>${c.lastName }</td>
<td>${c.phone }</td>
</tr>
</c:forEach>
</tbody>
</table>
</p>
</body>
</html>