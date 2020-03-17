<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Index </h1>

<c:set var="numero" value="${100/2}"/>

<c:if test="${numero == 50}">
    <c:redirect url="acesso_liberado.jsp"/>
</c:if>

<c:if test="${numero == 50}">
    <c:redirect url="http://www.javaavancado.com"/>
</c:if>


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
