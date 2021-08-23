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
import model.Tratamiento;


public class TratamientoGestion {
    public static ArrayList<Tratamiento> getTratamiento(){
        ArrayList<Tratamiento> lista = new ArrayList<>();
        String tira = "select * from tratamiento";       
        try {
            PreparedStatement consulta = Conexion.getConnection()
                    .prepareStatement(tira);          
            ResultSet datos = consulta.executeQuery();
            while (datos.next()) {
                lista.add(new Tratamiento(
                        datos.getInt(2),//idTratamiento
                        datos.getString(3),//idPaciente
                        datos.getString(4),//idTecnica
                        datos.getString(5),//Periodontitis
                        datos.getString(6),//claseantero posterior
                        datos.getString(7),//apiñamiento
                        datos.getString(8),//requieredesgaste
                        datos.getString(9),//requierelimpieza
                        datos.getInt(10)//requiereextracciones                
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;
    }
    
    public static String tiraJson() {
        String tiraJson="";
        String sentencia = "select * from tratamiento";
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
                        .add("idTratamiento",datos.getInt(2))
                        .add("idPaciente",datos.getInt(3))
                        .add("idTecnica",datos.getInt(4))
                        .add("periodontitis",datos.getInt(5))
                        .add("claseAnteroPosterior",datos.getInt(6))
                        .add("apiñamiento",datos.getInt(7))
                        .add("requiereDesgaste",datos.getInt(2))
                        .add("requireLimpieza",datos.getInt(9))
                        .add("requiereExtracciones",datos.getInt(10))
                        .build();//idTratamiento
                        
                
                tira = new StringWriter();
                salidaJson = Json.createWriter(tira);
                salidaJson.write(objetoJson);
                tiraJson+=tira.toString()+"\n";                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tiraJson;
    }       

    
}
