<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>
<html>
<head>
    <title>Curso JSP</title>
    <link href="resources/css/estilo.css" rel="stylesheet"/>
</head>
<body>
<div class="login-page">
    <div class="form">
        <form class="login-form" action="LoginServlet" method="post">
            <input autocomplete="off" type="text" id="login" name="login" aria-label="login" placeholder="login"/>
            <input autocomplete="off" type="password" id="senha" name="senha" aria-label="senha" placeholder="senha"/>
            <button type="submit" aria-label="Logar"> Logar</button>
        </form>
    </div>
</div>
</body>
</html>
