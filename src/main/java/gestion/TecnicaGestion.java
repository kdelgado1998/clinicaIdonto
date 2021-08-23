
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Tecnica;

public class TecnicaGestion {
    public static ArrayList<Tecnica> getTecnica(){
        ArrayList<Tecnica> lista = new ArrayList<>();
        String tira = "select * from tecnica";       
        try {
            PreparedStatement consulta = Conexion.getConnexion()
                    .prepareStatement(tira);          
            ResultSet datos = consulta.executeQuery();
            while (datos.next()) {
                lista.add(new Tecnica(
                        datos.getInt(2),//idTecnica
                        datos.getString(3),//nombreProducto
                        datos.getString(4),//desProdcuto
                        datos.getFloat(5),//Precio
                        datos.getInt(6)//cantidad
                                     
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;
        
        
    }
    
}
