<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
  </head>
  <title>Admin.Console</title>
  <body>
	<h2>ADMIN OPTIONS:</h2>
	<br>
	<br>
	<br>
	<ol type="1">
		<li><a href="<s:url action="testconnect" method="setWbserverBean"/>">Testar Conexao</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Registrar Pessoas</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Gerir departamentos e faculdades</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Criar eleição</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Consultar detalhes de eleição</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Gerir listas de candidatos a uma eleição</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Gerir mesas de voto</a><br><br></li>
		<li><a href="<s:url action="testconnect"/>">Alterar propriedade da eleição</a><br><br></li>
	</ol>
  </body>
</html>