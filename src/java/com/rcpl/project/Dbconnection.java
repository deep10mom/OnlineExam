/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcpl.project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Win 8.1
 */
public class Dbconnection {
    static Connection con;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examportal","root","password");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    public static Connection getDbConnection()
    {
        return con;
    }
    
}
