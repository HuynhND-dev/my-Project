/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConnection {
  public static Connection getJDBCConnection() {
        final String url = "jdbc:jtds:sqlserver://MSI\\SQLEXPRESS:1433/JAVA";
        final String user = "sa";
        final String password="1234";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDBCConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JDBCConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
}
