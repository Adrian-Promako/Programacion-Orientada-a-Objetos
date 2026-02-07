/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        
        // creacion de objetos de la clase "Persona"
        Persona p1 = new Persona ();                                            //objeto sin parametros.
        Persona p2 = new Persona (24, "Luis", "Mejia", 9);
        int edad = p2.getEdad();
        int calificacion = p2.getCalificacion();
        // imprrime los datos del objeto persona <p2> tomando sus parametros mendiante el getter
        System.out.println("EL nombre de la persona 2 es: " +p2.getNombre());
        System.out.println("El apellido de la persona 2 es: " +p2.getApellido());
        System.out.println("La edad de la persona 2 es: " + edad +" años");
        System.out.println("Los datos de la persona 2 son: " +p2.getNombre()+ " "+ p2.getApellido()+ " "+p2.getEdad() +" años");
        System.out.println(p2.getNombre()+ " sacaste 9 de nota por lo tanto " +p2.getCalificacion());
    }
    
}
