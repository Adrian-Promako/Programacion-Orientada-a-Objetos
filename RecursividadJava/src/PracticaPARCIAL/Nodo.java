package PracticaPARCIAL;

public class Nodo {
    int dato;
    Nodo izq;
    Nodo der;

    public Nodo(int valor) {
        this.dato = valor;
        this.izq = null;
        this.der = null;
    }
}
