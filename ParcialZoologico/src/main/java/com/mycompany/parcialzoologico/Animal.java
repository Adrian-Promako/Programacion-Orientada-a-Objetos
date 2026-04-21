/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialzoologico;

/**
 *
 * @author GeordyAdrianMorenoMe
 */

// clase animal con susu atributos por defecto 
class Animal {
    public String nombre;
    public int edad;
    public TipoAnimal tipo;

    public Animal(String nombre, int edad, TipoAnimal tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public TipoAnimal getTipo() { return tipo; }

    @Override
    public String toString() {
        return String.format("%s (%s, %d anios)", nombre, tipo, edad);
    }
}
