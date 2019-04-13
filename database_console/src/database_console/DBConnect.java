/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 *
 * @author anubhav chhillar
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner sc1 = new Scanner (System.in);
        System.out.print("Enter Usernaame = ");
        String fname = sc1.nextLine();
        System.out.println("");
        System.out.print("Enter Password = ");
        String fpass = sc1.nextLine();
        System.out.println("");
        String host="jdbc:derby://localhost:1527/jklu";
      //  String uName="root";
      //  String uPass="root";
        Connection con = DriverManager.getConnection(host,"root","root");
       
        System.out.println("connection created");
        Statement stmt = con.createStatement( );
        String SQL = "select * from ROOT.data";
        //ResultSet rs; 
        int i= stmt.executeUpdate ("insert into ROOT.data values ('"+fname+"','"+fpass+"')");
        ResultSet rs;
        System.out.println();
    }
    
catch ( SQLException err ) {
System.out.println( err.getMessage( ) );
}

    }
}
