package CasoIntegrador.OptimizacionQuick;

public class Quicksort {

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pi = particion(arr, inicio, fin); // Calcula el índice de la particion
            // Ordena de forma recursiva los elementos
            quickSort(arr, inicio, pi - 1);
            quickSort(arr, pi + 1, fin);
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int medio = inicio + (fin - inicio) / 2; // Calcula el medio para usarlo como pivote
        int pivote = mediana(arr[inicio], arr[medio], arr[fin]); // Selecciona el pivote como la mediana de los tres elementos
        while (inicio <= fin) {
            while (arr[inicio] < pivote) { // Avanza el índice de inicio hasta encontrar un elemento mayor que el pivote
                inicio++;
            }
            while (arr[fin] > pivote) { // Retrocede el índice de fin hasta encontrar un elemento menor que el pivote
                fin--;
            }
            if (inicio <= fin) { // Si el índice de inicio es menor o igual que fin, intercambia los elementos
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
        // compara los tres números y retorna el valor mediano
        if ((a < b && b < c) || (c < b && b < a)) return b;
        else if ((b < a && a < c) || (c < a && a < b)) return a;
        else return c;
    }
}