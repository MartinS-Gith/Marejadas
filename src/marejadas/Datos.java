/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marejadas;

/**
 *
 * @author Duoc
 */
public class Datos {
    protected double anio;
    protected double dia;
    protected double hora;
    protected double mes;

    public Datos() {
    }

    public Datos(double anio, double mes, double dia, double hora) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }
    
    public void mostrar(){
        System.out.println("fecha: "+ anio + "mes:" + mes + "dia:" + dia + "hora:" + hora);
    }
}

