
package maquina;


public class EquipoLaboratorio {
    private String nombre;
    private String descripcion;
    private String area;

    public EquipoLaboratorio() {
    }

    public EquipoLaboratorio(String nombre, String descripcion, String area) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getArea() {
        return area;
    }
    
    @Override
    public String toString(){
        //return "\nNombre: "+nombre+"\nDescripcion: "+descripcion+"\nArea: "+area;
        return "\n*Nombre: "+nombre+"*Descripcion: "+descripcion+"*Area: "+area;
    }
}
