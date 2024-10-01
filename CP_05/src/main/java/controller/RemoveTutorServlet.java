package controller;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/RemoverTutor")
public class RemoveTutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		AnimalDAO animalDAO = new AnimalDAO();
		ServicoDAO servicoDAO = new ServicoDAO();
		TutorDAO tutorDAO = new TutorDAO();

		List<Animal> lista = animalDAO.selectByTutorId(id);
		
		for(Animal animal : lista) {

			servicoDAO.deleteByAnimalId(animal.getIdAnimal());
			animalDAO.delete(animal.getIdAnimal());
		}
		
		servicoDAO.deleteByAnimalId(id);
		tutorDAO.delete(id);
		request.setAttribute("tutores", tutorDAO.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("/clientesTutores.jsp");
		rd.forward(request, response);

	}

}
