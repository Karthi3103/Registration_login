//Values Comes From Login Page  
//To check the Email and Password Is Correct or not if correct to go the next page
//otherwise to redirect the login page

package Reg_Login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/log")

public class Login_Serv extends HttpServlet{
	
private static final long serialVersionUID = 1L;
    
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String Email=request.getParameter("Email");
		String Password=request.getParameter("password");
 
		JDBC log = new JDBC();
		
		try {
			if(log.check(Email, Password))     //If check the password and email is correct in JDBC.java
			{
				HttpSession session = request.getSession();
				session.setAttribute("Email", Email);
				response.sendRedirect("Welcome.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
