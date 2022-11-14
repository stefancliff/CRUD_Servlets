package rs.ac.singidunum;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProfessorServlet")
public class DeleteProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteProfessorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request.getParameter("id");  
        int id = Integer.parseInt(sid);  
        EmpDao.deleteProfessors(id);  
        response.sendRedirect("ViewProfessorServlet"); 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
