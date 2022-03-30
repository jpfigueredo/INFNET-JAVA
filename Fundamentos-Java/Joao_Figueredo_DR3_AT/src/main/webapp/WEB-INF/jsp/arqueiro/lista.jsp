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

		<h4>Cadastramento dos arqueiros:</h4>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
			  <strong>Confirmação!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty arqueiroLista}">
		  	<p>Quantidade de arqueiros registrados: ${arqueiroLista.size()}</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Id</th>
			        <th>Agilidade</th>
			        <th>Dextreza</th>
			        <th>Sorte</th>
			        <th>Habilidades a distancia</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach var="p" items="${arqueiroLista}">
			      <tr>
			        <td>${p.id}</td>
			        <td>${p.agilidade}</td>
			        <td>${p.dextreza}</td>
			        <td>${p.sorte}</td>
			        <td>${p.rangedSkills}</td>
			        <td><a href="/local/${p.id}/excluir"> Excluir</a></td>
			      </tr>
				</c:forEach>
			    </tbody>
			    <tfoot>
			      <tr>
			        <th>Id</th>
			        <th>Agilidade</th>
			        <th>Dextreza</th>
			        <th>Sorte</th>
			        <th>Habilidades a distancia</th>
			        <th></th>
			      </tr>
			    </tfoot>
		  	</table>
		</c:if>
		
		<c:if test="${empty arqueiroLista}">
	  		<p>Não existem arqueiros registrados</p>            
	  	</c:if>
	</div>
</body>
</html>