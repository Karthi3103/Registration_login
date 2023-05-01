package Reg_Login;

public class Compare_OTP {

	
	static String Mail_OTP ,User_OTP ,Email;
	static boolean result;
	static void  Mailotp(String otp,String email)
	{
		Mail_OTP = otp;
		
		Email = email;
	}
	
	
	static void Userotp(String fotp) {
		User_OTP= fotp;
	}

	
	static boolean Compareotp()
	{
		
		if(User_OTP.equals(Mail_OTP)) {
		    result = true;
		}
		else
		{
			result = false;
		}
		return result;
		
	}


	public static String TakeEmail() {
		return Email;
		
	}


	
}
