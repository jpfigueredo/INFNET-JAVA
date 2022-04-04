<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
	  <h2>Registration system</h2>

		<c:if test="${not empty msg}">
			<div class="alert alert-warning">
			  <strong>Atention!</strong> ${msg}
			</div>
		</c:if>

	  <form action="/login" method="POST">
	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Enter email" name="email" value="">
	    </div>
	    <div class="form-group">
	      <label>Password:</label>
	      <input type="password" class="form-control" placeholder="Enter password" name="password" value="">
	    </div>
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Enter</button>
	  </form>
	</div>
	  <form action="/" method>
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Return to Home page</button>
      </form>
</body>
</html>