
package controller;

import gestion.TecnicaGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Tecnica;

@Named(value = "tecnicaController")
@SessionScoped
public class TecnicaController implements Serializable {

    public TecnicaController() {
    }
    
        public List<Tecnica> getTecnica(){
        return TecnicaGestion.getTecnica();
    }
    
}
