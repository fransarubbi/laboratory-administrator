
package maquina;
import java.util.ArrayList;


public class ExperimentoFisico extends Experimento{
    private String fenomenoEstudiado;

    public ExperimentoFisico() {
        this.fenomenoEstudiado = "";
    }

    public ExperimentoFisico(String titulo, String descripcion, float presupuesto, String fenomenoEstudiado, ArrayList<EquipoLaboratorio> equipo, ArrayList<Cientifico> cientifico, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, equipo, cientifico, fechaInicio, fechaFin);
        this.fenomenoEstudiado = fenomenoEstudiado;
    }

    public void setFenomenoEstudidado(String fenomenoEstudidado) {
        this.fenomenoEstudiado = fenomenoEstudidado;
    }

    public String getFenomenoEstudidado() {
        return fenomenoEstudiado;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n\nFenomeno Estudiado: "+fenomenoEstudiado;
    }
}
