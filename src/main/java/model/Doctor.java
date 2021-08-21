/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ESTEBAN
 */
public class Doctor {
    private int id;
    private int idDoctor;
    private int cantidadTratamientos;
    private String correo;
    private int telefono;
    private String direccion;
    private boolean activo;

    public Doctor() {
    }

    public Doctor(int id, int idDoctor, int cantidadTratamientos, String correo, int telefono, String direccion, boolean activo) {
        this.id = id;
        this.idDoctor = idDoctor;
        this.cantidadTratamientos = cantidadTratamientos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activo = activo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getCantidadTratamientos() {
        return cantidadTratamientos;
    }

    public void setCantidadTratamientos(int cantidadTratamientos) {
        this.cantidadTratamientos = cantidadTratamientos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
