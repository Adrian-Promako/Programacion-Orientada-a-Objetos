package primerPunto;


public class Arbolito {
    public static int conteoPares(Nodo raiz){
        if (raiz == null) {
            return 0;
        }
        int cuenta = (raiz.valor % 2 == 0 ) ? 1 : 0;
        return cuenta + conteoPares(raiz.izquierdo)+ conteoPares(raiz.derecho);
    }
    public static int sumar(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } // realiza la suma del nodo iniciql y llama recursivamente
        // el metodo para sumar los valores del surbaol izquierdo mas el del subarbol derecho
        return raiz.valor + sumar(raiz.izquierdo)+sumar(raiz.derecho);
    }
    public static int sumaHojas(Nodo raiz){
        if ( raiz == null ) {
            return 0;
        }
        if (raiz.izquierdo == null && raiz.derecho == null ){// verifica que los nodos no tengan hijos y retorna el valor de estas hojas
            return raiz.valor;
        }
        return sumaHojas(raiz.izquierdo) + sumaHojas(raiz.derecho);
    }
    public static Nodo obtenerMax(Nodo raiz){
        if(raiz == null){
            return null;
        }
        Nodo actual = raiz;
        while (actual.derecho != null){
            actual = actual.derecho;
        }
        return actual;
    }
    public static boolean buscarNumero(Nodo raiz, int objetivo){
        if (raiz == null) {
            return false;
        }
        if (raiz.valor == objetivo){
            return true;
        }
        return buscarNumero(raiz.izquierdo, objetivo) || buscarNumero(raiz.derecho, objetivo);
    }

    public static int contarNodoInterno(Nodo raiz, int limite){
        if (raiz == null){
            return 0;
        }
        boolean esInterno = (raiz.izquierdo != null || raiz.derecho != null);
        int contadorAc = (esInterno && raiz.valor > limite) ? 1 : 0;
            return contadorAc + contarNodoInterno(raiz.izquierdo, limite) + contarNodoInterno(raiz.derecho, limite);
    }

    public static void main(String [] args){
// crear el nodo raiz y los valores de los nodos hijos
        Nodo raiz = new Nodo (20);

        raiz.izquierdo = new Nodo(15);
        raiz.derecho = new Nodo(31);
        raiz.izquierdo.izquierdo = new Nodo(10);
        raiz.izquierdo.derecho = new Nodo(16);
        raiz.derecho.izquierdo = new Nodo(25);

       // System.out.println("Suma total de los valores del arbol: "+ Arbolito.sumar(raiz));
       // System.out.println("conteo de pares: " + Arbolito.conteoPares(raiz) );
       // System.out.println("Suma de los Nodos hoja: " +Arbolito.sumaHojas(raiz));

        Nodo nodoMax = Arbolito.obtenerMax(raiz);
        if (nodoMax != null){
            System.out.println("El nodo de mayo valor es: " +nodoMax.valor);
        }

        int numeroaBuscar = 16;
        boolean resultado = buscarNumero(raiz, numeroaBuscar);
        System.out.println("Busqueda del numero: " +numeroaBuscar + " ,esta en el arbol?? "+ resultado);

        System.out.println("\nNodos internos con valor mayor al limite");
        int limite = 17;
        int resultadoNI = contarNodoInterno(raiz, limite);
        System.out.println("Los nodos internos con un valor mayor a "+limite +" son : " +resultadoNI);

    }
}
