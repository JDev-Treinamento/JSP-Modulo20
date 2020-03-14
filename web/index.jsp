<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Index </h1>

<form action="cabecalho.jsp" method="post">

    <% session.setAttribute("user", "javaavancado");%>
    <input type="text" aria-label="nome" id="nome" name="nome"/>
    <br/>
    <input type="text" aria-label="ano" id="ano" name="ano"/>
    <br/>
    <input type="text" aria-label="sexo" id="sexo" name="sexo"/>
    <br/>
    <input type="submit" value="testar"/>
</form>

</body>
</html>
