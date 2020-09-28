package test;

import domain.Persona;

public class ForEach {
    public static void main(String[] args) {
        int edades[] = {8, 7, 3, 5};
        for (int edad : edades) {//reemplaza al contador del for recorre el arreglo edades.
            System.out.println("edad = " + edad);
            // para acceder a un indice especifico utilizar la sintaxis for con contador
        }
        Persona personas[] = {new Persona("Juan"), new Persona("Sandra"), new Persona("Pedro")};
        // var no puede ser utilizada en arreglos.
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}