<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<h2>Lead Info</h2>
<body>
FirstName :${lead.firstName }<br/>
LastName :${lead.lastName }<br/>
Email :${lead.email}<br/>
Mobile :${lead.mobile }<br/>
Source :${lead.source }<br/>

<form action="sendEmail" method="post">
<table>
<tr>
<td><input type="submit" value="sendEmail"/></td>
<td> <input type="hidden" name="email" value="${lead.email }"/></td>
</tr>
</table>
</form>

<form action="convertLead" method="post" >
<table>
<tr>
<td><input type="hidden" name="id" value="${lead.id }"/></td>
<td><input type="submit" value="convert"/></td>
</tr>
</table>
</form>
</body>
</html>