package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Paciente;

public class PacienteGestion {

    public static ArrayList<Paciente> getPacientes() {

        ArrayList<Paciente> lista = new ArrayList<>();
        String tira = "SELECT * FROM PACIENTE";

        try {

            PreparedStatement consulta = Conexion.getConnexion()
                    .prepareStatement(tira);

            ResultSet datos = consulta.executeQuery();
            while (datos.next()) {
                lista.add(new Paciente(
                        datos.getString(2),//idPaciente
                        datos.getString(3),//idDoctor
                        datos.getString(4),//nombre
                        datos.getString(5),//apellido1
                        datos.getString(6),//apellido2
                        datos.getInt(7),//edad
                        datos.getInt(8),//telefono
                        datos.getString(9),//correo
                        datos.getBoolean(10)));//activo
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}//fin de la clase
