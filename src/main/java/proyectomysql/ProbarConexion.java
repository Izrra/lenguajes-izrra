/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomysql;

/**
 *
 * @author T-107
 */
import java.sql.*;
public class ProbarConexion {
        public static void main(String[] args) {
            try{
                Connection con=Conexion.conectarse();
                System.out.println("Conectado a mysql");
                PreparedStatement p= con.prepareStatement("insert into hola(nombre, edad) values(?,?");
                p.setInt(2, 10);
                p.setString(1,"Ana");
                int id=p.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        
    }
    
}
