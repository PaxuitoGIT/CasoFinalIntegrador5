package CasoIntegrador.GestionInformacionCientifica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BusquedaLinealTexto {

    public List<String> palabras;

    public BusquedaLinealTexto(String rutaArchivo) {
        palabras = new ArrayList<>();
        try {
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                palabras.add(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public boolean busquedaLineal(String palabraObjetivo) {
        for (String palabra : palabras) {
            if (palabra.equals(palabraObjetivo)) {
                return true;
            }
        }
        return false;
    }
}