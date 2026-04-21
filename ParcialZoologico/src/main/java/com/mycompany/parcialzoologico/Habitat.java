/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialzoologico;
import java.util.*;
/**
 *
 * @author GeordyAdrianMorenoMe
 */
//constructores de la clase y sus atributos y creacion de lista con elementos de clase animal

class Habitat {
    
    public String nombre;
    private List<Animal> animales;

    public Habitat(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public String getNombre() { return nombre; }
    public List<Animal> getAnimales() { return animales; }
}