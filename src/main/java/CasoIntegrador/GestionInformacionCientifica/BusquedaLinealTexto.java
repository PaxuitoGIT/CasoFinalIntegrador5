package CasoIntegrador.GestionInformacionCientifica;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BusquedaLinealTexto {

    List <String> palabras;

    public BusquedaLinealTexto(String rutaArchivo) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo))); //Se lee el contenido del archivo
            palabras = Arrays.asList(contenido.split("\\s+")); //Se almacenan las palabras en la lista
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public boolean busquedaLineal(String palabraObjetivo) {
        for (String palabra : palabras) { //Se recorre la lista de palabras de uno en uno y se compara con la palabra objetivo hasta encontrarla
            if (palabra.equals(palabraObjetivo)) {
                return true;
            }
        }
        return false;
    }
}