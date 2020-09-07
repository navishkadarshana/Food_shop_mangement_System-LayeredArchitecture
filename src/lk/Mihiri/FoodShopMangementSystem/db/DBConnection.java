/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sanu
 */
public class DBConnection {

      private static DBConnection dBConnection;
    //------------------------------
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
          Class.forName("com.mysql.jdbc.Driver");
      
          connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/foodshop",
                "root",
                "1519");
    }
    
    
    public static DBConnection getnstance() throws ClassNotFoundException, SQLException{
       return (null==dBConnection)?(new DBConnection()):(dBConnection);
    }
    //------------------------------
    public Connection getConnection(){
        return connection;

    }
}
