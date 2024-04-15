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
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
            palabras = Arrays.asList(contenido.split("\\s+"));
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