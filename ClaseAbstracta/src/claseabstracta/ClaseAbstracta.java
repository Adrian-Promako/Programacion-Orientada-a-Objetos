
package claseabstracta;
import java.util.Scanner;

public class ClaseAbstracta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
                            
        System.out.println("Bienvenido a las clases abstractas:  "
                + "\ningresa el lado del cuadrado por favor...");
        
        double teclado = sc.nextDouble();
        Cuadrado cuadrado1 = new Cuadrado();
        
        cuadrado1.setLado(teclado);
        //cuadrado1.calcularArea();
        System.out.println("El area del cuadrado es: "+cuadrado1.calcularArea());
        
        Circulo circulo1 = new Circulo();
        System.out.println("Ahora ingrese el area del circulo...");
        double tecladoCir = sc.nextDouble();
        circulo1.setRadio(tecladoCir);
        
        System.out.println("Ahora el area del circulo es:  "+circulo1.calcularArea());
    }
    
}
