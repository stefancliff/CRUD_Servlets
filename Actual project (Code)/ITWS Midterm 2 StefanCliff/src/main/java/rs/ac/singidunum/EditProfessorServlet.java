package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditProfessorServlet")
public class EditProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditProfessorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Update the Professor</h1>");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		
		Emp e = EmpDao.getProfessorsById(id);
		
		out.print("<form action='SaveProfessorServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getProfessorID()+"'/></td></tr>");  
        out.print("<tr><td>First Name:</td><td><input type='text' name='ProfessorFName' value='"+e.getProfessorFName()+"'/></td></tr>");  
        out.print("<tr><td>Last Name:</td><td><input type='text' name='ProfessorLName' value='"+e.getProfessorLName()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='ProfessorEmail' value='"+e.getProfessorEmail()+"'/></td></tr>");  
        out.print("<tr><td>Select the Course:</td><td>");  
        out.print("<select name='ProfessorCourse' style='width:150px'>");  
        out.print("<option>SDE</option>");  
        out.print("<option>IT</option>");  
        out.print("<option>Management</option>");  
        out.print("<option>Sports</option>"); 
        out.print("<option>Mathematics</option>");  
        out.print("</select>");  
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
