<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<h1>welcome</h1>


<%
            
           response.setHeader("Cache-Control", "no-cache , no-store ,must-revalidate");

           if(session.getAttribute("Email")==null)
           {
        	   response.sendRedirect("login.jsp");
           }


%>

<form action="logout" method="post">

<input type="submit" value="Logout">

</form>
</body>
</html>