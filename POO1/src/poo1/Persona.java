/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author USUARIO
 */
public class Persona {
    
    int edad ;
    String nombre;
    String apellido;
    int calificacion ;
    
    // contructor vacio.
    public Persona() {
    }
    
    // constructor con parametros usadno la palabra clave "this".
    public Persona (int edad, String nombre,String apellido, int calificacion){
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }
    //bloque de codigo con getter y setter.
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
            
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getCalificacion (){
        return calificacion;
    }
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }

    // creacion del metodo sin retorno o vacio <void>.
        public void mostrarNombre (){
        System.out.println("Hola, soy Adrian y puedo mostrar este mensaje");
    }
        
    // otro metodo complementario con parametros
        public void saberAprobado (int calificacion ){
            if (calificacion >=6){
                System.out.println("Aprobaste la materia");
            }   else {
                System.out.println("uyyy, no aprobe.");
            }
        }
        
        
        
      
}
