<!DOCTYPE html>
<html>
<head>
    <title>Student Admission Form</title>
</head>
<body style="margin-left: 450px; background-color: black;">
<fieldset style="height: 350px; width: 300px; margin-top: 100px; text-align: center;">
    <h2>Student Admission Form</h2>
    <form action="AdmissionServlet" method="post" enctype="multipart/form-data">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" placeholder="enter full name"><br>
        
        <label for="dob">Date of Birth:</label><br>
        <input type="date" id="dob" name="dob"><br>
        
        <label for="passport">Upload Passport Picture (jpg/png):</label><br>
        <input type="file" id="passport" name="passport" accept=".jpg,.png"><br>
        
        <label for="certificates">Upload Certificates (PDF):</label><br>
        <input type="file" id="certificates" name="certificates" accept=".pdf"><br>
        
        <input type="submit" value="Submit" style="background-color: #00BFFF; 
	 width: 230px;height: 25px; border-radius: 5px;">
    </form>
</fieldset>
</body>
<style>
h2{
color: blue;
font-family: Lucida Handwriting;
}
label{
color: white;
}
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
a {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            background-color: blue;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        a:hover {
            background-color: #45a049;
            
            
        }
</style>
</html>
