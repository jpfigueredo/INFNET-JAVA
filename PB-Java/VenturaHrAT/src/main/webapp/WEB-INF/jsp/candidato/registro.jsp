<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
	<title>ProjetoJava</title>
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">   
  </head>
<body>

	<header class="masthead">
    <div class="container px-4 px-lg-5 h-100">
	<c:import url="/WEB-INF/jsp/home.jsp"/>
	</div>
	</header>

	<div class="container">
	
		<form action="/usuario/incluir" method="post">
		
			<h2>Registro de usuario</h2>
	
			
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="nome" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="endereço" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="Telefone" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="email" class="form-control" name="email" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="password" class="form-control" name="senha" value=""> 
			</div>
			<div class="form-group">
				<label>QntdLugares:</label>
				<input type="text" class="form-control" name="cpf" value=""> 
			</div>
		
			<button type="submit">Registrar</button>

</body>
</html>