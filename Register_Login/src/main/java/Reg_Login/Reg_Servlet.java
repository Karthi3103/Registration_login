// Values Come into the Register.jsp Passing to the value to Member.java to set the value
//After we call class JDBC.Java to enter to user details
package Reg_Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Reg_Servlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
	   
    static int result;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ,NumberFormatException
{
	
		
	String uname = request.getParameter("username");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String mobile = request.getParameter("mobile");
	
	PrintWriter out = response.getWriter();	
	
	Member User_Details = new Member(uname,email,password,mobile);// To Send data into Member.Java to set the value using Getter and setter
	
	JDBC dob = new JDBC();
	
	try 
	{
		  result = dob.insert(User_Details); //Insert the user details to JDBC.java
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	if(result ==1)
	{
		
		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
		rd.include(request, response);
	   
	    out.println("Register Sucessesfully");
		
		//response.sendRedirect("Sucess.jsp");
	}
	else
	{
		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
		rd.include(request, response);
	   
	    out.println("User alredy exit");
	}
	
	

}


}
