
package controller;

import gestion.UsuarioGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import model.Usuario;

@Named(value = "usuarioController")
@SessionScoped
public class UsuarioController extends Usuario implements Serializable {

    public UsuarioController() {
    }
    
    public String valida(){
        Usuario usuario = UsuarioGestion.Valida(
                this.getIdUsuario(), this.getPwUsuario());
        if(usuario!=null){
            this.setNombreUsuario(usuario.getNombreUsuario());
            this.setIdRol(usuario.getIdRol());
            return "principal.xhtml";
        }else{
            return "principal.xhtml";
        }
    }
    
}//fin de la clase
