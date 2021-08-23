
package model;

public class Tecnicas {
    private int id;
    private int idTecnica;
    private String nombreProducto;
    private String descProducto;
    private int precio;
    private int cantidad;

    public Tecnicas() {
    }

    public Tecnicas(int id, int idTecnica, String nombreProducto, String descProducto, int precio, int cantidad) {
        this.id = id;
        this.idTecnica = idTecnica;
        this.nombreProducto = nombreProducto;
        this.descProducto = descProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(int idTecnica) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
