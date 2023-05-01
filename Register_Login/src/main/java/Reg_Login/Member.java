//to come the all the values  from Reg_Servlet.java to set the value in private 
//we using getter and setter methode for user details
package Reg_Login;

public class Member {
	
	
private String uname,email,password,mobile;
	
    public Member(String uname, String email, String password, String mobile) 
	{
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
