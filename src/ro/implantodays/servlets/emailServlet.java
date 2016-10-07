package ro.implantodays.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ro.implantodays.controllers.email;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Servlet implementation class emailServlet
 */
@WebServlet("/emailServlet")
public class emailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public emailServlet() {
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
		
			String message = null;
			String status = null;
			if (request.getParameter("submit") != null) {
				email javaEmail = new email();
				javaEmail.setMailServerProperties();
				String emailSubject="";
				String emailBody="";
				if (request.getParameter("name") != null) {
					emailBody = "Sender Name: " + request.getParameter("name")
							+ "<br>";
				}
				if (request.getParameter("email") != null) {
					emailBody = emailBody + "Sender Email: "
							+ request.getParameter("email") + "<br>";
				}
				if (request.getParameter("phone") != null) {
					emailBody = emailBody + "Sender Phone: "
							+ request.getParameter("phone") + "<br>";
				}
				if (request.getParameter("message") != null) {
					emailBody = emailBody + "Message: " + request.getParameter("message")
							+ "<br>";
				}
				
				javaEmail.createEmailMessage(emailSubject, emailBody);
				
				
					
					javaEmail.sendEmail();
					status = "success";
					message = "Email sent Successfully!";
			
			}
	}

}
