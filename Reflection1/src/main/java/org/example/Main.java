package org.example;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clasePersona = Class.forName("org.example.Persona");

            System.out.println("Constructores de Persona:");
            Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();
            for (Constructor<?> constructor : constructores) {
                System.out.println(" - " + constructor);
            }

            Constructor<?> constructorConArgs = clasePersona.getConstructor(String.class, int.class);
            Object personaObj = constructorConArgs.newInstance("Luciano", 25);

            Field nombreField = clasePersona.getDeclaredField("nombre");
            nombreField.setAccessible(true); // romper encapsulamiento
            nombreField.set(personaObj, "Carlos");

            Method mostrarInfo = clasePersona.getMethod("mostrarInfo");
            mostrarInfo.invoke(personaObj);

            Method saludarMethod = clasePersona.getDeclaredMethod("saludar");
            saludarMethod.setAccessible(true);

            String saludo = (String) saludarMethod.invoke(personaObj);
            System.out.println("Saludo privado: " + saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
