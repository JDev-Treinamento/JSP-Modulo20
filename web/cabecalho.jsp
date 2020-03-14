<jsp:useBean id="calcula" class="beans.BeanCursoJsp" type="beans.BeanCursoJsp" scope="page"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:setProperty property="*" name="calcula"/>
<h3> Cabecalho </h3>

<jsp:getProperty name="calcula" property="nome"/>
<br/>
<jsp:getProperty name="calcula" property="ano"/>
<br/>
<jsp:getProperty name="calcula" property="sexo"/>
</html>
