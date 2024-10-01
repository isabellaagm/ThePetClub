package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import model.Tutor;
import repository.AnimalDAO;
import repository.TutorDAO;

/**
 * Servlet implementation class NovoTutorPet
 */
@WebServlet("/NovoTutorPet")
public class NovoTutorPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TutorDAO tutorDAO = new TutorDAO();
		AnimalDAO dao = new AnimalDAO();

		String nomeT = request.getParameter("nomeT");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		String nome = request.getParameter("nome");
		
		String raca = request.getParameter("raca");
		String cor = request.getParameter("cor");
		int idade = Integer.parseInt(request.getParameter("idade"));
		String genero = request.getParameter("opcao-genero");

		Tutor tutor = new Tutor(0,nomeT,endereco,telefone,cpf,senha);
		
		tutor=tutorDAO.insert(tutor);
		int idTutor = tutor.getIdTutor();
		
		dao.insert(new Animal(0,idTutor,nome,raca,cor,idade,genero));
		request.setAttribute("tutor", tutor);
		RequestDispatcher rd = request.getRequestDispatcher("/perfilTutor.jsp");
		rd.forward(request, response);

	}

}
