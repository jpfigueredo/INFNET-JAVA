<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>PB JAVA</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form action="/vacancy/add" method="POST">
			<h2>Vacancies registration</h2>
			<div class="form-group">
				<label>Role:</label> <input type="text" class="form-control"
					name="role" value="junior">
			</div>

			<div class="form-group">
				<label>City:</label> <input type="text" class="form-control"
					name="city" value="RJ">
			</div>

			<div class="form-group">
				<label>Hiring Type:</label> <input type="text" class="form-control"
					name="hiringModel" value="CLT">
			</div>
			
			<div class="form-group">
				<label>Description:</label> <input type="text" class="form-control"
					name="description" value="Junior Java Developer">
			</div>
			<button type="submit">Register</button>
		</form>
	</div>
    <form action="/" method="GET">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
    </form>
</body>
</html>