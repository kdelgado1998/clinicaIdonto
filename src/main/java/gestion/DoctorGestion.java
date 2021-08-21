/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Doctor;

public class DoctorGestion {
     public static ArrayList<Doctor> getDoctors() {

        ArrayList<Doctor> lista = new ArrayList<>();
        String tira = "SELECT * FROM DOCTOR";

        try {

            PreparedStatement consulta = Conexion.getConnexion()
                    .prepareStatement(tira);

            ResultSet datos = consulta.executeQuery();
            while (datos.next()) {
                lista.add(new Doctor(
                        datos.getInt(1),//id
                        datos.getInt(2),//idDoctor
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
}
