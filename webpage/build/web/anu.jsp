 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Page</title>
    </head>
    <body>
        <form action="display.jsp" method="POST">
      
        <h1>bioData</h1>
        NAME:<br/>
        <input type="text" name="text1" value="" /><br/><br/>
        Adderss:<br/>
        <textarea name="text2" rows="5" cols="20">
        </textarea><br/><br/> 
        <input type="submit" value="submit" name="submit" />
          </form>
    </body>
</html>
