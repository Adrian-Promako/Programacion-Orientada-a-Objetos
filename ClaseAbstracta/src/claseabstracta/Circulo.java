
package claseabstracta;


public class Circulo extends Figura {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public double calcularArea() {
        double resultado = Math.PI*Math.pow(radio, 2);
        return resultado;
        
    }
    
}
