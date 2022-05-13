/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPJ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConnection {
  public static Connection getJDBCConnection() {
        Connection con = null;
        con = DriverManager.getConnection("jdbc:jtds:sqlserver://"HUYNHIT\SQLSERVER":1433/"test);

        final String user = "sa";
        final String password="Huynh2k2";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
         }
}