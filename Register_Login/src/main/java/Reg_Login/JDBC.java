package Reg_Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBC {
	
	
static  Connection con;
	
	
	// Connection Method For All
	
	public static void connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/construction";
		String username ="root";
		String password ="Karthi@31";
		 con = DriverManager.getConnection(url,username,password);
	}
	
	// Insert user Details from Reg_Servlet
	
	public int insert(Member Member) throws ClassNotFoundException, SQLException,NumberFormatException
	{
		
		connection();
		
		String InsetQuery ="insert into member values(?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(InsetQuery);
		
		int result;
		ps.setString(1, Member.getUname());
		ps.setString(2, Member.getEmail());
		ps.setString(3, Member.getPassword());
		ps.setString(4, Member.getMobile());
       try {
		ps.executeUpdate();
	    result =1;
       }
       catch(SQLException se)
       {
    	   se.fillInStackTrace();
    	   result =0;
       }
		
       return result;
	}

	
	
	//Login method if email and password is correct or not
	public boolean check(String Email, String Password) throws ClassNotFoundException, SQLException
	{
		connection();
		
		String checkquery ="select Email,Password from member where Email=? and Password=?";
		
		PreparedStatement ps = con.prepareStatement(checkquery);
		ps.setString(1, Email);
		ps.setString(2, Password);
		ResultSet i=ps.executeQuery();
	if(i.next())
	{
		
		return true;
	}
		return false;
		
	}
	
	// Forgot password using email to verify
	
	public static boolean VerifyEmail(String VerifyEmail) throws ClassNotFoundException, SQLException
	{
		connection();
		
		String checkquery ="select Email from member where Email=?";
		
		PreparedStatement ps = con.prepareStatement(checkquery);
		ps.setString(1, VerifyEmail);
		
		ResultSet i=ps.executeQuery();
	if(i.next())
	{
		
		return true;
	}
		return false;
		
	}
	

	//Set New Password From the user From Register Servlet 

	public static boolean SetNewPassword(String new_Password, String verfiyemail) throws ClassNotFoundException, SQLException {
		
		connection();
		
        String checkquery ="update member set Password=? where Email =?";
		
		PreparedStatement ps = con.prepareStatement(checkquery);
		ps.setString(1, new_Password);
		ps.setString(2, verfiyemail);
		ps.executeUpdate();
		
		return true;
		
	}

}
