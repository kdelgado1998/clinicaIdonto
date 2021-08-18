package controller;

import gestion.TratamientoGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Tratamiento;


@Named(value = "tratamientoController")
@SessionScoped
public class TratamientoController implements Serializable {

    public TratamientoController() {
    }
    
    public List<Tratamiento> getTratamiento(){
        return TratamientoGestion.getTratamiento();
    }
    
    
}
