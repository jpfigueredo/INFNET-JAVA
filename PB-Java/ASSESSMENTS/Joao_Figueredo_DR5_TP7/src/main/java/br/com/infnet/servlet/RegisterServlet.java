package br.com.infnet.servlet;

import java.io.IOException;

import br.com.infnet.model.User;
import br.com.infnet.repository.PasswordRepository;
import br.com.infnet.repository.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "novoCadastroServlet", urlPatterns = { "/novoCadastroServlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String confirmaSenha = request.getParameter("confirmaSenha");

		User user = PasswordRepository.validate(senha, confirmaSenha);
		if (user == null) {
			request.setAttribute("msg", "Os campos não podem ser nulos.");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else{

			user.setNome(nome);
			user.setEmail(email);

			UserRepository.doAdd(user);

			request.setAttribute("nome", user.getNome());
			request.setAttribute("email", user.getEmail());
			request.setAttribute("usersList", UserRepository.getList());

			request.getRequestDispatcher("usersList.jsp").forward(request, response);
//			response.sendRedirect("usersList.jsp");

		}
	}
}
