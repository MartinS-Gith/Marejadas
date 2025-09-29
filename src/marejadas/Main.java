package marejadas;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;


public class Main {
    public static void main (String[] args){
        LectorArchivo lector = new LectorArchivo();
        List<Datos> datos = lector.leer("C:\\Users\\Duoc\\Desktop\\iquique.txt");
        /*
        for(Datos d : datos){
            d.mostrar();
        }
        */
        try{
            //definir la URL
            String urlStr = "https://fundacion-instituto-profesional-duoc-uc.github.io/ATY1102-Surf/Nodo%207%20(-31,-73)%20-%20Tongoy.txt";  
            var url = new URL(urlStr);
            //2.- Crear un archivo temporall
            File tempFile = File.createTempFile("NodoTongoy","txt");
            tempFile.deleteOnExit();
            //3.- copiar desde la url el archivo temporal.
            try(InputStream in = url.openStream()){
                Files.copy(in, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
            //4.- unificar el archivo temporal con los objetos que tenemos creados.
            List<Datos> datosRemotos = lector.leer(tempFile.getAbsolutePath());
            //5.- Mostrar resultados
            for(Datos d : datosRemotos){
                d.mostrar();
            //6.- Ola más alta
            AnalizadorMarejadas analizador = new AnalizadorMarejadas(datos);
            analizador.olaMasAlta();
            break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
