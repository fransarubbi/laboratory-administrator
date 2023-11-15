
package maquina;
import java.util.ArrayList;

public abstract class Experimento {
    private String titulo;
    private String descripcion;
    private float presupuesto;
    private ArrayList<EquipoLaboratorio> equipo;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private ArrayList<Cientifico> cientifico;

    public Experimento(){
        this.titulo = "";
        this.descripcion = "";
        this.presupuesto = 0;
    }

    public Experimento(String titulo, String descripcion, float presupuesto, ArrayList<EquipoLaboratorio> equipo, ArrayList<Cientifico> cientifico, Fecha fechaInicio, Fecha fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.equipo = equipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cientifico = cientifico;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setEquipo(ArrayList<EquipoLaboratorio> equipo) {
        this.equipo = equipo;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public void setCientifico(ArrayList<Cientifico> cientifico) {
        this.cientifico = cientifico;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public ArrayList<EquipoLaboratorio> getEquipo() {
        return equipo;
    }
    
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }
    
    public ArrayList<Cientifico> getCientifico(){
        return cientifico;
    }
    
    @Override
    public String toString(){
        return "\nTitulo: "+titulo+"\nDescripcion: "+descripcion+"\nPresupuesto: "+presupuesto+"\n\nFecha inicio: "+fechaInicio.getDia()+"/"+fechaInicio.getMes()+"/"+fechaInicio.getAnio()+"\n\nFecha fin: "+fechaFin.getDia()+"/"+fechaFin.getMes()+"/"+fechaFin.getAnio()+"\n\nEquipos de Laboratorio: "+equipo.toString()+"\n\nCientificos involucrados: "+cientifico.toString();
    }
}
