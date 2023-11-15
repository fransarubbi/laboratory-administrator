/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

import java.util.ArrayList;
import maquina.Experimento;

/**
 *
 * @author Agustina
 */
public class Cientifico {
    private String nombre;
    private int edad;
    private String especialidad;
    private Fecha contratacion;
    private int cantidad;

    public Cientifico() {
    }
    
    public Cientifico(String nombre, int edad, String especialidad, Fecha contratacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.contratacion = contratacion;
        this.cantidad = 0;
    }
    
    public Cientifico(String nombre, int edad, int cantidad, String especialidad, Fecha contratacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.contratacion = contratacion;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setContratacion(Fecha contratacion) {
        this.contratacion = contratacion;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Fecha getContratacion() {
        return contratacion;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public String toString(){
        //return "\nNombre: "+nombre+"Edad: "+edad+"\nEspecialidad: "+especialidad+"Cantidad de experimentos involucrados: "+cantidad+"\nContratacion: "+contratacion.getDia()+"/"+contratacion.getMes()+"/"+contratacion.getAnio()+"\n";
        return "\n*Nombre: "+nombre+"*Edad: "+edad+"\n*Especialidad: "+especialidad+"*Contratacion: "+contratacion.getDia()+"/"+contratacion.getMes()+"/"+contratacion.getAnio()+"\n";
    }
}
