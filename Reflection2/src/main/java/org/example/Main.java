package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Caja<String> cajaString = new Caja<>("Hola Mundo");
        System.out.println(cajaString);
        System.out.println("Contenido: " + cajaString.getContenido());


        Caja<Integer> cajaInt = new Caja<>(123);
        System.out.println(cajaInt);
        System.out.println("Contenido: " + cajaInt.getContenido());


        List<String> listaGenerica = new ArrayList<>();
        listaGenerica.add("UTN");
        listaGenerica.add("Programación III");
        // listaGenerica.add(100); // ❌ error en compilación
        System.out.println("Lista genérica: " + listaGenerica);


        List listaSinGenerics = new ArrayList();
        listaSinGenerics.add("Hola");
        listaSinGenerics.add(123); // ✅ se permite
        System.out.println("Lista sin genéricos: " + listaSinGenerics);


        String texto = (String) listaSinGenerics.get(0); // OK

    }
}
