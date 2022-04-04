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
		<form action="/vacancyApplicant/add" method="POST">
			<h2>Vacancies:</h2>
		
			<div class="form-group">
				<label>Applicant:</label>
				<select name="applicant.id" class="form-control">
					<c:forEach var="a" items="${applicantList}">
						<option value="${a.id}">${a.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Vacancies:</label>
				
				<c:forEach var="v" items="${vacancyList}">
					<div class="checkbox">
					  <label><input type="checkbox" name="idVacancies" value="${v.id}" checked> ${v.role}</label>
					</div>
				</c:forEach>	
			</div>
			<button type="submit">Register</button>
		</form>
	</div>
    <form action="/" method="GET">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
    </form>
</body>
</html>
