package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        //Gerente gerente1 = new Gerente("Juan Acosta", 250.5,"Exportaciones");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Luis Perez", 500);
        System.out.println("Empleado = " + empleado);
        determinarTipo(empleado);
        empleado = new Gerente("Juan Acosta", 250.5," Exportaciones");
        System.out.println("Empleado = " + empleado.determinarTipo());
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();
            System.out.println("Departamento = " + gerente.getDepartamento());
        }
            else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            }
            else if(empleado instanceof Object){
            System.out.println("Es de tipoo Object");
            }
    }
}
