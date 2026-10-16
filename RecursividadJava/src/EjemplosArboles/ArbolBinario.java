package EjemplosArboles;

public class ArbolBinario {
    Nodo raiz;

    //constructor
    public ArbolBinario() {
        raiz = null;
    }

    //metodo preorder  Root-Lf-Rg
    public void preorder(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.dato+ " ");
            preorder(nodo.izquierdo);
            preorder(nodo.derecho);
        }
    }
    //metodo inorder    Lf-Root-Rg
    public void inorder(Nodo nodo) {
        if (nodo != null) {
            inorder(nodo.izquierdo);
            System.out.println(nodo.dato+ " ");
            inorder(nodo.derecho);
        }
    }

    //metodo postorder  Lf-Rg-Root
    public void postorder(Nodo nodo) {
        if(nodo != null) {
            postorder(nodo.izquierdo);
            postorder(nodo.derecho);
            System.out.println(nodo.dato+ " ");
        }
    }

    public void insert (int dato) {
        raiz = insertRecurs(raiz, dato);
        }

        private Nodo insertRecurs(Nodo raiz, int dato) {
            if (raiz == null) {
                raiz = new Nodo(dato);
                return raiz;
            }
            if (dato < raiz.dato) {
                raiz.izquierdo = insertRecurs(raiz.izquierdo,dato);
            } else if (dato > raiz.dato) {
                raiz.derecho = insertRecurs(raiz.derecho,dato);
            }
            return raiz;
        }

}
