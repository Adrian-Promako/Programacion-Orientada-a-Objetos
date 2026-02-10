/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // creacion de objetos de la clase "Persona", 
        Persona p1 = new Persona ();                                            //objeto sin parametros.
        Persona p2 = new Persona (24, "Luis", "Mejia", 9);
        int edad = p2.getEdad();
        int calificacion = p2.getCalificacion();
        
        // imprime los datos del objeto persona <p2> tomando sus parametros mendiante el getter
        System.out.println("EL nombre de la persona 2 es: " +p2.getNombre());
        System.out.println("El apellido de la persona 2 es: " +p2.getApellido());
        System.out.println("La edad de la persona 2 es: " + edad +" años");
        System.out.println("Los datos de la persona 2 son: " +p2.getNombre()+ " "+ p2.getApellido()+ " "+p2.getEdad() +" años");
        System.out.println(p2.getNombre()+ " sacaste 9 de nota por lo tanto " +p2.getCalificacion());
        
        // creacion de objeto consultor
        Consultor cons1 = new Consultor();
        
        /* Aqui a la subclase Consultor creamos un objeto cons1, luego llamamos el metodo setNombreConsultor para
        setear o escribir un valor de caracter String , seguido creamos una variable temporal a la cual llamamo el nombre que 
        antes habiamos asignado desde el seteo y finalmente imprimimos el resultado.*/
        cons1.setNombreConsultor("Areglos S.A");
        String nomCons = cons1.getNombreConsultor();
        System.out.println("El nombre del consultor es: " +nomCons);
        
        // este es un metodo mas efectivo para asignar el nombre        
        cons1.setNombreConsultor("El pibe de mi barrio");
        System.out.println("El nombre del consultor con el getter es: " +cons1.getNombreConsultor());
        
        // Creamos el objeto empleado <emp1> , le asignamos un nuevo valor e imprimimos con el getter el nuevo cargo
        Empleado emp1 = new Empleado();
        emp1.setCargo("Jefe produccion");
        System.out.println("El cargo del empleado 1 es: "+emp1.getCargo());
        
        // modificamos datos por ingreso de teclado con un Scanner;
        System.out.println("Ingrese el cargo para el empleado 1...");
        String dato = sc.nextLine();
        emp1.setCargo(dato);
        System.out.println("El nuevo cargo para el empleado es: " +emp1.getCargo());
        
        
    }
    
}
