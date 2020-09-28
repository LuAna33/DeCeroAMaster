package test;

import domain.*;

public class TestPolimorfismo {
    public static void main(String[] args) {

        //Gerente gerente1 = new Gerente("Juan Acosta", 250.5,"Exportaciones");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Luis Perez", 500);
        //System.out.println("Empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Karen", 1000, "Sistemas");
        //System.out.println("Gerente 1 = " + gerente1.obtenerDetalles());
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado : " + empleado.obtenerDetalles());

    }

}

