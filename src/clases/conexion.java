/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 52747
 */
public class conexion {
    
        public static Connection conexion(){
        Connection con = null;
        try{
            String dir_bd = "jdbc:mysql://localhost/tienda";
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection(dir_bd, "root", ""); 
            System.out.println("Se conecta");
        }catch(Exception e){
            System.out.println("error de conecxion: " + e);
        }
        return con;
    }
}
