package rs.ac.singidunum;

public class Emp {
	
	private int StudentID, StudentCourseID;
	private String StudentFName, StudentLName, StudentEmail, StudentCourse;
	
	private int ProfessorID, ProfessorCourseID;
	private String ProfessorFName, ProfessorLName, ProfessorEmail, ProfessorCourse;
	
	private int CourseID, CourseStudentID, CourseProfessorID;
	private String CourseName;
	
	
	
	// STUDENT Getters and Setters
	
	public int getStudentID() {
		return StudentID;
	}
	
	public void setStudentID(int StudentID) {
		this.StudentID = StudentID;
	}
	
	public int getStudentCourseID() {
		return StudentCourseID;
	}
	
	public void setStudentCourseID(int StudentCourseID) {
		this.StudentCourseID = StudentCourseID;
	}
	
	public String getStudentCourse() {
		return StudentCourse;
	}
	
	public void setStudentCourse(String StudentCourse) {
		this.StudentCourse = StudentCourse;
	}
	
	public String getStudentFName() {
		return StudentFName;
	}
	
	public void setStudentFName(String StudentFName) {
		this.StudentFName = StudentFName;
	}
	
	public String getStudentLName() {
		return StudentLName;
	}
	
	public void setStudentLName(String StudentLName) {
		this.StudentLName = StudentLName;
	}
	
	public String getStudentEmail() {
		return StudentEmail;
	}
	
	public void setStudentEmail(String StudentEmail) {
		this.StudentEmail = StudentEmail;
	}
	
	
	// PROFESSOR Getters and Setters
	
	public int getProfessorID() {
		return ProfessorID;
	}
	
	public void setProfessorID(int ProfessorID) {
		this.ProfessorID = ProfessorID;
	}
	
	public int getProfessorCourseID() {
		return ProfessorCourseID;
	}
	
	public void setProfessorCourseID(int ProfessorCourseID) {
		this.StudentCourseID = ProfessorCourseID;
	}
	
	public String getProfessorCourse() {
		return ProfessorCourse;
	}
	
	public void setProfessorCourse(String ProfessorCourse) {
		this.ProfessorCourse = ProfessorCourse;
	}
	
	public String getProfessorFName() {
		return ProfessorFName;
	}
	
	public void setProfessorFName(String ProfessorFName) {
		this.ProfessorFName = ProfessorFName;
	}
	
	public String getProfessorLName() {
		return ProfessorLName;
	}
	
	public void setProfessorLName(String ProfessorLName) {
		this.ProfessorLName = ProfessorLName;
	}
	
	public String getProfessorEmail() {
		return ProfessorEmail;
	}
	
	public void setProfessorEmail(String ProfessorEmail) {
		this.ProfessorEmail = ProfessorEmail;
	}

	
	// COURSE Getters and Setters
	
	
	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int courseID) {
		this.CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}

	public int getCourseStudentID() {
		return CourseStudentID;
	}

	public void setCourseStudentID(int courseStudentID) {
		this.CourseStudentID = courseStudentID;
	}

	public int getCourseProfessorID() {
		return CourseProfessorID;
	}

	public void setCourseProfessorID(int courseProfessorID) {
		this.CourseProfessorID = courseProfessorID;
	}
}
