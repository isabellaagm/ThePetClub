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
import repository.TutorDAO;



@WebServlet("/NovoPetServlet")
public class NovoPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AnimalDAO dao = new AnimalDAO();
		TutorDAO tutorDAO = new TutorDAO();
		
		String nome = request.getParameter("nome");
		int idTutor = Integer.parseInt(request.getParameter("tutor"));
		String raca = request.getParameter("raca");
		String cor = request.getParameter("cor");
		int idade = Integer.parseInt(request.getParameter("idade"));
		String genero = request.getParameter("opcao-genero");
		
		Animal animal = new Animal(0,idTutor,nome,raca,cor,idade,genero);
		dao.insert(animal);
		
		request.setAttribute("animal", animal);
		request.setAttribute("tutor", tutorDAO.selectById(idTutor));
		RequestDispatcher rd = request.getRequestDispatcher("/perfilPet.jsp");
		rd.forward(request, response);

	}


}
