package PracticaPARCIAL;

public class ArbolBST {
    Nodo raiz ;

    public ArbolBST(){
        raiz = null;
    }

    public static Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        } //si el dato a ingresar es MENOR que el dato de la raiz , va insertar un nuevo valor en el
        // nuevo nodo izquierdo
        if(valor < raiz.dato) {
            raiz.izq = insertar(raiz.izq, valor);
            /* Si el nuevo valor es mayor al dato del nodo raiz, va a insertar este nuevo valor a
            * el nuevo nodo derecho */
        } else if (valor > raiz.dato) {
            raiz.der = insertar(raiz.der, valor);
        }
        return raiz;
    }

    public void innorder (Nodo raiz){
        if (raiz != null) {
            innorder(raiz.izq);
            System.out.println(raiz.dato );
            innorder(raiz.der);
        }
    }

        public static void main(String [] args) {

            ArbolBST arbol = new ArbolBST();
            /* aqui instanciamos la nueva raiz del arbol, al objeto arbol en nu raiz
            * instn */
            arbol.raiz = ArbolBST.insertar(arbol.raiz, 50);

            arbol.raiz = ArbolBST.insertar(arbol.raiz ,40);
            arbol.raiz = ArbolBST.insertar(arbol.raiz, 25);
            arbol.raiz = ArbolBST.insertar(arbol.raiz, 10);

            arbol.innorder(arbol.raiz);


    }
}
