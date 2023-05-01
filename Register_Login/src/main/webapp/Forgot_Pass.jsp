<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forget password</title>
</head>
<body>

<!-- Email verfication -->
<form action="verify" method="post">

<table>
<tr>
<td>Email</td>
<td><input type="email" name="Verifyemail"></td>
<td><input type="submit" value="send"></td>
</tr>



</table>




</form>
<!-- otp verfication -->
<form action="otpverify" method="post">

<table>
<tr>
<td>Verify your otp</td>
<td><input type="text" name="otp"></td>
<td><input type="submit" value="verify"></td>
</tr>


</table>

</form>

</body>
</html>