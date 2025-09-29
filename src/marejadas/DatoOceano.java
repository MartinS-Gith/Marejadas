/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marejadas;

public class DatoOceano extends Datos{
    private double hm0; //altura media de las olas en metros
    private double tz; //periodo medio de la ola en segundos
    private double te; //periodo energético de la hora en segundos

    public DatoOceano(double hm0, double tz, double te, double anio, double mes, double dia, double hora) {
        super(anio, mes, dia, hora);
        this.hm0 = hm0;
        this.tz = tz;
        this.te = te;
    }
    
    //polimorfismo

    @Override
    public void mostrar() {
        System.out.println("fecha: " + anio + "mes:" + mes + "dia:" + dia + "hora:" + hora + "hmo:" + hm0 + "tz:" + tz + "te:" + te);
    }

    public double getHm0() {
        return hm0;
    }

    public void setHm0(double hm0) {
        this.hm0 = hm0;
    }

    public double getTz() {
        return tz;
    }

    public void setTz(double tz) {
        this.tz = tz;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getAnio() {
        return anio;
    }

    public void setAnio(double anio) {
        this.anio = anio;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getMes() {
        return mes;
    }

    public void setMes(double mes) {
        this.mes = mes;
    }
    
    
     
}

