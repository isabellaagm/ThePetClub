package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Servico;
import repository.AnimalDAO;
import repository.ServicoDAO;

@WebServlet("/NovoServicoServlet")
public class NovoServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServicoDAO dao = new ServicoDAO();
		AnimalDAO animalDAO= new AnimalDAO();

		String servico = request.getParameter("servico");
		int idAnimal = Integer.parseInt(request.getParameter("animal"));
		String data = request.getParameter("data");
		
		dao.insert(new Servico(0,idAnimal,data,servico));
		
		request.setAttribute("animal", animalDAO.selectById(idAnimal));
		request.setAttribute("servicos", dao.selectByIdAnimal(idAnimal));
		
		RequestDispatcher rd = request.getRequestDispatcher("/perfilPet.jsp");
		rd.forward(request, response);

	}
    

}
