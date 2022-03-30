<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>


<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-center"id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="/login">Home<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="/vagas">Vagas</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/usuarios">Usuarios</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/criterios">Criterios</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/candidatos">Candidatos</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/empresas">Empresas</a>
					</li>
				</ul>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col=12 mt-3">
					<div class="jumbotron ">
						<h1 class="display-4">Hello, world!</h1>
						<p class="lead">This is a simple hero unit, a simple
							jumbotron-style component for calling extra attention to featured
							content or information.</p>
						<hr class="my-4">
						<p>It uses utility classes for typography and spacing to space
							content out within the larger container.</p>
						<p class="lead">
							<a class="btn btn-primary btn-lg" href="#" role="button">Learn
								more</a>
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Special title treatment</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Special title treatment</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<footer class="bg-dark">
		<div class="container">
			<div class="row">
				<div class="col=12 justify-content-center">
					<ul class="nav ">
						<li class="nav-item"><a class="nav-link active" href="#">Active</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
</body>