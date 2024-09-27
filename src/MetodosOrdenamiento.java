public class MetodosOrdenamiento {
        // Método de ordenamiento por selección
    public int[] sortBySeleccion(int[] arreglo, boolean ascendente) {
        int tamanio = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                // Condición para ordenar ascendente o descendente
                if (ascendente) {
                    if (arreglo[j] < arreglo[indice]) {
                        indice = j;
                    }
                } else {
                    if (arreglo[j] > arreglo[indice]) {
                        indice = j;
                    }
                }
            }
            // Intercambio del índice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    // Método para imprimir el arreglo
    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}