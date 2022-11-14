package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<head><link rel=\"stylesheet\" href=\"index.css\"></head>");
		out.println("<a href='index.html'> Back to Main Page</a>");
		out.println("<h1>Student List</h1>");
		
		List<Emp> list = EmpDao.getAllStudents();
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>Student ID</th> <th>First Name</th> <th>Last Name</th> <th>Email</th> <th>Course</th> <th>Edit/Update</th> <th>Delete</th>");
		
		for(Emp e:list) {
			
			out.print("<tr><td>"+ e.getStudentID() + "</td><td>" + e.getStudentFName() + "</td><td>" + e.getStudentLName() + "</td><td>" + e.getStudentEmail()
					+ "</td><td>" + e.getStudentCourse() + "</td><td><a href ='EditStudentServlet?id=" + e.getStudentID() +
					"'>edit</a></td><td><a href='DeleteStudentServlet?id=" + e.getStudentID()+"'>delete</a></td><tr>");
		}
		out.print("</table>");
		out.close();
		
	}

	
	

}
