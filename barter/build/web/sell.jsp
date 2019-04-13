<%-- 
    Document   : sell
    Created on : 17 Nov, 2018, 1:32:37 PM
    Author     : anubhav chhillar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Barter Exchange</title>
    </head>
    <link href='style.css' rel='stylesheet'>
     <ul>
        <li><a href="welcome.jsp">Home</a></li>
        <li><a>About</a>
            <ul>
                <li><a href="about.jsp">What is Barter Exchange</a></li>
                <li><a href="theoretical.jsp">Theoretical</a></li>
            </ul>
        </li>
        <li><a href="bORs.jsp">New Exchange</a></li>
        <li><a href="Contact.jsp">Contact</a> </li>
        <li><a>Login</a>
            <ul>
                <li><a href="login.jsp">Login</a></li>
                <li><a>Change Password</a></li>
            </ul>
        </li>
    </ul>
 <br>
    <br>
    <br>
    <body align='Center' bgcolor='yellow'  >
         <h1><B>SELL NOW!</b></h1>
        Complete the form below and we will contact you to make you an offer!
        <br>
        <br>
        <form>
            Email*<br>
            <input type="text" name="Email" value="" />
            <br>
            <br>
            First Name*<br>
             <input type="text" name="FirstName" value="" />
             <br>
             <br>
             Last Name *<br>
             <input type="text" name="LastName" value="" />
             <br>
             <br>
             Phone Number<br>
             <input type="text" name="PhoneNo" value="" />
             <br>
             <br>
            Select your Category *<br>
             <select name="Category">
                 <option>Women Clothing</option>
                 <option>Men Clothing</option>
                 <option>Women Accessories</option>
                 <option>Men Accessories</option>
                 <option>Books</option>
                 <option>Kitchen Accessories</option>
             </select>
            <br>
            <br>
             Desired Amount<br>
              <input type="text" name="Amt" value="" />
              <br>
              <br>
             Comments<br>
             <textarea name="comnt" rows="4" cols="20">
             </textarea>
             <br>
             <br>
        </form>
        <input type="submit" value="SELL" name="SELL" />
    </body>
</html>
