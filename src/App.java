public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arreglo = {10, 5, 8, 2, 0};
        int[] arregloOrdenado = mO.sortBySeleccion(arreglo);
        //System.out.println("  ***** Ascendente *****");
        mO.printArreglo(arregloOrdenado);
        System.out.println("  ");
        
    }
}
