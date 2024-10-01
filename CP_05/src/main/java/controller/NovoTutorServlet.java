package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tutor;
import repository.AnimalDAO;
import repository.TutorDAO;

/**
 * Servlet implementation class NovoTutorServlet
 */
@WebServlet("/NovoTutorServlet")
public class NovoTutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TutorDAO tutorDAO = new TutorDAO();
		AnimalDAO dao = new AnimalDAO();
		

		String nomeT = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");

		Tutor tutor = new Tutor(0,nomeT,endereco,telefone,cpf,senha);
		tutor=tutorDAO.insert(tutor);
		
		request.setAttribute("tutor", tutor);
		request.setAttribute("animais", dao.selectByTutorId(tutor.getIdTutor()));
		RequestDispatcher rd = request.getRequestDispatcher("/perfilTutor.jsp");
		rd.forward(request, response);

	}

}
