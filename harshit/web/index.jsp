<%-- 
    Document   : index
    Created on : 26 Feb, 2019, 2:24:02 AM
    Author     : anubhav chhillar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import ="java.sql.*" %>
        
             <%
        try {  
        Class.forName("org.apache.derby.jdbc.ClientDriver"); 
        java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/jklu","root","root");      
        String fname= request.getParameter("username");
        String fpass= request.getParameter("password");
        Statement stmt = con.createStatement( );
        ResultSet rs;
        int i= stmt.executeUpdate ("insert into ROOT.data values ('"+fname+"','"+fpass+"')");
        
        if (i>0) {
        response.sendRedirect("welcome.jsp");
        
        } else {
        response.sendRedirect("index.jsp");
        }
        
        }
        
        
        
        

        catch(SQLException err) 
        {
            System.out.println(err.getMessage());
        }
        %>
        
</html>
