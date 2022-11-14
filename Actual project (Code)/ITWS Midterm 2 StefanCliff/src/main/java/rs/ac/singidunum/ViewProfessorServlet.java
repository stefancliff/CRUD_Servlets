package rs.ac.singidunum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewProfessorServlet
 */
@WebServlet("/ViewProfessorServlet")
public class ViewProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProfessorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<head><link rel=\"stylesheet\" href=\"index.css\"></head>");
		out.println("<a href='index.html'> Back to Main Page</a>");
		out.println("<h1>Professor List</h1>");
		
		List<Emp> list = EmpDao.getAllProfessors();
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>Professor ID</th> <th>First Name</th> <th>Last Name</th> <th>Email</th> <th>Course</th> <th>Edit/Update</th> <th>Delete</th>");
		
		for(Emp e:list) {
			
			out.print("<tr><td>"+ e.getProfessorID() + "</td><td>" + e.getProfessorFName() + "</td><td>" + e.getProfessorLName() + "</td><td>" + e.getProfessorEmail()+ "</td><td>" + e.getProfessorCourse() +
					"</td><td><a href ='EditProfessorServlet?id=" + e.getProfessorID() +
					"'>edit</a></td><td><a href='DeleteProfessorServlet?id=" + e.getProfessorID()+"'>delete</a></td><tr>");
		}
		out.print("</table>");
		out.close();
	}

	

}
