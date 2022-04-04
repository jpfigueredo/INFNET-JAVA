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
		<h4>Company registration:</h4>
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
				<strong>Confirmation!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty usersList}">
			<p>Number of companies registered: ${usersList.size()}</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Type</th>
						<th>CNPJ</th>
						<th>Applicants</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="u" items="${usersList}">
						<tr>
							<td>${u.name}</td>
							<td>${u.email}</td>
							<td>${u.type}</td>
							<td>${u.cnpj}</td>
							<td>${u.applicants}</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Type</th>
						<th>CNPJ</th>
						<th>Applicants</th>
						<th></th>
					</tr>
				</tfoot>
			</table>
		</c:if>
		<c:if test="${empty usersList}">
			<p>There are no companies registered</p>
		</c:if>
	</div>
    <form action="/" method="GET">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
    </form>
</body>
</html>