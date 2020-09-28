package Paquete1;

import Paquete1.Clase1;
import Paquete1.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Default");
       /* System.out.println("clase1 = " + clase1.atributoDefault);
        clase1.metodoDefault();
        ClaseHija claseHija = new ClaseHija();  */
       clase1.setAtributoPrivate("Cambio Atributo");
        System.out.println("Atributo Privado = " + clase1.getAtributoPrivate());
       clase1.setNombre("ABC");
        System.out.println("Nombre = " + clase1.getNombre());
    }

}
