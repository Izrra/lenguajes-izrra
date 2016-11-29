/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenmysql;

import java.sql.*;
public class Conexion {
    public static Connection conectarse() throws Exception{
        //paso 1 proporcionar la url
        String url="jdbc:mysql://localhost:3306/mysql";
        // paso 2 cargado del driver
        Class.forName("com.mysql.jdbc.Driver");
        //paso 3 abrir la conexion
        Connection con=DriverManager.getConnection(url, "root", null);
        return con;
        
        
    }
    
}
