package CasoIntegrador;

import CasoIntegrador.AnalisisGenomico.CalculoCombinacionGenetica;
import CasoIntegrador.AnalisisGenomico.ConteoGenes;
import CasoIntegrador.HerramientasAnalisisNumerico.SumatorioListadoNumero;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        ConteoGenes conteoGenes = new ConteoGenes();
        CalculoCombinacionGenetica calculoCombinacionGenetica = new CalculoCombinacionGenetica();
        SumatorioListadoNumero sumatorioListadoNumero = new SumatorioListadoNumero();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                int count = conteoGenes.contarGenes("ATGTAAGATGCATTGATG", 0);
                System.out.println("Número de genes: " + count);
                break;
            case 2:
                calculoCombinacionGenetica.calcularCombinacionGenetica(3, "");
                break;
            case 3:
                int sumatorio = sumatorioListadoNumero.calcularSumatorio(10);
                System.out.println("Sumatorio: " + sumatorio);
                sumatorioListadoNumero.calcularListado(1, 10);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
