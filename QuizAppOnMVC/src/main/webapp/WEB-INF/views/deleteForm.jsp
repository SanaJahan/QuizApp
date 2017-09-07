<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete a question</title>
</head>
<body>

	<form action = "/QuizAppOnMVC/delete" method = "GET">
	
		<p align = "center">
		
		<!-- Parameters to be taken : qID (integer) -->
		
		Question ID : <input type = "text" name = "qid"><br/>

		</p>
	
		<p align = "center"><input type = "submit" value = "Delete Question"></p>
		
	</form>

</body>
</html>