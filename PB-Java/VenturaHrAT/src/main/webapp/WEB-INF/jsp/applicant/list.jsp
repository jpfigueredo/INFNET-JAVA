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
	<div class="container fixed-top" >
		<h4>Applicant register:</h4>
		<form action="/applicant" method="GET">
			<button type="submit">New Applicant</button>
		</form>

		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Confirmation!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty applicantList}">
		  	<p>Number of registered applicants: ${applicantList.size()}</p>
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Name</th>
			        <th>CPF</th>
			        <th>Address</th>
			        <th>Email</th>
			        <th>Phone</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    <c:forEach var="c" items="${applicantList}">
			      <tr>
			        <td>${c.name}</td>
			        <td>${c.address}</td>
			        <td>${c.phone}</td>
			        <td>${c.email}</td>
			        <td>${c.cpf}</td>
			       <td><a href="/applicants/delete/${c.id}">Exclude</a></td>
			      </tr>
				</c:forEach>
			    </tbody>
			    <tfoot>
			      <tr>
			        <th>Name</th>
			        <th>CPF</th>
			        <th>Address</th>
			        <th>Email</th>
			        <th>Phone</th>
			        <th></th>
			      </tr>
			    </tfoot>
		  	</table>
		</c:if>
		<c:if test="${empty applicantList}">
	  		<p>There are no registered applicants!</p>
	  	</c:if>
	</div>
	<div>
        <form action="/" method="GET">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Return</button>
        </form>
    </div>
</body>
</html>