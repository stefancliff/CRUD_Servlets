package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveProfessorServlet2")
public class SaveProfessorServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveProfessorServlet2() {
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
		
		String sid = request.getParameter("id");
		int ProfessorID = Integer.parseInt(sid);
		String ProfessorFName = request.getParameter("ProfessorFName");
		String ProfessorLName = request.getParameter("ProfessorLName");
		String ProfessorEmail = request.getParameter("ProfessorEmail");
		String ProfessorCourse = request.getParameter("ProfessorCourse");
		
		Emp e = new Emp();
		
		e.setProfessorID(ProfessorID);
		e.setProfessorFName(ProfessorFName);
		e.setProfessorLName(ProfessorLName);
		e.setProfessorEmail(ProfessorEmail);
		e.setProfessorCourse(ProfessorCourse);
		
		int status = EmpDao.updateProfessors(e);
		
		if(status>0) {
			response.sendRedirect("ViewProfessorServlet");
		}
		else {
			out.println("Sorry, there was an error in saving this record!");
		}
			
		out.close();
	}

}
