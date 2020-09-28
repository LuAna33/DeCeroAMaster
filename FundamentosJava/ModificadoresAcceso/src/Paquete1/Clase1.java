package Paquete1;

 class Clase1 {
    private String atributoPrivate = "Valor atributo private";
     private String nombre = "XYZ";

     public String getAtributoPrivate() {
         return atributoPrivate;
     }

     public void setAtributoPrivate(String atributoPrivate) {
         this.atributoPrivate = atributoPrivate;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     private Clase1(){
         System.out.println("Constructor Private");
     }
     public Clase1(String argumento){
         this();
        System.out.println("Constructor publico");

    }
     private void metodoDefault(){
        System.out.println("Metodo Private");
    }


}
