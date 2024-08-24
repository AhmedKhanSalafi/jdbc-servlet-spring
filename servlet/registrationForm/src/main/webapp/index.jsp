<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>registration data</title>

</head>
<body>
<h3>Registration form</h3>
<form action="registrationForm" method="post" >

Name : <input type="text" name="name" placeholder="enter name"/><br><br>
   Email : <input type="text" name="email" placeholder="enter email"/><br><br>
   Password : <input type="password" name="password" placeholder="enter password"/><br><br>
Gender : <input type="radio" name="gender" value="male"/>Male <input type="radio" name="gender" value="female"/>Female
   City : <select name="city">
   <option>Hyderabad</option>
   <option>Benglore</option>
   <option>Delhi</option>
   <option>Mumbai</option>
   <option>Pune</option>
    </select><br><br>

    <input type="submit" value="Register"/>

</form>
</body>
</html>