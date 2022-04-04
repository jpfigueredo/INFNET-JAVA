<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
	<title>PB JAVA</title>
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">   
  </head>
<body>
	<div class="container">
		<form action="/applicant/add" method="POST">
			<h2>Users Registration</h2>
			<div class="form-group">
				<label>Name:</label>
				<input type="text" class="form-control" name="name" value="">
			</div>
			<div class="form-group">
				<label>Email:</label>
				<input type="email" class="form-control" name="email" value=""> 
			</div>
			<div class="form-group">
				<label>CPF:</label>
				<input type="text" class="form-control" name="cpf" value=""> 
			</div>
			<div class="form-group">
				<label>Phone:</label>
				<input type="text" class="form-control" name="phone" value="">
			</div>
			<div class="form-group">
				<label>Address:</label>
				<input type="text" class="form-control" name="address" value="">
			</div>
			<button type="submit">Register</button>
		</form>
    </div>
    <div>
        <form action="/" method="GET">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
        </form>
    </div>
</body>
</html>