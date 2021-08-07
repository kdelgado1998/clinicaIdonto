package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Usuario;

public class UsuarioGestion {

    public static Usuario Valida(String idUsuario, String pwUsuario) {

        String tira = "select nombreUsuario, correoUsuario, idRol from usuario where idUsuario=? and pwUsuario=md5(?)";

        Usuario usuario = null;
        try {

            PreparedStatement consulta = Conexion.getConnexion()
                    .prepareStatement(tira);

            consulta.setString(1, idUsuario);
            consulta.setString(2, pwUsuario);

            ResultSet datos = consulta.executeQuery();

            if (datos.next()) {
                usuario = new Usuario(
                        idUsuario,
                        datos.getString(1),
                        datos.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }
}
