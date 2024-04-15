package CasoIntegrador.HerramientasAnalisisNumerico;

public class PotenciasYMaximos {

    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public int calcularMaximo(int[] lista, int longitud) {
        if (longitud == 1) {
            return lista[0];
        } else {
            int maximo = calcularMaximo(lista, longitud - 1);
            return lista[longitud - 1] > maximo ? lista[longitud - 1] : maximo;
        }
    }
}
