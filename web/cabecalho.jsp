<jsp:useBean id="calcula" class="beans.BeanCursoJsp" type="beans.BeanCursoJsp" scope="page"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:setProperty property="*" name="calcula"/>
<h3> Cabecalho </h3>

<p> Nome : ${param.nome}</p>
<p> Ano : ${param.ano}</p>
<p> Sexo : ${param.sexo}</p>
<p> Sessao : ${sessionScope.get("user")}</p>

</html>
