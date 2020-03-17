<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Index </h1>

<form action="LoginServlet" method="post">
    <input type="text" id="login" name="login" aria-label="login"/>
    <br/>
    <input type="password" id="senha" name="senha" aria-label="senha"/>
    <br/>
    <input type="submit" value="Logar" aria-label="Logar"/>
</form>

</body>
</html>
