package Reg_Login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


	
	@WebServlet("/logout")
	public class Logout_Serv extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    
	   
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			session.removeAttribute("Email");
			session.invalidate();
			response.sendRedirect("login.jsp");
		}

	}


