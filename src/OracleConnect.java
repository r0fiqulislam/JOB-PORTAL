   
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class OracleConnect {

    
    Connection conn;
    public static Connection ConnectDb(){ //jdbc:oracle:thin:@localhost:1521:XE
        try{  
            //Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DBMS","dbms");
            //JOptionPane.showMessageDialog(null, "Connection Establised");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }
}
