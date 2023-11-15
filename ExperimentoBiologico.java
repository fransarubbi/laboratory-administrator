
package maquina;
import java.util.ArrayList;

public class ExperimentoBiologico extends Experimento {
    private String organismo;

    public ExperimentoBiologico() {
    }

    public ExperimentoBiologico(String titulo, String descripcion, float presupuesto, String organismo, ArrayList<EquipoLaboratorio> equipo,  ArrayList<Cientifico> cientifico, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, equipo, cientifico, fechaInicio, fechaFin);
        this.organismo = organismo;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    public String getOrganismo() {
        return organismo;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n\nOrganismo Estudiado: "+organismo;
    }
}
