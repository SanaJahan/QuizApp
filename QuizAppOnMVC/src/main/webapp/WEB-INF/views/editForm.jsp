<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit a question</title>
</head>
<body>

	<form action = "/QuizAppOnMVC/edit" method = "GET">
	
		<p align = "center">
		
		<!-- Parameters to be taken : qID (integer) question(String) List(options) answer(integer) -->
		Question ID : <input type = "text" name = "qid"><br/>
		Question : <input type = "text" name = "question"><br/>
		Option 1 : <input type = "text" name = "options"><br/>
		Option 2 : <input type = "text" name = "options"><br/>
		Option 3 : <input type = "text" name = "options"><br/>
		Option 4 : <input type = "text" name = "options"><br/>
		Answer   : <input type = "text" name = "answer"><br/>
		
		</p>
	
		<p align = "center"><input type = "submit" value = "Edit Question"></p>
		
	</form>

</body>
</html>