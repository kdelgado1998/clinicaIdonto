package controller;

import gestion.DoctorGestion;
import gestion.PacienteGestion;
import gestion.TratamientoGestion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

@Named(value = "respaldoController")
@SessionScoped
public class RespaldoController implements Serializable {

    private String[] archivos = {"Doctor", "Paciente", "Tratamiento"};

    private String[] seleccionados;

    private String archivo;

    public RespaldoController() {
    }

    public String[] getArchivos() {
        return archivos;
    }

    public void setArchivos(String[] archivos) {
        this.archivos = archivos;
    }

    public String[] getSeleccionados() {
        return seleccionados;
    }

    public void setSeleccionados(String[] seleccionados) {
        this.seleccionados = seleccionados;
    }

    public String getArchivo() {
        String patron = "yyyyMMdd_HHmmss_SSS";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        archivo = "Respaldo" + formato.format(new Date()) + ".zip";
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void hacerRespaldo() {
        if (seleccionados != null && seleccionados.length > 0) {
            ZipOutputStream archivoZip;

            File salida = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/temporal/") + archivo);

            try {
                archivoZip = new ZipOutputStream(new FileOutputStream(salida));
                ZipEntry entradaZip;

                for (String s : seleccionados) {
                    if (s.contains("Doctor")) {
                        entradaZip = new ZipEntry("Lista_Doctores.json");
                        archivoZip.putNextEntry(entradaZip);
                        byte[] datos = DoctorGestion.tiraJson().getBytes();
                        archivoZip.write(datos);
                        archivoZip.closeEntry();
                    } else if (s.contains("Paciente")) {
                        entradaZip = new ZipEntry("Lista_Pacientes.json");
                        archivoZip.putNextEntry(entradaZip);
                        byte[] dato = PacienteGestion.tiraJson().getBytes();
                        archivoZip.write(dato);
                        archivoZip.closeEntry();
                    } else if (s.contains("Tratamientos")) {
                        entradaZip = new ZipEntry("Lista_Tratamientos.json");
                        archivoZip.putNextEntry(entradaZip);
                        byte[] dato = TratamientoGestion.tiraJson().getBytes();
                        archivoZip.write(dato);
                        archivoZip.closeEntry();
                    }

                }

                archivoZip.close();

                HttpServletResponse respuesta = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();

                respuesta.setContentType("application/zip");
                respuesta.addHeader("Content-disposition", "attachment; filename=" + archivo);

                ServletOutputStream flujo = respuesta.getOutputStream();
                byte[] zip = Files.readAllBytes(salida.toPath());
                flujo.write(zip);
                flujo.flush();

                FacesContext.getCurrentInstance().responseComplete();
                salida.delete();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(RespaldoController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RespaldoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
