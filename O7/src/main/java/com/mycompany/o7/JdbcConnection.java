/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.o7;

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
public class JdbcConnection {
    public Connection connection;
    private static JdbcConnection jdbcConnection = null;
    
    private JdbcConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/o7services", "root","");
            
            if(connection !=null){
                String createStudentTable = "CREATE TABLE IF NOT EXISTS studentTable(id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), course VARCHAR(255), phoneNumber VARCHAR(255), address VARCHAR(255), PRIMARY KEY(id))";
                PreparedStatement psCreateStudent = connection.prepareStatement(createStudentTable);
                psCreateStudent.execute();
                
                
                String createTeacherTable = "CREATE TABLE IF NOT EXISTS teacherTABLE(id INT NOT NULL AUTO_INCREMENT, name varchar(255), PRIMARY KEY(id))";
                PreparedStatement psCreateTeacherTable = connection.prepareStatement(createTeacherTable);
                psCreateTeacherTable.execute();
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static JdbcConnection getInstance(){
        if(jdbcConnection == null){
            jdbcConnection = new JdbcConnection();
        }
        
        return jdbcConnection;
                
    }
    
}
