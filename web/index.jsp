<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Curso JSP</title>
</head>
<body>
<h1> Curso JSP </h1>
<%= "Seu sucesso garantido..." %>

<form action="receber-nome.jsp">
    <input type="text" aria-label="nome" id="nome" name="nome" autocomplete="off">
    <input type="submit" aria-label="Enviar formulario" value="Enviar"/>
</form>


<%! int cont = 2;

    public int retorna(int n) {
        return n * 3;
    }
%>
<%=cont%>
<br/>
<%=retorna(cont)%>
</body>
</html>
