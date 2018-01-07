
package electoralserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yash1861991
 */
public class MySqlConnection {
    
    Connection connection;
    
    public Connection getMySQLConnection() throws ClassNotFoundException,SQLException
    {
        try
        {
          String driver="com.mysql.jdbc.Driver";
          String url = "jdbc:mysql://localhost:3306/electoralregistration";
          String user = "root";
          String password = "root";
       
          Class.forName(driver);
          connection = DriverManager.getConnection(url, user, password);
          System.out.println("Connection Done");
         }
         catch(Exception e)
         {
             System.out.println("Error :- " + e);
         }
        return connection;
    }
    
    public void closeConnection()
    {
        try {
            connection.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
