package rs.ac.singidunum;

import java.util.*;  
import java.sql.*;  
  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        
        try {  
        	String url = "jdbc:mysql://localhost:3306/itws_midterm2_sc";
    	    String username = "root";
    	    String password = "";
    	    
    	Class.forName("com.mysql.jdbc.Driver");  
    	 con=DriverManager.getConnection(url, username, password); 
        	
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    
    
    
 //                              STUDENTS START HERE
    
    
    
    public static int saveStudents(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Students (First_Name,Last_Name,email,CourseName) values (?,?,?,?)");  
            ps.setString(1,e.getStudentFName());  
            ps.setString(2,e.getStudentLName());  
            ps.setString(3,e.getStudentEmail());  
            ps.setString(4,e.getStudentCourse());  
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int updateStudents(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update Students set First_Name=?,Last_Name=?,email=?,CourseName=? where id=?");  
            ps.setString(1,e.getStudentFName());  
            ps.setString(2,e.getStudentLName());  
            ps.setString(3,e.getStudentEmail());  
            ps.setString(4,e.getStudentCourse());  
            ps.setInt(5,e.getStudentID());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int deleteStudents(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from Students where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    public static Emp getStudentById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Students where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setStudentID(rs.getInt(1));  
                e.setStudentFName(rs.getString(2));  
                e.setStudentLName(rs.getString(3));  
                e.setStudentEmail(rs.getString(4));  
                e.setStudentCourse(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
    
    public static List<Emp> getAllStudents(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Students");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setStudentID(rs.getInt(1));  
                e.setStudentFName(rs.getString(2));  
                e.setStudentLName(rs.getString(3));  
                e.setStudentEmail(rs.getString(4));  
                e.setStudentCourse(rs.getString(5));   
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    
    
//                               PROFESSORS START HERE
    
    
    
    public static int saveProfessors(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Professors (First_Name,Last_Name,Email,CourseName) values (?,?,?,?)");  
            ps.setString(1,e.getProfessorFName());  
            ps.setString(2,e.getProfessorLName());  
            ps.setString(3,e.getProfessorEmail());  
            ps.setString(4,e.getProfessorCourse());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int updateProfessors(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update Professors set First_Name=?,Last_Name=?,email=?,CourseName=? where id=?");  
            ps.setString(1,e.getProfessorFName());  
            ps.setString(2,e.getProfessorLName());  
            ps.setString(3,e.getProfessorEmail());  
            ps.setString(4,e.getProfessorCourse());    
            ps.setInt(5,e.getProfessorID());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int deleteProfessors(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from Professors where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    public static Emp getProfessorsById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Professors where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setProfessorID(rs.getInt(1));  
                e.setProfessorFName(rs.getString(2));  
                e.setProfessorLName(rs.getString(3));  
                e.setProfessorEmail(rs.getString(4));  
                e.setProfessorCourse(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
    public static List<Emp> getAllProfessors(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Professors");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setProfessorID(rs.getInt(1));  
                e.setProfessorFName(rs.getString(2));  
                e.setProfessorLName(rs.getString(3));  
                e.setProfessorEmail(rs.getString(4));  
                e.setProfessorCourse(rs.getString(5));   
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    } 
  


//                               COURSES START HERE

public static List<Emp> getAllCourses(){  
    List<Emp> list=new ArrayList<Emp>();  
      
    try{  
        Connection con=EmpDao.getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Courses");  
        ResultSet rs=ps.executeQuery(); 
        
        while(rs.next()){  
            Emp e=new Emp();  
            e.setCourseID(rs.getInt(1));  
            e.setCourseName(rs.getString(2));  
            e.setCourseProfessorID(rs.getInt(3));  
            e.setCourseStudentID(rs.getInt(4));     
            list.add(e);  
        }  
        con.close();  
    }catch(Exception e){e.printStackTrace();}  
      
    return list;  
} 
}
