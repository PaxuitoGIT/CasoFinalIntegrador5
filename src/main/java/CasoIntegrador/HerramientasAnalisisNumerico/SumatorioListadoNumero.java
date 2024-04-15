package CasoIntegrador.HerramientasAnalisisNumerico;

public class SumatorioListadoNumero {

    public int calcularSumatorio(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calcularSumatorio(n - 1);
        }
    }

    public void calcularListado(int inicio, int fin) {
        if (inicio <= fin) {
            System.out.println(inicio);
            calcularListado(inicio + 1, fin);
        }
    }
}
