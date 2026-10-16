package Parcializado2;

public class Arbol {
    Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public static Nodo insert(Nodo raiz, int valor){
        if (raiz == null){
            return new Nodo(valor);
        }
        if (valor < raiz.dato){
            raiz.izq = insert(raiz.izq, valor);
        } else if (valor > raiz.dato) {
            raiz.der = insert(raiz.der ,valor);
        }
        return raiz;
    }

    //metodo que recorrer Iz, Root, Der    evalua
    public void innorder(Nodo raiz) {
        if (raiz != null){
            innorder(raiz.izq);
            System.out.println(raiz.dato);;
            innorder(raiz.der);
        }
    }


    static void main() {

        Arbol arbol = new Arbol();
        arbol.raiz = Arbol.insert(arbol.raiz,30);




    }




}
