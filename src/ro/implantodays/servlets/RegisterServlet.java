package ro.implantodays.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.implantodays.utils.DBConnection;

import java.sql.*;  
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a=request.getParameter("username");  
		String b=request.getParameter("password");  
		String g=request.getParameter("email");  
		String d=request.getParameter("first");
		String e=request.getParameter("last");  
		String f=request.getParameter("phone");
		
		try {
			DBConnection c = new DBConnection();
	    	 
		 	 //creating connection with the database 
		         Connection con= c.getConnection();
		         PreparedStatement pst=con.prepareStatement("INSERT INTO Users values(?,?,?,?,?,?)");
		         
		         pst.setString(2, a);
		         pst.setString(3, b);
		         pst.setString(4, g);
		         pst.setString(5, d);
		         pst.setString(6, e);
		         pst.setString(7, f);
		         
		         int i =pst.executeUpdate();
		         
		         if (i>0)
		        	 out.print("Inregistrare reusita!");
		         
		} catch (Exception e2) {
		System.out.println(e2);
		}
	out.close();
	}

}
