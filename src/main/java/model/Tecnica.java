package model;

public class Tecnica {
    private int id;
    private String idTecnica;
    private String nombreProducto;
    private String descProducto;
    private float precio;
    private int cantidad;

    public Tecnica() {
    }

    public Tecnica(int id, String idTecnica, String nombreProducto, String descProducto, float precio, int cantidad){
        this.id = id;
        this.idTecnica = idTecnica;
        this.nombreProducto = nombreProducto;
        this.descProducto = descProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }

    public Tecnica(int aInt, String string, String string0, float aFloat, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(String idTecnica) {
        this.idTecnica = idTecnica;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    
    
}
