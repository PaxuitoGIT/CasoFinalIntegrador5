package CasoIntegrador;

import CasoIntegrador.AnalisisGenomico.CalculoCombinacionGenetica;
import CasoIntegrador.AnalisisGenomico.ConteoGenes;
import CasoIntegrador.GestionInformacionCientifica.BusquedaBinariaTexto;
import CasoIntegrador.GestionInformacionCientifica.BusquedaLinealTexto;
import CasoIntegrador.GestionInformacionCientifica.GestionFechas;
import CasoIntegrador.GestionInformacionCientifica.OrganizacionDocumentos;
import CasoIntegrador.HerramientasAnalisisNumerico.PotenciasYMaximos;
import CasoIntegrador.HerramientasAnalisisNumerico.SumatorioListadoNumero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        ConteoGenes conteoGenes = new ConteoGenes();
        CalculoCombinacionGenetica calculoCombinacionGenetica = new CalculoCombinacionGenetica();
        SumatorioListadoNumero sumatorioListadoNumero = new SumatorioListadoNumero();
        PotenciasYMaximos potenciasYMaximos = new PotenciasYMaximos();
        OrganizacionDocumentos organizacionDocumentos = new OrganizacionDocumentos();
        BusquedaLinealTexto busquedaLinealTexto = new BusquedaLinealTexto("ejemplo.txt");
        BusquedaBinariaTexto busquedaBinariaTexto = new BusquedaBinariaTexto("ejemplo.txt");
        GestionFechas gestionFechas = new GestionFechas();
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
            case 4:
                int potencia = potenciasYMaximos.calcularPotencia(2, 3);
                System.out.println("Potencia: " + potencia);
                int[] lista = {1, 5, 25, 10, 4};
                int maximo = potenciasYMaximos.calcularMaximo(lista, lista.length);
                System.out.println("Máximo: " + maximo);
                break;
            case 5:
                organizacionDocumentos.organizarDocumentos("ejemplo.txt");
                break;
            case 6:
                boolean encontrado = busquedaLinealTexto.busquedaLineal("zapato");
                System.out.println("Encontrado: " + encontrado);
                break;
            case 7:
                boolean encontradoBinario = busquedaBinariaTexto.busquedaBinaria("zapato");
                System.out.println("Encontrado: " + encontradoBinario);
                break;
            case 8:
                while (true) {
                    System.out.println("1. Añadir fecha");
                    System.out.println("2. Ordenar fechas");
                    System.out.println("3. Exit");
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Introduce una fecha dd/mm/yyyy:");
                            String dateString = scanner.next();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            try {
                                LocalDate date = LocalDate.parse(dateString, formatter);
                                gestionFechas.agregarFecha(date);
                            } catch (DateTimeParseException e) {
                                System.out.println("Fecha no válida");
                            }
                            break;
                        case 2:
                            gestionFechas.listarFechas();
                            break;
                        case 3:
                            return;
                        default:
                            System.out.println("Opción no válida");
                    }
                }
            default:
                System.out.println("Opción no válida");
        }
    }
}
