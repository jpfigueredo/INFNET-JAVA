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
	
		<form action="/guerreiro/incluir" method="post">
			<h2>Registro de Guerreiro</h2>
	
			
			<div class="form-group">
				<label>Força:</label>
				<input type="text" class="form-control" name="qntdLugares" value="4"> 
			</div>

			<div class="form-group">
				<label>Resistencia:</label>
				<input type="text" class="form-control" name="cadeiraEspecial" value="false"> 
			</div>

			<div class="form-group">
				<label>Defesa:</label>
				<input type="text" class="form-control" name="preçoMesa" value="100"> 
			</div>
			
			<div class="form-group">
				<label>BebidaAlcoolica:</label>
				<input type="text" class="form-control" name="bebidaAlcoolica" value="Vodka"> 
			</div>

			<div class="form-group">
				<label>Habilidades Físicas:</label>
				
				<div class="checkbox">
				  <label><input type="text" name="shotsAlcoolicos" value="2" checked>ShotsAlcoolicos </label>
				</div>				
				<div class="checkbox">
				  <label><input type="text" name="petisco" value="Batata Frita" checked>Petisco </label>
				</div>				
			</div>

			<button type="submit">Registrar</button>
		</form>		
	</div>
</body>
</html>