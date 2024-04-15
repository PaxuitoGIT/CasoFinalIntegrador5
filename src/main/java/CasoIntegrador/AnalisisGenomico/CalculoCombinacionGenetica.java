package CasoIntegrador.AnalisisGenomico;

public class CalculoCombinacionGenetica {

    public void calcularCombinacionGenetica(int n, String combinacion) {
        if (n == 0) {
            System.out.println(combinacion);
        } else {
            calcularCombinacionGenetica(n - 1, combinacion + "A");
            calcularCombinacionGenetica(n - 1, combinacion + "G");
            calcularCombinacionGenetica(n - 1, combinacion + "T");
        }
    }
}
