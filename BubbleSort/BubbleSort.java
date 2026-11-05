import java.util.Arrays;

public class BubbleSort {

    // Contadores de la última ejecución
    static int comparaciones;
    static int intercambios;
    static int pasadas;

    // Ordena un arreglo de enteros con Bubble Sort (ascendente)
    public static void bubbleSort(int[] arreglo) {
        comparaciones = 0;
        intercambios = 0;
        pasadas = 0;

        int n = arreglo.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            pasadas++;

            // En cada pasada, el elemento mayor "burbujea" hasta su posición final
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambios++;
                    huboIntercambio = true;
                }
            }

            System.out.println("Después de la pasada " + pasadas + ": " + Arrays.toString(arreglo));

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    // Variación opcional: ordena un arreglo de String alfabéticamente con compareTo
    public static void bubbleSort(String[] arreglo) {
        comparaciones = 0;
        intercambios = 0;
        pasadas = 0;

        int n = arreglo.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            pasadas++;

            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    String temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambios++;
                    huboIntercambio = true;
                }
            }

            System.out.println("Pasada " + pasadas + ": " + Arrays.toString(arreglo));

            if (!huboIntercambio) {
                break;
            }
        }
    }

    static void imprimirResumen() {
        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios: " + intercambios);
        System.out.println("Total de pasadas: " + pasadas);
        System.out.println();
    }

    static void probar(String titulo, int[] arreglo) {
        System.out.println(titulo);
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        bubbleSort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
        imprimirResumen();
    }

    public static void main(String[] args) {
        probar("Arreglo original", new int[]{34, 12, 25, 8, 19});
        probar("Arreglo ordenado", new int[]{5, 8, 12, 19, 34});
        probar("Arreglo inverso", new int[]{34, 25, 19, 12, 8});

    }
}