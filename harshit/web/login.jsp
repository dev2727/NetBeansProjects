<%-- 
    Document   : login
    Created on : 11 Mar, 2019, 9:45:45 AM
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
        rs= stmt.executeQuery ("select * from ROOT.data where name='"+fname+"' and pass='"+fpass+"'");
        
        if (rs.next()) {
        session.setAttribute("fname", fname);
        response.sendRedirect("welcome.jsp");
        
        } else {
        System.out.println("Invalid Password");
        }
        
        }
        
        
        
        

        catch(SQLException err) 
        {
            System.out.println(err.getMessage());
        }
        %>
    </body>
</html>
