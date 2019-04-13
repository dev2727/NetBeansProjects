
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anubhav chhillar
 */
public class mydb {
    Connection con;
    public Connection getCon()
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
             DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mydb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mydb.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        return con;
        
    }
            
    
}
