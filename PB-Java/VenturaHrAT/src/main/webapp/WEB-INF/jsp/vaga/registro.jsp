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
	<c:import url="/WEB-INF/jsp/home.jsp"/>
	</div>
	</header>

	<div class="container">
	
		<form action="/vaga/incluir" method="post">
		
			<h2>Registro de vagas</h2>
	
			
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="Cargo" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="Cidade" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="FormaContratação" value=""> 
			</div>
			

			<button type="submit">Registrar</button>

</body>
</html>