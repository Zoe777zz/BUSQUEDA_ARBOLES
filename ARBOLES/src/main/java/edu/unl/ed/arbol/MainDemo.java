package edu.unl.ed.arbol;

public class MainDemo {
    public static void main(String[] args) {
        String ruta = "Archivos/arbol_10_nodos.txt";

        // ════════════════════════════════════════════════════════════════
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                        RECORRIDOS DE ÁRBOL                     ║");
        System.out.println("║              Árbol Binario - 10 Nodos                          ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.println("║  Archivo: " + ruta + "                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        // Cargar árbol
        TreeNode raiz = CargadorArbol.desdeArchivo(ruta);
        ArbolBinario arbol = new ArbolBinario(raiz);


        System.out.println("PREORDEN (Raíz → Izquierda → Derecha)");
        arbol.recorridoPreorden();
        System.out.println("═".repeat(70) + "\n");


        System.out.println("INORDEN (Izquierda → Raíz → Derecha)");
        arbol.recorridoInorden();
        System.out.println("═".repeat(70) + "\n");


        System.out.println("POSTORDEN (Izquierda → Derecha → Raíz)");
        arbol.recorridoPostorden();
        System.out.println("═".repeat(70) + "\n");


        System.out.println("POR NIVELES (BFS con Cola)");
        arbol.recorridoPorNiveles();
        System.out.println("═".repeat(70) + "\n");


        System.out.println(" VERIFICACIÓN: Nodos visitados correctamente");

    }
}
