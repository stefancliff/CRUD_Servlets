package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewCoursesServlet")
public class ViewCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewCoursesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<head><link rel=\"stylesheet\" href=\"index.css\"></head>");
		out.println("<a href='index.html'> Back to the Main Page</a>");
		out.println("<h1>Courses List</h1>");
		
		List<Emp> list = EmpDao.getAllCourses();
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>Course ID</th> <th>Course Name</th>");
		
		for(Emp e:list) {
			
			out.print("<tr><td>"+ e.getCourseID() + "</td><td>" + e.getCourseName());
		}
		out.print("</table>");
		out.close();
	}

	
	
}
