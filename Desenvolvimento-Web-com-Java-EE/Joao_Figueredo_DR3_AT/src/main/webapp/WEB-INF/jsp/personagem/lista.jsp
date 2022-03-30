<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
	<title>ProjetoJava</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container fixed-top" >	

		<h4>Registro de personagem:</h4>

		<form action="/personagem" method="get">
			<button type="submit">Nova personagem</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
			  <strong>Confirmação!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty externaLista}">
		  	<p>Quantidade de externas registrados: ${externaLista.size()}</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>QntdVentiladores</th>
			        <th>Musico</th>
			        <th>CadeiraAcolchoada</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach var="c" items="${externaLista}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.QntdLugares}</td>
			        <td>${c.CadeiraEspecial}</td>
			        <td>${c.PreçoMesa}</td>
			        <td>${c.QntdVentiladores}</td>
			        <td>${c.Musico}</td>
			        <td>${c.CadeiraAcolchoada}</td>
			        <td><a href="/externa/${c.id}/excluir">Excluir</a></td>
			      </tr>
				</c:forEach>
			    </tbody>
			    <tfoot>
			      <tr>
			        <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>QntdVentiladores</th>
			        <th>Musico</th>
			        <th>CadeiraAcolchoada</th>
			        <th></th>
			        <th></th>
			      </tr>
			    </tfoot>
		  	</table>
		</c:if>
		
		<c:if test="${empty externaLista}">
	  		<p>Não existem externas registradas!!!</p>            
	  	</c:if>
	</div>
</body>
</html>