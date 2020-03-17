<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Index </h1>

<form action="LoginServlet" method="post">
    <label for="login"> Login: </label>
    <input type="text" id="login" name="login" aria-label="login"/>
    <br/>
    <label for="senha"> Senha: </label>
    <input type="password" id="senha" name="senha" aria-label="senha"/>
    <br/>
    <input type="submit" value="Logar" aria-label="Logar"/>
</form>

</body>
</html>
