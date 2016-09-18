package ro.implantodays.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ro.implantodays.controllers.Validate;

import java.sql.*;

@SuppressWarnings("unused")
public class LoginServlet extends HttpServlet {
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(Validate.checkUser(user, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("WelcomeServlet");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("Login.jsp");
           rs.include(request, response);
        }
    }  
}


