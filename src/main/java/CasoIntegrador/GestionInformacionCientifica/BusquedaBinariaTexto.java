package CasoIntegrador.GestionInformacionCientifica;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BusquedaBinariaTexto {

    List<String> palabras; //Se crea una lista de palabras

    public BusquedaBinariaTexto(String rutaArchivo) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo))); //Se lee el contenido del archivo
            palabras = Arrays.asList(contenido.split("\\s+")); //Se almacenan las palabras en la lista
            Collections.sort(palabras); //Se ordenan las palabras de forma alfabética
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public boolean busquedaBinaria(String palabraObjetivo) {
        int inicio = 0;
        int fin = palabras.size() - 1;

        while (inicio <= fin) { // Bucle que se ejecuta mientras el inicio sea menor o igual al fin
            int medio = (inicio + fin) / 2; //Se calcula el punto medio de la lista
            int comparador = palabraObjetivo.compareTo(palabras.get(medio)); //Se compara la palabra objetivo con la palabra en la posición media

            if (comparador == 0) //Si las palabras son iguales, se retorna verdadero
                return true;

            if (comparador > 0) //Si la palabra objetivo es mayor a la palabra en la posición media, se actualiza el inicio y vuelve a ejecutar el bucle
                inicio = medio + 1;
            else //Si la palabra objetivo es menor a la palabra en la posición media, se actualiza el fin y vuelve a ejecutar el bucle
                fin = medio - 1;
        }

        return false;
    }
}