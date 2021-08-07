
package model;

public class Paciente {
    private int id;
    private String idPaciente;
    private String idDoctor;
    private String apellido1;
    private String apellido2;
    private int edad;
    private int telefono;
    private String correo;
    private boolean activo;

    public Paciente() {
    }

    public Paciente(String idPaciente, String idDoctor, String apellido1, String apellido2, int edad, int telefono, String correo, boolean activo) {
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = activo;
    }

    public Paciente(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}//fin de la clase
