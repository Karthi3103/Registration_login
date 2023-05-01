package Reg_Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/New_Password")

public class New_Pass_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		PrintWriter out =response.getWriter();
		String Password = request.getParameter("password");
		String Confirm_Password = request.getParameter("confirmPassword");
		
		String Email=Compare_OTP.TakeEmail();
		
		try {
			if(JDBC.SetNewPassword(Password,Email))
			{
				response.sendRedirect("Login.jsp");
			}
			else {
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
