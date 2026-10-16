package EjemplosArboles;

public class Main {


    public static void main(String[] args) {
        System.out.println("Creacion de arboles");

        ArbolBinario arbol = new ArbolBinario();

        arbol.insert(10);
        arbol.insert(15);
        arbol.insert(25);
        arbol.insert(35);
        arbol.insert(47);
        arbol.insert(8);

        System.out.println("ordenamiento inorder");
        arbol.inorder(arbol.raiz);

        System.out.println("ordenamiento preorder");
        arbol.preorder(arbol.raiz);

        System.out.println("ordenamiento postorder");
        arbol.postorder(arbol.raiz);







    }
}
