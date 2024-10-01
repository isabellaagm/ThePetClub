package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.AnimalDAO;

/**
 * Servlet implementation class ListaTutores
 */
@WebServlet("/ListaPets")
public class ListaPets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AnimalDAO animalDAO = new AnimalDAO();
		
		
		request.setAttribute("animais", animalDAO.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("/clientesPets.jsp");
		rd.forward(request, response);

	}
}
