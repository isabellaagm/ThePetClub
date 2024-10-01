package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Colaborador;
import repository.ColaboradorDAO;

/**
 * Servlet implementation class NovoTutorServlet
 */
@WebServlet("/NovoColaboradorServlet")
public class NovoColaboradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ColaboradorDAO dao = new ColaboradorDAO();
		

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");

		Colaborador colaborador = new Colaborador(0,nome,cpf,senha);
		dao.insert(colaborador);
		
		RequestDispatcher rd = request.getRequestDispatcher("/menu.jsp");
		rd.forward(request, response);

	}

}
