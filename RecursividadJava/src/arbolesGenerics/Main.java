/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesGenerics;

/**
 *
 * @author CRAI
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Arboles genericos");
        
        Nodo<String> nuevoNodo = new Nodo<>("Hola mundo");
        Nodo<Integer> nodoEntero = new Nodo<> (77);

        System.out.println("El nodo con la frase dice: "+nuevoNodo.dato);
        System.out.println("El nodo con el valor numerico contoiene: "+nodoEntero.dato);
    }
    
}
