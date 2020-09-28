package test;

public class TestAutoboxingUnboxing {
    /*
    Autoboxing = Proceso del compilador que convierte un tipo primitivo en un objeto Java
     */
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /*
        int = Integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        char = Character
        byte = Byte
        short = Short
         */
        Integer entero = 10; // Integer clase envolvente
        System.out.println("entero = " + entero);
        System.out.println("entero Cadena = " + entero.toString());// de entero a cadena
        System.out.println("entero float = " + entero.floatValue());
        System.out.println("entero double = " + entero.doubleValue());
       /*
       Unboxing =
        */
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        // con la clase envolvente puedo acceder a metodos
        // entero.
        //entero . toString/ .intValue/ .longValue etc

    }
}
