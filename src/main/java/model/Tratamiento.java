package model;

public class Tratamiento {
    private int id;
    private int idTratamiento;
    private String idPaciente;
    private String idTecnica;
    private String periodontitis;
    private String claseAnteroPosterior;
    private String apiñamiento;
    private String requiereDesgaste;
    private String requiereLimpieza;
    private int requiereExtracciones;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String idPaciente, String idTecnica, String periodontitis, String claseAnteroPosterior, String apiñamiento, String requiereDesgaste, String requiereLimpieza, int requiereExtracciones) {
        this.idTratamiento = idTratamiento;
        this.idPaciente = idPaciente;
        this.idTecnica = idTecnica;
        this.periodontitis = periodontitis;
        this.claseAnteroPosterior = claseAnteroPosterior;
        this.apiñamiento = apiñamiento;
        this.requiereDesgaste = requiereDesgaste;
        this.requiereLimpieza = requiereLimpieza;
        this.requiereExtracciones = requiereExtracciones;
    }

    public int getRequiereExtracciones() {
        return requiereExtracciones;
    }

    public void setRequiereExtracciones(int requiereExtracciones) {
        this.requiereExtracciones = requiereExtracciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(String idTecnica) {
        this.idTecnica = idTecnica;
    }

    public String getPeriodontitis() {
        return periodontitis;
    }

    public void setPeriodontitis(String periodontitis) {
        this.periodontitis = periodontitis;
    }

    public String getClaseAnteroPosterior() {
        return claseAnteroPosterior;
    }

    public void setClaseAnteroPosterior(String claseAnteroPosterior) {
        this.claseAnteroPosterior = claseAnteroPosterior;
    }

    public String getApiñamiento() {
        return apiñamiento;
    }

    public void setApiñamiento(String apiñamiento) {
        this.apiñamiento = apiñamiento;
    }

    public String getRequiereDesgaste() {
        return requiereDesgaste;
    }

    public void setRequiereDesgaste(String requiereDesgaste) {
        this.requiereDesgaste = requiereDesgaste;
    }

    public String getRequiereLimpieza() {
        return requiereLimpieza;
    }

    public void setRequiereLimpieza(String requiereLimpieza) {
        this.requiereLimpieza = requiereLimpieza;
    }
    
    
    
    
}
