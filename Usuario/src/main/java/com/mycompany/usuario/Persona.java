/*
Este es un proyecto que permite practicar la creacion de clases y la instanciacion de sus parametros 
 */
package com.mycompany.usuario;
import java.util.Scanner;
/**
 *
 * @author GeordyAdrianMorenoMe
 */
public class Persona {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        // Creamos los diferentes usuarios de la clase Usuario ( 3 objetos)
        Usuario user1 = new Usuario(23456,"usuario1",30); //usuario creado con parametros en una linea
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();
        
        // Seteamos o adjuntamos los datos a cada usuario             
        user2.setDni(3);
        user2.setNombre("Hellraiser");
        user2.setEdad(34);
        
        user3.setDni(1010218686);
        user3.setNombre("Adrian Moreno");
        user3.setEdad(31);
        
       user1.mostrarInfo();
       user2.mostrarInfo();
       user3.mostrarInfo();            
       
       //______________________________
       UserAdmin admin1 = new UserAdmin();
       UserAdmin admin2 = new UserAdmin();
       
       admin1.setIdAdmin(01);
       admin1.setNombre("Andres");
       admin1.setPermisosAdmin("Ingresar y actualizar el sistema.");
       
      admin1.mostrarInfo();
      
        System.out.println("\nVamos a ingresar los datos para el userAdmin2...");
        System.out.println("ingrese el id del admin:..");
        admin2.setIdAdmin(sc.nextInt());
        sc.nextLine();
        System.out.println("Ahora el nombre");
        admin2.setNombre(sc.nextLine());
        System.out.println("Ingrese los permisos de el admin2...");
        admin2.setPermisosAdmin(sc.nextLine());
        admin2.mostrarInfo();
        sc.close();
       
       /* Creamos un condicional en el cual ponemos a pruba el parametro de 
       edad del user1 invocando el metodo getEdad que a su vez toma la edad que hemos seteado mediante el 
       metodo setEdad (17) */
        System.out.println("\nLa edad del usuario corresponde a un mayor de edad?");
       int edad = user2.getEdad();
       if (edad >= 18){
           System.out.println("Es mayor de edad.");
       }    else {
           System.out.println("No es mayor de edad.");
       }
       
    }
    
}
