package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.AnimalDAO;
import repository.ServicoDAO;

@WebServlet("/RemoverPet")
public class RemovePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		AnimalDAO animalDAO = new AnimalDAO();
		ServicoDAO servicoDAO = new ServicoDAO();

		servicoDAO.deleteByAnimalId(id);
		animalDAO.delete(id);
		
		request.setAttribute("animais", animalDAO.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("/clientesPets.jsp");
		rd.forward(request, response);

	}

}
