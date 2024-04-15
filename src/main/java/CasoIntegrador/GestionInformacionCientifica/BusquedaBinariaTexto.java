package CasoIntegrador.GestionInformacionCientifica;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BusquedaBinariaTexto {

    List<String> palabras;

    public BusquedaBinariaTexto(String rutaArchivo) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
            palabras = Arrays.asList(contenido.split("\\s+"));
            Collections.sort(palabras);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public boolean busquedaBinaria(String palabraObjetivo) {
        int inicio = 0;
        int fin = palabras.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int comparador = palabraObjetivo.compareTo(palabras.get(medio));

            if (comparador == 0)
                return true;

            if (comparador > 0)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }

        return false;
    }
}