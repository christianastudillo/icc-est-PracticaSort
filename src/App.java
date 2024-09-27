public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Método de ordenamiento Selección");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        
        int[] arreglo = {10, 5, 8, 2, 0};
        
        // Ordenar de manera ascendente
        System.out.println("***** Ascendente *****");
        int[] arregloOrdenadoAsc = mO.sortBySeleccion(arreglo, true);
        mO.printArreglo(arregloOrdenadoAsc);
        System.out.println();

        // Ordenar de manera descendente
        System.out.println("***** Descendente *****");
        int[] arregloOrdenadoDesc = mO.sortBySeleccion(arreglo, false);
        mO.printArreglo(arregloOrdenadoDesc);
        System.out.println();
        
    }
}
