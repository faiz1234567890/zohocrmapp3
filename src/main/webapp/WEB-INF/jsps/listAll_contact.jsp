<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<h2>All contacts</h2>
<body>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
<th>Billing</th>

</tr>
<c:forEach var="contacts" items="${contacts}">
<tr>
<td><a href="contactInfo?id=${contacts.id}">${contacts.firstName}</a></td>
<td>${contacts.lastName}</td>
<td>${contacts.email}</td>
<td>${contacts.mobile}</td>
<td>${contacts.source}</td>
<td><a href="generateBill?id=${contacts.id }">Billing</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>