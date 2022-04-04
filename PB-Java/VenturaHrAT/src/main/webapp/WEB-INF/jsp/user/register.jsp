<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
	<title>PB JAVA</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
<body>
	<div class="container">
		<form action="/user/add" method="POST">
			<h2>Company registration</h2>
			<div class="form-group">
				<label>Nome:</label>
				<input type="text" class="form-control" name="name" value="Joao Figueredo">
			</div>
			
			<div class="form-group">
				<label>Email:</label>
				<input type="email" class="form-control" name="email" value="joao@pedro.com">
			</div>
			
			<div class="form-group">
				<label>Password:</label>
				<input type="password" class="form-control" name="password" value="batata123">
			</div>
			
			<div class="form-group">
				<label>Type:</label>
				<input type="text" class="form-control" name="type" value="IT Company">
			</div>
			
			<div class="form-group">
				<label>CNPJ:</label>
				<input type="text" class="form-control" name="cnpj" value="78.456.123/0001-11">
			</div>
			<button type="submit">Register</button>
		</form>
	</div>
	    <form action="/" method="GET">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
        </form>
</body>
</html>