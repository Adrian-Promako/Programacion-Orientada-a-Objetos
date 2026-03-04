/*
 cla madre con parametros 
 */

package com.mycompany.usuario;

/**
 *
 * @author GeordyAdrianMorenoMe
 */
//Clase principal con sus atributos
public class Usuario {
    
    int dni;
    String nombre;
    int edad;
    
    // cosntructor vacio para setear parametros
    public Usuario() {
    }
        
    //Metodo constructor
    public Usuario(int dni,String nombre, int edad){
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    // getters y Setters
    public int getDni(){
        return dni;
    }    
    void setDni(int dni){
        this.dni = dni;
    }
    public int getEdad(){
        return edad;
    }   
    void setEdad (int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    // Metodo para mostrar la informacion de cada usuario.
    void mostrarInfo(){
        System.out.println(" ------------------------- ");
        System.out.println("DNI: " +dni);
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: "+ edad);
    }

}
