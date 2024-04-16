package CasoIntegrador.HerramientasAnalisisNumerico;

public class SumatorioListadoNumero {

    public int calcularSumatorio(int n) {
        if (n <= 0) { //Si n es menor o igual a 0, se retorna 0
            return 0;
        } else { //Si n es mayor a 0, se calcula el sumatorio llamando a la función recursivamente
            return n + calcularSumatorio(n - 1);
        }
    }

    public void calcularListado(int inicio, int fin) {
        if (inicio <= fin) { //Si el inicio es menor o igual al fin, se imprime el inicio y se llama a la función recursivamente
            System.out.println(inicio); //Imprime el inicio
            calcularListado(inicio + 1, fin); //Llama a la función recursivamente hasta que el inicio sea mayor al fin
        }
    }
}
