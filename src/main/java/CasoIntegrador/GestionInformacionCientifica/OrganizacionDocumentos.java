package CasoIntegrador.GestionInformacionCientifica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrganizacionDocumentos {

    public void organizarDocumentos(String rutaArchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
           String linea;
           while((linea = br.readLine()) != null) {
               lineas.add(linea);
           }
              br.close();

           Collections.sort(lineas);

            System.out.println("Contenido del archivo ordenado de forma alfabética:");
            for (String l : lineas) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}