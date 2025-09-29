/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.polimorfico;


/*EQUIPO DINAMITABOOM 
//INTEGRANTES Alondra Vianney Hernandez Torres
Kevin Cuevas Castillo GTID0141**/
/**
 *
 * @author vians
 */
public class dinamitaboom {

    public static abstract class Animal {
        protected String nombre;
        protected int edad;

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public abstract void hacerSonido();
        public abstract void moverse();

        public void mostrarInfo() {
            System.out.println("Soy una " + this.getClass().getSimpleName() +
                    " llamada \"" + nombre + "\", tengo " + edad + " años.");
        }
    }

    // Clase Tortuga
    public static class Tortuga extends Animal {
        public Tortuga(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println("Tuuuur...plop ");
        }

        @Override
        public void moverse() {
            System.out.println("Estoy caminando lentamente.");
        }
    }

    // Clase Abeja
    public static class Abeja extends Animal {
        public Abeja(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println("Brrzzz-brrzzz-piuuu");
        }

        @Override
        public void moverse() {
            System.out.println("Estoy volando de flor en flor.");
        }
    }

    // Clase Rana
    public static class Rana extends Animal {
        public Rana(String nombre, int edad) {
            super(nombre, edad);
        }

        @Override
        public void hacerSonido() {
            System.out.println("CROOAC–Wiii!");
        }

        @Override
        public void moverse() {
            System.out.println("Estoy saltando en los charcos.");
        }
    }

   //////////////////PARTE MAIN////////////////////
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];
        zoo[0] = new Tortuga("Leonardo DiCaparazio", 40);
        zoo[1] = new Abeja("Bee-yonce", 3);
        zoo[2] = new Rana("Croac Obama", 7);

        for (Animal animal : zoo) {
            animal.mostrarInfo();
            animal.hacerSonido();
            animal.moverse();
            System.out.println();
        }
    }
}
