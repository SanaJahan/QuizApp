<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edited Question</title>
</head>
<body>
	<div id="editQues">
				<!--  Display the new questions and options  -->
			<h2 align = "left"><a href="/QuizAppOnMVC/crudlist">CRUD PAGE</a></h2>
			<table align = "center" border = 1 width = 100%>
				<tr>
					<td>${question}</td>
					<tr>
						<c:forEach items="${options}" var="optionItem">
							<td> ${optionItem}</td>
						</c:forEach>
					</tr>
					<tr>
						<td> ${answer}</td>
					</tr>
				<tr>
			</table>			
		</div>
</body>
</html>