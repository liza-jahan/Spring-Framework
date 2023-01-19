<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form  method="post"  action="${pageContext.request.contextPath}/docreate">
  <table>
   <tr><td>Name:</td><td><input name="name" type="text"/></td></tr>
     <tr><td>Email:</td><td><input name="email" type="text"/></td></tr>
     <tr><td>&nbsp;</td><td><input name="Create Notice" type="Submit"></td></tr>
  
  </table>
  </form>

</body>
</html>