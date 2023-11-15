/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

/**
 *
 * @author Agustina
 */
public class Fecha {
    private int dia; 
    private int mes; 
    private int anio; 
    
    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    @Override
    public String toString(){
        return "Dia: "+dia+"\nMes: "+mes+"\nAnio: "+anio;
    }
}
