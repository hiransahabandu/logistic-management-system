/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localtransportmanagment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author Devsahan
 */
public class db {
    static java.sql.Connection con = null;
    public static Connection mycon()throws SQLException{
        
        try {
             System.out.println("1");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport?useSSL= false","root","");
             System.out.println("2");
            return con;
            
        } catch (Exception e) {
             System.out.println("3");
            return null;
        }
        
        
        
    }
    
}