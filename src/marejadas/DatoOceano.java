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
     
}

