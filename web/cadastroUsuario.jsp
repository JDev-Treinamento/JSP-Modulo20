<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cadastro de Usuário</title>
</head>
<body>
<h3> Cadastro de Usuario</h3>
<form action="SalvarUsuario" method="post">
    <table>
        <tr>
            <td>
                Login
            </td>
            <td>
                <input type="text" id="login" name="login" aria-label="login"/>
            </td>
        </tr>

        <tr>
            <td>
                Senha
            </td>
            <td>
                <input type="password" id="senha" name="senha" aria-label="senha"/>
            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" id="submit" name="submit" aria-label="Salvar" value="Salvar"/>
            </td>
        </tr>
    </table>
</form>


<table>
    <c:forEach items="${usuarios}" var="user">
        <tr>
            <td style="width: 150px">
                <c:out value=" ${user.login}"/>
            </td>
            <td>
                <c:out value=" ${user.senha}"/>
            </td>

            <td>
                <a href="SalvarUsuario?acao=delete&user=${user.login}">Excluir</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
