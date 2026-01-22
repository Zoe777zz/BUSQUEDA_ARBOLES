package edu.unl.ed.arbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class CargadorArbol {

    public static TreeNode desdeArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            int n = Integer.parseInt(br.readLine().trim());


            HashMap<Integer, TreeNode> nodos = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] datos = br.readLine().trim().split(";");
                int indice = Integer.parseInt(datos[0]);
                int valor = Integer.parseInt(datos[1]);

                // Crea el nodo
                TreeNode nodo = new TreeNode(valor);
                nodos.put(indice, nodo);
            }


            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader(rutaArchivo));
            br2.readLine();

            for (int i = 0; i < n; i++) {
                String[] datos = br2.readLine().trim().split(";");
                int indice = Integer.parseInt(datos[0]);
                int izq = Integer.parseInt(datos[2]);
                int der = Integer.parseInt(datos[3]);

                TreeNode nodo = nodos.get(indice);
                if (izq != -1) nodo.izquierda = nodos.get(izq);
                if (der != -1) nodo.derecha = nodos.get(der);
            }
            br2.close();


            return nodos.get(0);

        } catch (Exception e) {
            throw new RuntimeException("Error cargando árbol: " + e.getMessage());
        }
    }
}
