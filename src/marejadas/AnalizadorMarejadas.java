package marejadas;

import java.util.*;

public class AnalizadorMarejadas {
    private List<DatoOceano> datos;
    
    public AnalizadorMarejadas(List<Datos> lista){
        this.datos = new ArrayList<>();
        for(Datos d: lista){
            if(d instanceof DatoOceano){
                this.datos.add((DatoOceano) d);
            }
        }
    }
    public void olaMasAlta(){
        if(datos.isEmpty()) return;
        
        DatoOceano max = datos.get(0);
        for(DatoOceano d : datos){
            if(d.getHm0() > max.getHm0()){
                max = d;
            }
        }
        System.out.println("\n ola más alta registrada");
        max.mostrar();
    }
}
