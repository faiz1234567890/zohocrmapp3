<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<h2>Send Email</h2>
<body>
<form action="triggerEmail" method="post">
<table>
<tr>
<td>To</td>
<td><input type="text" name="email" value="${email }"/></td>
</tr>

<tr>
<td>Subject</td>
<td><input type="text" name="subject"/></td>
</tr>
<tr>
<td><textarea  name="content" rows="10" cols="50">

</textarea></td>
</tr>
<tr>
<td><input type="submit" value="send"/></td>
</tr>
</table>
</form>
${msg}
</body>
</html>