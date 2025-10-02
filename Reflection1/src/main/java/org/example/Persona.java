package org.example;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }


    private String saludar(){
        return "Hola soy " + nombre;
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
