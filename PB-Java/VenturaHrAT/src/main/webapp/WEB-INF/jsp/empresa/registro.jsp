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
	
		<form action="/cliente/incluir" method="post">
			<h2>Registro de Clientes</h2>
		
			<div class="form-group">
				<label>Nome:</label>
				<input type="text" class="form-control" name="nome" value="Rafael Loureiro"> 
			</div>
			
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email" class="form-control" name="email" value="rafa@rafa.com">
			</div>
			
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" class="form-control" name="senha" value="0000"> 
			</div>

			<button type="submit">Registrar</button>
		</form>	
	
	</div>
</body>
</html>