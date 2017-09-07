
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Welcome</h2><br>

	<h1 align  = "center">${quiz}</h1><br/>
	<h2 align = "left"><a href="/QuizAppOnMVC/crudlist">CRUD PAGE</a></h2>
	
	<form action = "/QuizAppOnMVC/play" method = "GET">
	<p align = "center">
	<input type = "text" name = "playername">
	<input type = "submit" value = "Let's Play">
	</p>
	</form>
	
</body>
</html>
