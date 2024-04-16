package CasoIntegrador.AnalisisGenomico;

public class CalculoCombinacionGenetica {

    public void calcularCombinacionGenetica(int n, String combinacion) {
        if (n == 0) { //Si es 0, no existen combinaciones
            System.out.println(combinacion);
        } else { //Si no es 0, se calcula la combinación genética para A, G y T
            calcularCombinacionGenetica(n - 1, combinacion + "A");
            calcularCombinacionGenetica(n - 1, combinacion + "G");
            calcularCombinacionGenetica(n - 1, combinacion + "T");
        }
    }
}
