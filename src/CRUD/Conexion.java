/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Marko
 */
public class Conexion {
    
    public static final String user= "root";
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto";
    public static final String password= "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,user, password);
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }
    
}
