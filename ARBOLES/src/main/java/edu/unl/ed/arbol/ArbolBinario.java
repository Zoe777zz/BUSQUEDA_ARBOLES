package edu.unl.ed.arbol;

import java.util.*;

public class ArbolBinario {
    private TreeNode raiz;

    public ArbolBinario(TreeNode raiz) {
        this.raiz = raiz;
    }

    public void recorridoPreorden() {
        System.out.println("PREORDEN (raíz-izq-der):");
        recorridoPreorden(raiz);
        System.out.println();
    }

    private void recorridoPreorden(TreeNode nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        recorridoPreorden(nodo.izquierda);
        recorridoPreorden(nodo.derecha);
    }

    public void recorridoInorden() {
        System.out.println("INORDEN (izq-raíz-der):");
        recorridoInorden(raiz);
        System.out.println();
    }

    private void recorridoInorden(TreeNode nodo) {
        if (nodo == null) return;
        recorridoInorden(nodo.izquierda);
        System.out.print(nodo.valor + " ");
        recorridoInorden(nodo.derecha);
    }

    public void recorridoPostorden() {
        System.out.println("POSTORDEN (izq-der-raíz):");
        recorridoPostorden(raiz);
        System.out.println();
    }

    private void recorridoPostorden(TreeNode nodo) {
        if (nodo == null) return;
        recorridoPostorden(nodo.izquierda);
        recorridoPostorden(nodo.derecha);
        System.out.print(nodo.valor + " ");
    }

    public void recorridoPorNiveles() {
        System.out.println("POR NIVELES (BFS):");
        recorridoPorNiveles(raiz);
        System.out.println();
    }

    private void recorridoPorNiveles(TreeNode raiz) {
        if (raiz == null) return;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            TreeNode nodoActual = cola.poll();
            System.out.print(nodoActual.valor + " ");

            if (nodoActual.izquierda != null)
                cola.add(nodoActual.izquierda);
            if (nodoActual.derecha != null)
                cola.add(nodoActual.derecha);
        }
    }
}
