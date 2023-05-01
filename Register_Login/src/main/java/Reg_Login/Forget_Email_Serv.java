//values comes into the Forget_pass to generate otp for the given email

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

	@WebServlet("/verify")
	public class Forget_Email_Serv extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
		 boolean verfyemail;
		 String otp;
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			
			String Verfiyemail = request.getParameter("Verifyemail");
			//RegisterLoginDob dob = new RegisterLoginDob();
			
			try {
				verfyemail =JDBC.VerifyEmail(Verfiyemail);
				
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
		
			if(verfyemail)
			{
				///EmailSender mailSender = new EmailSender();
				 otp = Email_OTP.send(Verfiyemail);
				
				if(otp == "false") {
					RequestDispatcher rd = request.getRequestDispatcher("Forgot_Pass.jsp");
					rd.include(request, response);
				   
				    out.println("OTP Not Send please try again to send otp");
				    
				    
				    
				
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("Forgot_Pass.jsp");
					rd.include(request, response);
				   
				    out.println("OTP Send Sucessfully");
				  
		           // Compare_OTP Mail_Otp = new Compare_OTP();
				    Compare_OTP.Mailotp(otp, Verfiyemail);
				  
//		l		    RequestDispatcher sd = request.getRequestDispatcher("otpverify");
//				    request.setAttribute("otp", otp);
//				    sd.forward(request, response);
				}
			    //System.out.println("Otp Send Sucessfully to your Email"+otp);
				//System.out.println("Otp Send Sucessfully to your Email");
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("Forgot_Pass.jsp");
				rd.include(request, response);
			   
			    out.println("To Enter the Wrong Email Please Enter Correct Email");
			}
			
			
			//String fotp = (String) request.getAttribute("fotp");
			//String dotp ="1234";
			//String fotp = request.getParameter("otp");
	        //System.out.println("otp"+otp);
		
			//System.out.println("fotp"+fotp);
			    
//			    if(fotp.equals(null))
//			    {
//			    	System.out.println("null");
//			    }
//			    else if(otp.equals(dob))
//			    {
//			    	System.out.println("yes");
//			    }
//			    else
//			    {
//			    	System.out.println("no");
//			    }
			
//			if(otp.equals(fotp))
//		    {
//				System.out.println("yes");
//				response.sendRedirect("welcome.jsp");
//		    }
//		    else
//		    {
//		    	System.out.println("no");
//		    }
			
			
			  //String New_Password = request.getParameter("password");
			 //Confirm_New_Password = request.getParameter("ConNewPassword");

			    
//				int Pass_updated = 0;
//				try {
//					 Pass_updated=dob.SetNewPassword(New_Password,Verfiyemail);
//				} catch (ClassNotFoundException | SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				if(Pass_updated==1)
//				{
//				response.sendRedirect("login.jsp");
//				}
//			
//			else
//			{
//				RequestDispatcher rd = request.getRequestDispatcher("NewPassword.jsp");
//				rd.include(request, response);
//			   
//			    out.println("Please Enter Correct");
//			}


		}
		
	   }



