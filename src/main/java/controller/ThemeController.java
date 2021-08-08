
package controller;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;


@Named(value = "themeController")
@SessionScoped
public class ThemeController implements Serializable{

    private String tema;
    
    public ThemeController() {
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
