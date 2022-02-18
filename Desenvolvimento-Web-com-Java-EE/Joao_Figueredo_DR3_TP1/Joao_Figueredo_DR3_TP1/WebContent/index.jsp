<%@page import="java.util.List"%>
<%@page import="br.com.infnet.model.User"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>FormTP1</title>
</head>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<form action="RegisterServlet" method="post">
		<section class="vh-100" style="background-color: #eee;">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-lg-12 col-xl-11">
						<div class="card text-black" style="border-radius: 25px;">
							<div class="card-body p-md-5">
								<div class="row justify-content-center">
									<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

										<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
											up</p>

										<form class="mx-1 mx-md-4">

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-user fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<input type="text" id="form3Example1c" class="form-control"
														name="nome" /> <label class="form-label"
														for="form3Example1c">Your Name</label>
												</div>
											</div>

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<input type="email" id="form3Example3c" name="email"
														class="form-control" /> <label class="form-label"
														for="form3Example3c">Your Email</label>
												</div>
											</div>

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<input type="password" id="form3Example4c" name="senha"
														class="form-control" /> <label class="form-label"
														for="form3Example4c">Password</label>
												</div>
											</div>

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-key fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<input type="password" id="form3Example4cd"
														name="confirmaSenha" class="form-control" /> <label
														class="form-label" for="form3Example4cd">Repeat
														your password</label>
												</div>
											</div>

											<div class="form-check d-flex justify-content-center mb-5">
												<label class="form-check-label" for="form2Example3">
													<%if(msg != null){%>
														<div class="alert alert-danger" role="alert">
														  <strong>Atenção!</strong> <%=msg%>
														</div>
													<%}%>
												</label>
											</div>

											<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
												<button type="submit" class="btn btn-primary btn-lg">Register</button>
											</div>
										</form>
									</div>
									<div
										class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

										<img
											src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
											class="img-fluid" alt="Sample image">

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>

</body>
</html>