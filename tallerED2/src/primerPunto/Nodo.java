package primerPunto;
/*
* escribe una función recursiva que reciba la raíz del árbol
* y devuelva la suma de todos los números guardados en sus nodos (internos y hojas).  */

public class Nodo {
   int valor;
   Nodo izquierdo;
   Nodo derecho;

    public Nodo (int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;

    }
}
