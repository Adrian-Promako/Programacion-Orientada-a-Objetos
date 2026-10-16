package SesionVirtual141026;


/*
Innorder :  Iz , Nodo raiz , Der
Preorder : Nodo raiz, Izq , Der
Postorder : Iz , Der, nodo raiz
*/

public  class ArbolBST {
    Nodo raiz;

    //Constructor
    public ArbolBST() {
        raiz = null;
    }

    //Metodos de arbol.
    public void innorder(Nodo dato){
        if ( dato != null) {
            innorder(dato.izquierdo);
            System.out.println(dato.dato + " ");
            innorder(dato.derecho);
        }
    }
    public void postorder(Nodo raiz) {
        if ( raiz != null){
            postorder(raiz.izquierdo);
            postorder(raiz.derecho);
            System.out.println(raiz.dato);
        }
    }

    public static void main (String []args ) {
        System.out.println("Ejericios de BST: ");



        ArbolBST tree = new ArbolBST();
        Nodo raiz = new Nodo(30);

        raiz.izquierdo = new Nodo(20);
        raiz.derecho = new Nodo(40);
        raiz.izquierdo.izquierdo = new Nodo(10);
        raiz.izquierdo.derecho = new Nodo(15);
        raiz.derecho.izquierdo = new Nodo(35);

        System.out.println("Orden innorder:");
        tree.innorder(raiz);

        System.out.println("Orden postorder:");
        tree.postorder(raiz);
















    }// cierre clase main

}//cierre de clase PPal
