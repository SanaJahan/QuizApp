<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>List Of Questions</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="https://code.jquery.com/jquery-3.2.1.js"></script>


</head>

<h1>${playerName}Let's begin..</h1>
<br />
<body>
	<div id="quizForm">
		<form action="/QuizAppOnMVC/score" method="GET">
			<!--  Display the questions and options  -->
			<c:forEach items="${question}" var="question">

				<tr>
				<td> "${question.question}"</td>
					
				</tr>
			</c:forEach>

			<p align="center">
				<input type="Submit" id="button">
				<% String result = request.getParameter("result"); 
				session.setAttribute("display_result",result ); 
				%>
			</p>
			
		</form>
	</div>
</body>
</html>