/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialzoologico;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.*;
/**
 *
 * @author GeordyAdrianMorenoMe
 */


public class GestionZoologico {

    public static void main(String[] args) {
        
        
        // Configuración inicial de datos reando una lista 
        
        List<Habitat> zoologico = inicializarDatos();

        //  Listariamo todos los animales por tipo
        System.out.println("    Animales agrupados por tipo ");
        Map<TipoAnimal, List<Animal>> porTipo = zoologico.stream()
                .flatMap(h -> h.getAnimales().stream())
                .collect(Collectors.groupingBy(Animal::getTipo));
        porTipo.forEach((tipo, lista) -> System.out.println(tipo + ": " + lista));

        
        
        // Filtrariamos animales por rango de edad 
        System.out.println("\n   Animales entre 5 y 10 anios ");
                 zoologico.stream()
                .flatMap(h -> h.getAnimales().stream())
                .filter(a -> a.getEdad() >= 5 && a.getEdad() <= 10)
                .forEach(System.out::println);
                 

        // Obtener los hábitats con mayor cantidad de animales
        System.out.println("\n   Habitat con mas animales ");
                    zoologico.stream()
                .max(Comparator.comparingInt(h -> h.getAnimales().size()))
                            
                .ifPresent(h -> System.out.println(h.getNombre() + " con " + h.getAnimales().size() + " animales"));

                     
        // Promedio de edad por el habita
        System.out.println("\n  Promedio de edad por habitat ");
                     zoologico.forEach(h -> {
                    double promedio = h.getAnimales().stream()
                    .mapToDouble(Animal::getEdad)
                    .average()
                    .orElse(0.0);
            System.out.printf("Habitat: %s | Promedio de edad: %.2f%n", h.getNombre(), promedio);
        });
    }

    private static List<Habitat> inicializarDatos() {
        Habitat selva = new Habitat("Selva Tropical");
        selva.agregarAnimal(new Animal("Jaguar", 8, TipoAnimal.MAMIFERO));
        selva.agregarAnimal(new Animal("Tucan", 4, TipoAnimal.AVE));
        selva.agregarAnimal(new Animal("Anaconda", 12, TipoAnimal.REPTIL));
        selva.agregarAnimal(new Animal("Chiguiro",3,TipoAnimal.MAMIFERO));
        selva.agregarAnimal(new Animal("Tigrillo",2,TipoAnimal.MAMIFERO));
        selva.agregarAnimal(new Animal("Higuana",4,TipoAnimal.REPTIL));

        Habitat sabana = new Habitat("Sabana");
        sabana.agregarAnimal(new Animal("Leon", 10, TipoAnimal.MAMIFERO));
        sabana.agregarAnimal(new Animal("Cebra", 5, TipoAnimal.MAMIFERO));
        sabana.agregarAnimal(new Animal("Avestruz", 3, TipoAnimal.AVE));
        sabana.agregarAnimal(new Animal("Hiena",8,TipoAnimal.MAMIFERO));
        sabana.agregarAnimal(new Animal("Elefante",10,TipoAnimal.MAMIFERO));
        sabana.agregarAnimal(new Animal("Aguila",17,TipoAnimal.AVE));
        return Arrays.asList(selva, sabana);
    }
}
