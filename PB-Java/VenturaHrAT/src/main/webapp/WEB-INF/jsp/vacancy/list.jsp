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
	<div class="container fixed-top">
		<h4>Vacancies registration:</h4>
		<form action="/vacancy" method="GET">
			<button type="submit">New vacancy</button>
		</form>

		<c:if test="${not empty msg}">
			<div class="alert alert-success">
				<strong>Confirmation!</strong> ${msg}
			</div>
		</c:if>
		<c:if test="${not empty vacancyList}">
			<p>Number of vacancies registered: ${vacancyList.size()}</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>id</th>
						<th>Role</th>
						<th>City</th>
						<th>Hiring Type</th>
						<th>Description</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="v" items="${vacancyList}">
						<tr>
							<td>${v.id}</td>
							<td>${v.role}</td>
							<td>${v.city}</td>
							<td>${v.hiringModel}</td>
							<td>${v.description}</td>
                        </tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th>id</th>
						<th>Role</th>
						<th>City</th>
						<th>Hiring Type</th>
						<th>Description</th>
						<th></th>
					</tr>
				</tfoot>
			</table>
		</c:if>
		<c:if test="${empty vacancyList}">
			<p>There are no vacancies registered!</p>
		</c:if>
	</div>
    <form action="/" method="GET">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
    </form>
</body>
</html>