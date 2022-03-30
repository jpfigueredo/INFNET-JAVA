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

		<h4>Registro de MesasInternas:</h4>

		<form action="/mesaInterna" method="get">
			<button type="submit">Nova MesaInterna</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
			  <strong>Confirmação!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty mesaInternaLista}">
		  	<p>Quantidade de mesas Internas registradas: ${mesaInternaLista.size()}</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			       <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>ArCondicionado</th>
			        <th>VelaRomantica</th>
			        <th>IluminacaoEspecial</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach var="s" items="${mesaInternaLista}">
			      <tr>
			        <td>${s.Id}</td>
			        <td>${s.QntdLugares}</td>
			        <td>${s.CadeiraEspecial}</td>
			        <td>${s.PreçoMesa}</td>
			        <td>${s.ArCondicionado}</td>
			        <td>${s.VelaRomantica}</td>
			        <td>${s.IluminacaoEspecial}</td>
			        <td><a href="/mesaInterna/${s.id}/excluir">Excluir</a></td>
			      </tr>
				</c:forEach>
			    </tbody>
			    <tfoot>
			      <tr>
			        <th>Id</th>
			        <th>QntdLugares</th>
			        <th>CadeiraEspecial</th>
			        <th>PreçoMesa</th>
			        <th>ArCondicionado</th>
			        <th>VelaRomantica</th>
			        <th>IluminacaoEspecial</th>
			        <th></th>
			      </tr>
			    </tfoot>
		  	</table>
		</c:if>
		
		<c:if test="${empty mesaInternaLista}">
	  		<p>Não existem mesas Internas cadastradas</p>            
	  	</c:if>
	</div>
</body>
</html>