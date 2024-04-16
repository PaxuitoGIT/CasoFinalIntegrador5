package CasoIntegrador.GestionInformacionCientifica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrganizacionDocumentos {

    public void organizarDocumentos(String rutaArchivo) {
        ArrayList<String> lineas = new ArrayList<>(); //Se crea un ArrayList para almacenar las líneas del archivo
        try {
            FileReader fr = new FileReader(rutaArchivo); //Se crea un objeto FileReader para leer el archivo
            BufferedReader br = new BufferedReader(fr); //Se crea un objeto BufferedReader para almacenar el contenido del archivo
           String linea; //Se crea una variable para almacenar cada línea del archivo
           while((linea = br.readLine()) != null) { //Comprueba si hay más líneas en el archivo
               lineas.add(linea);
           }
              br.close();

           Collections.sort(lineas); //Se ordenan las líneas de forma alfabética

            System.out.println("Contenido del archivo ordenado de forma alfabética:");
            for (String l : lineas) { //Se recorre el ArrayList y se imprime cada línea
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}