package CasoIntegrador.HerramientasAnalisisNumerico;

public class PotenciasYMaximos {

    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) { //Toda base elevada a 0 es 1
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1); //Se calcula la potencia llamanado a la función recursivamente
        }
    }

    public int calcularMaximo(int[] lista, int longitud) {
        if (longitud == 1) { //Si la longitud es 1, se retorna el único elemento de la lista
            return lista[0];
        } else {
            int maximo = calcularMaximo(lista, longitud - 1); // El máximo se calcula llamando a la función recursivamente
            return lista[longitud - 1] > maximo ? lista[longitud - 1] : maximo; // Pregunta si el último elemento de la lista es mayor al máximo, si es así, retorna el último elemento, si no, retorna el máximo
        }
    }
}
