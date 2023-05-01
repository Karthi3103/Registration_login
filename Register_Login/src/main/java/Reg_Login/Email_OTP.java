//this program is using to send otp from the given email

package Reg_Login;

	import java.util.Properties;
	import java.util.Random;

	import jakarta.mail.Authenticator;
	import jakarta.mail.Message;
	import jakarta.mail.PasswordAuthentication;
	import jakarta.mail.Session;
	import jakarta.mail.Transport;
	import jakarta.mail.internet.InternetAddress;
	import jakarta.mail.internet.MimeMessage;


	public class Email_OTP  {
//	    public static void main(String[] args) {
	//
//	    	EmailSender gEmailSender = new EmailSender();
//	    	gEmailSender.send();
//	       
//	    }
	//    
		static String otp;
		String result;
	    public static String send(String Verifytoemail)   
	    
	    {
	    	Email_OTP mailSender = new Email_OTP();
	    	 String to = Verifytoemail;
	         String from = "torrentck3103@gmail.com";
	         String subject = "Second: Sending email using GMail";
	         otp =mailSender.pass();
	         String text = "your otp is="+otp;
	         boolean b = mailSender.sendEmail(to, from, subject, text);
	         String result = null ;
	         if (b) {
	        	 
	             //System.out.println("Email is sent successfully");
	             result =otp ;
	         } else {
	            // System.out.println("There is problem in sending email");
	        	 String s ="false";
	        	 result =s;
	         }
			
	         return result;
	    }



	    public boolean sendEmail(String to, String from, String subject, String text) {
	        boolean flag = false;

	        //logic
	        //smtp properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.auth", true);
	        properties.put("mail.smtp.starttls.enable", true);
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.host", "smtp.gmail.com");

	        final String username = "torrentck3103@gmail.com";
	        final String password = "bftuslqwveddbwdm";


	        //session
	        Session session = Session.getInstance(properties, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {

	            Message message = new MimeMessage(session);
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            message.setFrom(new InternetAddress(from));
	            message.setSubject(subject);
	            message.setText(text);
	            Transport.send(message);
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	        return flag;
	        
	    }
	    
	    
	    
	    
	    //Random otp genetator it is using to send otp parpose
	    public String pass() {
	    
	    String num = "123567890";
	    
	    String combination =num;
	    
	    int len =4;
	    
	    char ch[] = new char[len];
	    Random r = new Random();
	   
	    for(int i=0;i<len;i++)
	    {
	    	ch[i] = combination.charAt(r.nextInt(combination.length()));
	    }
	    
	    return (new String(ch));
	    }
	    

}
