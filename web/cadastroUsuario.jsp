<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cadastro de Usuário</title>
    <link href="resources/css/cadastro.css" rel="stylesheet">
</head>
<body>
<h2 class="center"> Cadastro de Usuario</h2>
<h3 class="center message-color"> ${msg} </h3>
<form action="SalvarUsuario" method="post" id="formUser">
    <ul class="form-style-1">
        <li>
            <table>
                <tr>
                    <td>
                        Codigo:
                    </td>
                    <td>
                        <input autocomplete="off" class="field-long" type="text" id="id" name="id" aria-label="id"
                               value="${user.id}"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Nome:
                    </td>
                    <td>
                        <input autocomplete="off" class="field-long" type="text" id="nome" name="nome"
                               aria-label="nome"
                               value="${user.nome}"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        Login:
                    </td>
                    <td>
                        <input autocomplete="off" class="field-long" type="text" id="login" name="login"
                               aria-label="login"
                               value="${user.login}"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        Senha:
                    </td>
                    <td>
                        <input autocomplete="off" class="field-long" type="password" id="senha" name="senha"
                               aria-label="senha"
                               value="${user.senha}"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        Telefone:
                    </td>
                    <td>
                        <input autocomplete="off" class="field-long" type="text" id="telefone" name="telefone"
                               aria-label="telefone"
                               value="${user.telefone}"/>
                    </td>
                </tr>

                <tr>
                    <td>
                    </td>
                    <td>
                        <input type="submit" id="submit" name="submit" aria-label="Salvar" value="Salvar"/>
                        <input type="submit" id="cancel" name="submit" aria-label="Cancelar" value="Cancelar"
                               onclick="document.getElementById('formUser').action = 'SalvarUsuario?acao=reset'"/>
                    </td>
                </tr>
            </table>
        </li>
    </ul>
</form>

<div class="container">

    <table class="responsive-table">
        <caption>Usuarios Cadastrados</caption>
        <tbody>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Login</th>
            <th scope="col">Nome</th>
            <th scope="col">Telefone</th>
            <th scope="col"> Editar</th>
            <th scope="col">Excluir</th>
        </tr>
        <c:forEach items="${usuarios}" var="user">
            <tr>
                <td class="color-td">
                    <c:out value=" ${user.id}"/>
                </td>
                <td class="color-td">
                    <c:out value=" ${user.login}"/>
                </td>
                <td class="color-td">
                    <c:out value=" ${user.nome}"/>
                </td>

                <td class="color-td">
                    <c:out value=" ${user.telefone}"/>
                </td>

                <td class="color-td">
                    <a href="SalvarUsuario?acao=editar&user=${user.id}"><img src="resources/icon/editar.png"
                                                                             width="20px" height="20px"
                                                                             alt="editar" title="editar"/></a>
                </td>

                <td class="color-td">
                    <a href="SalvarUsuario?acao=delete&user=${user.id}"><img src="resources/icon/excluir.png"
                                                                             width="20px" height="20px"
                                                                             alt="excluir" title="excluir"/></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
</body>
</html>
