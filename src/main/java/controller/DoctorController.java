
package controller;

import gestion.DoctorGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.Doctor;

@Named(value = "doctorController")
@SessionScoped
public class DoctorController implements Serializable {

    public DoctorController() {
    }
    
    public List<Doctor> getDoctors(){
        return DoctorGestion.getDoctors();
    }
}
