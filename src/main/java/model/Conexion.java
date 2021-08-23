package model;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static Conexion conexion;
    private static final String DBURL="jdbc:mysql://localhost:3306/odonto";
    private static Connection conn=null;
    
    /*Esto es una prueba xd*/
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
                    .getDeclaredConstructor()
                    .newInstance();
            conn = DriverManager.getConnection(DBURL,
                    "general_user",
                    "Prueba123_");
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static synchronized Connection getConnection(){
        if(conexion==null){
            conexion = new Conexion();
        }
        return conn;
    }
    
}//fin de la clase
