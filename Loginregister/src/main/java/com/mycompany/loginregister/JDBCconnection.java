/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shri shivay
 */
public class JDBCconnection {
    private static JDBCconnection instance =null;
    public Connection connection;

    private JDBCconnection (){
        try {
            connection=DriverManager.getConnection("jdbc:mysql;//localhost:3306/loginregister","root","");
      String statement ="CREATE TABLE  user (email varchar(255),password varchar(200),name varchar(100))";
      PreparedStatement preparedStatement=connection.prepareStatement(statement);
      preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public static JDBCconnection getInstance(){
if(instance == null){
instance = new JDBCconnection();
}
return instance;
}
}

