<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

    <form action="Register" method="post">
    
    <table>
       
       <tr>
      
       <td>UserName</td>
       <td><input type="text" name="username"></td>
       
       </tr>
       
       <tr>
      
       <td>Email</td>
       <td><input type="email" name="email"></td>
       
       </tr>
       
       <tr>
      
       <td>Password</td>
       <td><input type="password" name="password"></td>
       
       </tr>
       
       <tr>
      
       <td>Mobile No</td>
       <td><input type="number" name="mobile"></td>
       
       </tr>
       
        <tr>
     
       <td></td>
       <td><input type="submit" value="Register"></td>
     
       </tr>
    
    </table>
    
    
    
    </form>
    
    
    <div>
       <p>Already have a Account<a href="Login.jsp">Login</a></p>
    </div>
    
    <div>
    
    
    
    
    </div>
    

</body>
</html>