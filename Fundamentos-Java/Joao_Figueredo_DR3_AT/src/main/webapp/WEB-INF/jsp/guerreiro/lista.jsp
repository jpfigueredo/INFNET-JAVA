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

		<h4>Registro de Guerreiro:</h4>

		<form action="/guerreiro" method="get">
			<button type="submit">Novo Guerreiro</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
			  <strong>Confirmação!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty guerreiroLista}">
		  	<p>Quantidade de guerreiros registrados: ${guerreiroLista.size()}</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>BebidaAlcoolica</th>
			        <th>ShotsAlcoolicos</th>
			        <th>Petisco</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach var="b" items="${guerreiroLista}">
			      <tr>
			        <td>${b.Id}</td>
			        <td>${b.QntdLugares}</td>
			        <td>${b.CadeiraEspecial}</td>
			        <td>${b.PreçoMesa}</td>
			        <td>${b.BebidaAlcoolica}</td>
			        <td>${b.ShotsAlcoolicos}</td>
			        <td>${b.Petisco}</td>
			        <td><a href="/balcao/${b.id}/excluir">Excluir</a></td>
			      </tr>
				</c:forEach>
			    </tbody>
			    <tfoot>
			      <tr>
			        <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>BebidaAlcoolica</th>
			        <th>ShotsAlcoolicos</th>
			        <th>Petisco</th>
			        <th></th>
			      </tr>
			    </tfoot>
		  	</table>
		</c:if>
		
		<c:if test="${empty balcaoLista}">
	  		<p>Não existem balcoes registrados!</p>            
	  	</c:if>
	</div>
</body>
</html>