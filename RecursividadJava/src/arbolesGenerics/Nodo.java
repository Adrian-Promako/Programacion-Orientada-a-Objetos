/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesGenerics;

/**
 *
 * @author CRAI

 */
public class Nodo<T> {
    
    public T dato;
    public Nodo<T> izquierdo;
    public Nodo<T> derecho;

    public Nodo (T contenido) {
        this.dato = contenido;
        this.izquierdo = null;
        this.derecho = null;
    }        
    
}
