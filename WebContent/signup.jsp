<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
  
    <title>SignUp</title>
  
</head>
<body style="margin-left: 450px;">


<fieldset style="height: 300px; width: 300px; margin-top: 100px;">

    <form action="SignUpServlet" method="post" style="text-align: center;">
        <label style="color: white; font-family: Lucida Handwriting;">Sign Up</label><br><br>
        
    
        <input type="email" id="email" name="email" required placeholder="Email"><br><br>
       
        <input type="password" id="password" name="password" required placeholder="Password"><br><br><br>
        
	 <input type="submit" class= "submit" value="Signup" style="background-color: #00BFFF; 
	 width: 230px;height: 25px; border-radius: 5px;"><br><br>
	 
    </form>
   
    </fieldset><br>
    <fieldset style="width: 300px;">
    <p style="color: white;">Already have an account?</p><a href="home.jsp" style="text-decoration: none; color: #5CB3FF; text-align: center;">Sign In</a>
    </fieldset >

</body>
<style>
body{
background-color: black;
}

form {
margin-top: 40px;
}
input{
height: 25px;
width: 230px;
}
input[type=checkbox]{
width: 15px;
}
</style>
</html>
