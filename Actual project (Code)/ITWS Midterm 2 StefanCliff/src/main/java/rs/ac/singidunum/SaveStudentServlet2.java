package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveStudentServlet2")
public class SaveStudentServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveStudentServlet2() {
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
		int StudentID = Integer.parseInt(sid);
		String StudentFName = request.getParameter("StudentFName");
		String StudentLName = request.getParameter("StudentLName");
		String StudentEmail = request.getParameter("StudentEmail");
		String StudentCourse = request.getParameter("StudentCourse");
		
		Emp e = new Emp();
		e.setStudentID(StudentID);
		e.setStudentFName(StudentFName);
		e.setStudentLName(StudentLName);
		e.setStudentEmail(StudentEmail);
		e.setStudentCourse(StudentCourse);
		
		int status = EmpDao.updateStudents(e);
		
		if(status>0) {
			response.sendRedirect("ViewStudentServlet");
		}
		else {
			out.println("Sorry, there was an error in saving this record!");
		}
			
		out.close();
	}

}
