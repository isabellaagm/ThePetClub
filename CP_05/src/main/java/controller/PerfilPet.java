package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import repository.AnimalDAO;
import repository.ServicoDAO;
import repository.TutorDAO;



@WebServlet("/PerfilPet")
public class PerfilPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AnimalDAO dao = new AnimalDAO();
		TutorDAO tutorDAO = new TutorDAO();
		ServicoDAO ServicoDAO = new ServicoDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		Animal animal=dao.selectById(id);
		

		request.setAttribute("animal", animal);
		request.setAttribute("servicos", ServicoDAO.selectByIdAnimal(id));
		request.setAttribute("tutor", tutorDAO.selectById(animal.getIdTutor()));
		RequestDispatcher rd = request.getRequestDispatcher("/perfilPet.jsp");
		rd.forward(request, response);

	}


}
