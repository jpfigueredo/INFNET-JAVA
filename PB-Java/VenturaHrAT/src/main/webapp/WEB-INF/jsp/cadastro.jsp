<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VENTURAHR</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<link rel="stylesheet" href="styles/styles.css">

<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<%
	boolean showFlag = false;
%>
</head>
<body>

	<div class="container">

		<div class="row">
			<div
				class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<form role="form" action="/usuario/incluir">
					<h2>Bem vindo a tela de registro</h2>
					<hr class="colorgraph">
					<div class="row"></div>
					<div class="form-group">
						<input type="email" name="email" id="email"
							class="form-control input-lg" placeholder="Endereço de email"
							tabindex="4">
					</div>
					<div class="row">
						<div class="col-xs-12 col-sm-6 col-md-6">
							<div class="form-group">
								<input type="password" name="password" id="password"
									class="form-control input-lg" placeholder="senha" tabindex="5">
							</div>
						</div>
						<Select id="isEmpresa">
							<option value="Empresa">Empresa</option>
							<option value="Candidato">Candidato</option>
						</Select>
						<div class="form-group" id="empresaAtributo">
							<input type="text" name="cnpj" id="cnpj"
								class="form-control input-lg" placeholder="cnpj" tabindex="6">
						</div>
						<div class="form-group" id="empresaAtributo">
							<input type="text" name="tipo" id="tipo"
								class="form-control input-lg" placeholder="tipo" tabindex="6">
						</div>
						<div class="form-group" id="empresaAtributo">
							<input type="text" name="cpf" id="cpf"
								class="form-control input-lg" placeholder="cpf" tabindex="6">
						</div>
					</div>
					<div class="row"></div>

					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-12 col-md-6">
							<a href="#" class="btn btn-success btn-block btn-lg">Entrar</a>
						</div>
						<p class="text-center">Não se registrou ainda?</p>
						<div class="col-xs-12 col-md-6">
							<input type="submit" value="Register"
								class="btn btn-primary btn-block btn-lg" tabindex="7">
						</div>
					</div>
				</form>
			</div>
		</div>

	</div>
	<script src="scripts/script.js"></script>
</body>
</html>