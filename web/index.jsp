<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld" %>

<jsp:useBean id="calcula" class="beans.BeanCursoJsp" type="beans.BeanCursoJsp" scope="page"/>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Index </h1>

<%= calcula.calcula(50)%>

</body>
</html>
