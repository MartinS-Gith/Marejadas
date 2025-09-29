
package marejadas;

import java.io.*;
import java.util.*;


public class LectorArchivo {
    public List<Datos> leer(String nombreArchivo){
        List<Datos> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            boolean primera = true; //Salta cabecera
            while((linea = br.readLine()) != null){
                if(primera){
                    primera = false;
                continue;
            }
            String[] partes = linea.trim().split("\\s+");
            if(partes.length >= 7){
                double anio = Double.parseDouble(partes[0]);
                double mes = Double.parseDouble(partes[1]);
                double dia = Double.parseDouble(partes[2]);
                double hora = Double.parseDouble(partes[3]);
                double hm0 = Double.parseDouble(partes[4]);
                double tz = Double.parseDouble(partes[5]);
                double te = Double.parseDouble(partes[6]);
                
                lista.add(new DatoOceano(hm0, tz, te, anio, mes, dia, hora));
            }
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
}

            
    