
package controller;

import gestion.PacienteGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Paciente;

@Named(value = "pacienteController")
@SessionScoped
public class PacienteController implements Serializable {

    public PacienteController() {
    }
    
    public List<Paciente> getPacientes(){
        return PacienteGestion.getPacientes();
    }
    
    
}//fin de la clase


