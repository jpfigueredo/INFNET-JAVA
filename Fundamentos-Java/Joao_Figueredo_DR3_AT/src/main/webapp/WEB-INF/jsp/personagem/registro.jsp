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

	<header class="masthead">
    <div class="container px-4 px-lg-5 h-100">
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	</div>
	</header>

	<div class="container">
	
		<form action="/personagem/incluir" method="post">
			<h2>Registro de Personagem</h2>
		
			
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="qntdLugares" value="2"> 
			</div>

			<div class="form-group">
				<label>CadeiraEspecial:</label>
				<input type="text" class="form-control" name="cadeiraEspecial" value="false"> 
			</div>

			<div class="form-group">
				<label>PreçoMesa:</label>
				<input type="text" class="form-control" name="preçoMesa" value="80"> 
			</div>

			<div class="form-group">
				<label>Musico:</label>
				<input type="text" class="form-control" name="musico" value="Lennon"> 
			</div>


			<div class="form-group">
				<label>Designações: </label>
				
				<div class="checkbox">
				  <label><input type="checkbox" name="qntdVentiladores" value="4" checked> QntdVentiladores</label>
				</div>
				<div class="checkbox">
				  <label><input type="checkbox" name="cadeiraAcolchoada" value="false" checked> CadeiraAcolchoada</label>
				</div>					
			</div>

			<button type="submit">Registrar</button>
		</form>		
	</div>
</body>
</html>