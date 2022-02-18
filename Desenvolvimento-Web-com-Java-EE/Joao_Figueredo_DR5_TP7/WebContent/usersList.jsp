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
<title>Users List</title>
</head>
<%
List<User> userList = (List<User>) request.getAttribute("usersList");
int qtde = userList.size();
%>
<body>
	<form action="RegisterServlet" method="get">

		<div>
			<%
			if (qtde > 0) {
			%>
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">#</th>
						<th scope="col">Nome</th>
						<th scope="col">Email</th>
						<th scope="col">Senha</th>
					</tr>
				</thead>
				<tbody>
					<%
					for (User user : userList) {
					%>
					<tr>
						<th scope="row">1</th>
						<td><%=user.getNome()%></td>
						<td><%=user.getEmail()%></td>
						<td><%=user.getSenha()%></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
			<%
			} else {
			%>
			<p>N/A</p>
			<%
			}
			%>
			<div align="center" class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
				<button type="submit" class="btn btn-primary btn-lg">Voltar</button>
			</div>
		</div>
	</form>
</body>
</html>