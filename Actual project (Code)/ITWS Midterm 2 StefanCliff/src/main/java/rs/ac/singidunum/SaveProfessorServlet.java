package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveProfessorServlet")
public class SaveProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveProfessorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String ProfessorFName = request.getParameter("ProfessorFName");
		String ProfessorLName = request.getParameter("ProfessorLName");
		String ProfessorEmail = request.getParameter("ProfessorEmail");
		String ProfessorCourse = request.getParameter("ProfessorCourse");
		
		Emp e = new Emp();
		
		e.setProfessorFName(ProfessorFName);
		e.setProfessorLName(ProfessorLName);
		e.setProfessorEmail(ProfessorEmail);
		e.setProfessorCourse(ProfessorCourse);
		
		int status = EmpDao.saveProfessors(e);
		
		if(status>0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
			out.println("Sorry, there was an error in saving this record!");
		}
			
		out.close();
	}

}
