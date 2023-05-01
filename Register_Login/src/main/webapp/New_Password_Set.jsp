<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter your New Password</title>
</head>

<style>
      .label {
        display: inline-block;
        width: 200px;
      }
      .form-group {
        margin-bottom: 1rem;
      }
      #confirmPassword-feedback {
        color: red;
      }
    </style>
<body>

<!--  <form action="verify" method="post">
 <table>
 <tr>
 <td>New Password</td>
 <td><input type="text" name="NewPassword"></td>
 </tr>
 
 <tr>
 <td>Confirm New Password</td>
 <td><input type="text" name="ConNewPassword"></td>
 </tr>
 
 <tr>
 <td></td>
 <td><input type="submit" value="Send"></td>
 </tr>
 </table>

</form>-->










<h1>Password confirm </h1>
    <form action="New_Password" id="myForm" method="POST">
      <div class="form-group">
        <label class="label">Password: </label>
        <input type="password" name="password" required />
      </div>
      <div class="form-group">
        <label class="label">Confirm Password: </label>
        <input type="password" name="confirmPassword" required />
        <br>
        <small id="confirmPassword-feedback"></small>
      </div>
      <div><input type="submit" value="Submit" /></div>
    </form>
    
    
    
    <script>
      const form = document.getElementById("myForm");
      const password = form.password;
      const confirmPassword = form.confirmPassword;
      const feedback = document.getElementById("confirmPassword-feedback");
      let isPasswordMatch = false;

      confirmPassword.addEventListener("input", () => {
        if (password.value != confirmPassword.value) {
          feedback.innerHTML = "Password did not match.";
          isPasswordMatch = false;
        } else {
          feedback.innerHTML = "";
          isPasswordMatch = true;
        }
      });

      form.onsubmit = function () {
        if (isPasswordMatch) {
          alert("Form submitted. Great!");
          return true;
        }
        alert("Wait! Password did not match.");
        return false;
      };
    </script>
    
    
    
   

</body>
</html>