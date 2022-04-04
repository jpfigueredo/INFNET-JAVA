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
		<form action="/vacancyApplicant" method="get">
			<button type="submit">New Vacancy</button>
		</form>

		<c:if test="${not empty msg}">
			<div class="alert alert-success">
				<strong>Confirmation!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty vacancyApplicantList}">
			<p>Number of vacancy registered: ${vacancyApplicantList.size()}</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Applicants</th>
						<th>Vacancies</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="v" items="${vacancyApplicantList}">
						<tr>
							<td>${v.applicant.name}</td>
							<td>${v.vacancies.size()}</td>
							<td><a href="/vacancyApplicant/delete/${v.id}">Exclude</a></td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th>Applicants</th>
						<th>Vacancies</th>
					</tr>
				</tfoot>
			</table>
		</c:if>
		<c:if test="${empty vacancyApplicantList}">
			<p>There are no applicants related to vacancies registered.</p>
		</c:if>
	</div>
        <form action="/" method="GET">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
        </form>
</body>
</html>

