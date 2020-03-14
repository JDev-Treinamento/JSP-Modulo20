<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= "Nome Recebido: " + request.getParameter("nome") %>
<br/>

<% response.sendRedirect("https://www.uol.com.br/"); %>
</body>
</html>
