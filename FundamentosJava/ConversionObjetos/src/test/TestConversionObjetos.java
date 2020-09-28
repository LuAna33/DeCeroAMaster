package test;
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
//Downcasting conversion de una clase tipo padre a hija
//Upcasting conversion de una clase tipo hija a padre.
        Empleado empleado;
        empleado = new Escritor("Juan Acevedo", 1500, TipoEscritura.CLASICO);
       // System.out.println("Empleado = " + empleado);
        System.out.println("Empleado: " + empleado.obtenerDetalles());
       // empleado.getTipoEscritura(); Realizar conversion para acceder al metodo de la clase hija(Escritor)
       // ((Escritor)empleado).getTipoEscritura();// Downcasting
        Escritor escritor = (Escritor) empleado; //conversion click cast Escritor.
        escritor.getTipoEscritura();

        Empleado empleado2 = escritor;// Upcasting no requiere conversion explicita "(Empleado)".
        empleado2.obtenerDetalles();
        System.out.println(empleado2.obtenerDetalles());



    }
}
