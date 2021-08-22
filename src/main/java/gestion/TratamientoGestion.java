package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Tratamiento;


public class TratamientoGestion {
    public static ArrayList<Tratamiento> getTratamiento(){
        ArrayList<Tratamiento> lista = new ArrayList<>();
        String tira = "select * from tratamiento";       
        try {
            PreparedStatement consulta = Conexion.getConnexion()
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
    
}
