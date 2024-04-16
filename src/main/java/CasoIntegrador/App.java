package CasoIntegrador;

import CasoIntegrador.AnalisisGenomico.CalculoCombinacionGenetica;
import CasoIntegrador.AnalisisGenomico.ConteoGenes;
import CasoIntegrador.GestionInformacionCientifica.BusquedaBinariaTexto;
import CasoIntegrador.GestionInformacionCientifica.BusquedaLinealTexto;
import CasoIntegrador.GestionInformacionCientifica.GestionFechas;
import CasoIntegrador.GestionInformacionCientifica.OrganizacionDocumentos;
import CasoIntegrador.HerramientasAnalisisNumerico.PotenciasYMaximos;
import CasoIntegrador.HerramientasAnalisisNumerico.SumatorioListadoNumero;
import CasoIntegrador.OptimizacionQuick.Quicksort;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Instanciación de las clases
        ConteoGenes conteoGenes = new ConteoGenes();
        CalculoCombinacionGenetica calculoCombinacionGenetica = new CalculoCombinacionGenetica();
        SumatorioListadoNumero sumatorioListadoNumero = new SumatorioListadoNumero();
        PotenciasYMaximos potenciasYMaximos = new PotenciasYMaximos();
        OrganizacionDocumentos organizacionDocumentos = new OrganizacionDocumentos();
        BusquedaLinealTexto busquedaLinealTexto = new BusquedaLinealTexto("ejemplo.txt");
        BusquedaBinariaTexto busquedaBinariaTexto = new BusquedaBinariaTexto("ejemplo.txt");
        GestionFechas gestionFechas = new GestionFechas();
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Conteo de genes");
            System.out.println("2. Cálculo de combinación genética");
            System.out.println("3. Sumatorio y listado de números");
            System.out.println("4. Potencias y máximo de una lista de números");
            System.out.println("5. Organización de documentos");
            System.out.println("6. Búsqueda lineal de texto");
            System.out.println("7. Búsqueda binaria de texto");
            System.out.println("8. Gestion de fechas");
            System.out.println("9. Optimización QuickSort");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción:");

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1: // Conteo de genes
                        int count = conteoGenes.contarGenes("ATGTAAGATGCATTGATG", 0);
                        System.out.println("Número de genes: " + count);
                        break;
                    case 2: // Cálculo de combinación genética
                        calculoCombinacionGenetica.calcularCombinacionGenetica(3, "");
                        break;
                    case 3: // Sumatorio y listado de números
                        int sumatorio = sumatorioListadoNumero.calcularSumatorio(10);
                        System.out.println("Sumatorio: " + sumatorio);
                        sumatorioListadoNumero.calcularListado(1, 10);
                        break;
                    case 4: // Potencias y máximo de una lista de números
                        int potencia = potenciasYMaximos.calcularPotencia(2, 3);
                        System.out.println("Potencia: " + potencia);
                        int[] lista = {1, 5, 25, 10, 4};
                        int maximo = potenciasYMaximos.calcularMaximo(lista, lista.length);
                        System.out.println("Máximo: " + maximo);
                        break;
                    case 5: // Organización de documentos
                        organizacionDocumentos.organizarDocumentos("ejemplo.txt");
                        break;
                    case 6: // Búsqueda lineal de texto
                        boolean encontrado = busquedaLinealTexto.busquedaLineal("zapato");
                        System.out.println("Encontrado: " + encontrado);
                        break;
                    case 7: // Búsqueda binaria de texto
                        boolean encontradoBinario = busquedaBinariaTexto.busquedaBinaria("zapato");
                        System.out.println("Encontrado: " + encontradoBinario);
                        break;
                    case 8: // Gestion de fechas
                        while (true) {
                            System.out.println("1. Añadir fecha");
                            System.out.println("2. Ordenar fechas");
                            System.out.println("3. Salir");
                            int option = scanner.nextInt();

                            switch (option) {
                                case 1: // Añadir fecha
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
                                case 2: // Ordenar fechas
                                    gestionFechas.listarFechas();
                                    break;
                                case 3: // Exit
                                    return;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        }
                    case 9: // Optimización QuickSort
                        int[] arr = {10, 14, 26, 8, 53, 87, 12, 50};
                        Quicksort.quickSort(arr, 0, arr.length - 1);
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        break;
                    case 0: // Salir
                        salir = true;
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número");
                scanner.next();
            }
        }
    }
}
