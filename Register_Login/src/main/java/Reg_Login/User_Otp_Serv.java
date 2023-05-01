//values come in to forgot.jsp for user click that otp to come this page
package Reg_Login;


	
	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.PrintWriter;

	@WebServlet("/otpverify")
	public class User_Otp_Serv extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	  
		

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			PrintWriter out = response.getWriter();
			
			//String otp = (String) request.getAttribute("otp");
			
			String Userotp = request.getParameter("otp");
			//otpverfiyvlass se = new otpverfiyvlass();
			Compare_OTP.Userotp(Userotp);
			
			boolean comperotp =Compare_OTP.Compareotp();
			
			
			if(comperotp)
			{
				response.sendRedirect("New_Password_Set.jsp");
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("Forgot_Pass.jsp");
				rd.include(request, response);
			   
			    out.println("Incorrect Otp");
			}
			
			
//			
//		    RequestDispatcher sd = request.getRequestDispatcher("verify");
//		    request.setAttribute("fotp", fotp);
//		    sd.forward(request, response);
			
			
		}

	}



