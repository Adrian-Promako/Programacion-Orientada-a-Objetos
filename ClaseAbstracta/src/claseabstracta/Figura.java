
package claseabstracta;

/**
 *
 * @author USUARIO
 */
public abstract class Figura {
    protected double x; // posicion en X
    protected double y; // posicion en Y

    protected Figura() {
    }

    protected Figura(double x, double y) {   //constructores SIEMPRE con  modificador de acceso protected
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea();  // metodos abstractos no se declaran con llaves
    
}
