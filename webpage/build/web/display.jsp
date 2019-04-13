<%-- 
    Document   : display
    Created on : 5 Sep, 2018, 2:20:35 PM
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
        <h1>bioData view</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>name</th>
                    <th>address</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= request.getParameter("text1")%></td>
                    <td><%= request.getParameter("text2")%></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
