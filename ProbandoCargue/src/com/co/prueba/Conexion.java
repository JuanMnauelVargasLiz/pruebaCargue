package com.co.prueba;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public void realizaConexion(){
        Connection conn = null;
        String urlDatabase =  "jdbc:postgresql://localhost:0000/midatabase"; 
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase,  "usuario", "password");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : "+e.getMessage());
        }
        System.out.println("Conexión Exitosa");
}
}

