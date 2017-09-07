<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>List Of Questions</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="https://code.jquery.com/jquery-3.2.1.js"></script>


</head>
<body>
	<div id="listOfQues">
			<!--  Display the questions and options  -->
			<h2 align = "left"><a href="/QuizAppOnMVC/crudlist">CRUD PAGE</a></h2>
			<table border = 1  align = "center" width = 100%>
			<c:forEach items="${status}" var="question">
					<tr>
						<td>
							question id is : ${question.getId()}
							<br>
							${question.getQuestion()}
						</td>
					</tr>
						<tr>
							<td>
							<c:forEach items="${question.getOption()}" var="optionItem">
								<br/>
								<strong>option: </strong> ${optionItem}<br>
							</c:forEach>
							</td>
						</tr>
				<br/>
					<tr>
						<td>
							<strong> Answer :</strong> ${question.getAnswer()}
						</td>
					</tr>
			</c:forEach>
			</table>		
	</div>
</body>
</html>