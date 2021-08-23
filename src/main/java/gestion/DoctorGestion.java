/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.StringWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import model.Conexion;
import model.Doctor;

public class DoctorGestion {
    
     public static ArrayList<Doctor> getDoctor() {
        ArrayList<Doctor> lista = new ArrayList<>();
        
        String tira = "SELECT * FROM DOCTOR";

        try {

            PreparedStatement consulta = Conexion.getConnection()
                    .prepareStatement(tira);

            ResultSet datos = consulta.executeQuery();
            while (datos.next()) {
                lista.add(new Doctor(
                        datos.getString(2),//idDoctor
                        datos.getInt(3),//cantidadTratamiento
                        datos.getString(4),//correo
                        datos.getInt(5),//telefono
                        datos.getString(6),//direcion
                        datos.getBoolean(7)//activo
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static String tiraJson() {
        String tiraJson="";
        String sentencia = "select * from doctor";
        try {
            PreparedStatement consulta = Conexion.getConnection().prepareStatement(sentencia);
            ResultSet datos = consulta.executeQuery();

            DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            
            JsonObjectBuilder constructorJson = Json.createObjectBuilder();
            JsonObject objetoJson;
            JsonWriter salidaJson;
            StringWriter tira;
            
            while (datos.next()) {
                objetoJson = constructorJson
                    .add("idDoctor", datos.getString(2))  //idDoctor
                    .add("cantidadTratamiento", datos.getInt(3)) //cantidadTratamiento
                    .add("correo", datos.getString(4)) //correo
                    .add("telefono", datos.getInt(5)) //telefono
                    .add("direccion", datos.getString(6)) //direccion
                    .add("activo", datos.getBoolean(7)) //activo
                    .build();
                
                tira = new StringWriter();
                salidaJson = Json.createWriter(tira);
                salidaJson.write(objetoJson);
                tiraJson+=tira.toString()+"\n";                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tiraJson;
    }
     
}
