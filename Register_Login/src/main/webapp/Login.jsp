<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>

     <form action="log" method="post">
     
     <table>
     
     <tr>
     
     <td>Email</td>
     <td><input type="email" name="Email"></td>
     
     </tr>
     
     <tr>
     
     <td>Password</td>
     <td><input type="password" name="password"></td>
     
     </tr>
     
      <tr>
     
     <td></td>
     <td><input type="submit" value="Login"></td>
     
     </tr>
     
     <tr>
     
     <td><a href="Forgot_Pass.jsp">Forget Password</a></td>
     
     </tr>
     
     </table>
     
     
     
     </form>
     
     <div>
     <p>New user Account  <a href="Register.jsp">Register</a></p>
     </div>
     
     
    

</body>
</html>