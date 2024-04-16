package CasoIntegrador.GestionInformacionCientifica;

import java.time.LocalDate;
import java.util.TreeSet;

public class GestionFechas {
    TreeSet<LocalDate> fechas; //Se crea un conjunto TreeSet para almacenar las fechas

    public GestionFechas() { //Constructor de la clase
        this.fechas = new TreeSet<>();
    }

    public void agregarFecha(LocalDate fecha) { //Método para agregar una fecha al conjunto
        fechas.add(fecha);
    }

    public void listarFechas() { //Método para listar las fechas almacenadas en el conjunto
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }
    }
}
