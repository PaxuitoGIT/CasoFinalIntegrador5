package CasoIntegrador.GestionInformacionCientifica;

import java.time.LocalDate;
import java.util.TreeSet;

public class GestionFechas {
    TreeSet<LocalDate> fechas;

    public GestionFechas() {
        this.fechas = new TreeSet<>();
    }

    public void agregarFecha(LocalDate fecha) {
        fechas.add(fecha);
    }

    public void listarFechas() {
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }
    }
}
