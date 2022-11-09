<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactInfo</title>
</head>
<h2>ContactInfo</h2>
<body>
FirstName :${contact.firstName }<br/>
LastName :${contact.lastName }<br/>
Email :${contact.email }<br/>
Mobile :${contact.mobile }<br/>
Source :${contact.source }<br/>
</body>
</html>