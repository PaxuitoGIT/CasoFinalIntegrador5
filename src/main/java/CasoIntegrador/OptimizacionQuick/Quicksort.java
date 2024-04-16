package CasoIntegrador.OptimizacionQuick;

public class Quicksort {

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pi = particion(arr, inicio, fin);
            quickSort(arr, inicio, pi - 1);
            quickSort(arr, pi + 1, fin);
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int mid = inicio + (fin - inicio) / 2;
        int pivote = mediana(arr[inicio], arr[mid], arr[fin]);
        while (inicio <= fin) {
            while (arr[inicio] < pivote) {
                inicio++;
            }
            while (arr[fin] > pivote) {
                fin--;
            }
            if (inicio <= fin) {
                int temp = arr[inicio];
                arr[inicio] = arr[fin];
                arr[fin] = temp;
                inicio++;
                fin--;
            }
        }
        return inicio;
    }

    public static int mediana(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a)) return b;
        else if ((b < a && a < c) || (c < a && a < b)) return a;
        else return c;
    }
}