
package pe.mauro.model;


public class Clase1 {
    
    protected final String CIUDAD = "LIMA";
    
    public Clase1(){
        System.out.println("Hola javaveros de SistemasUNI");
    }
   
     public Clase1(String nombre){
        System.out.println("Hola amigo(s) "+ nombre); 
    }
    
    public int sumar(int n1, int n2){
        return n1 + n2;
    }
    
    public int restar(int n1, int n2){
        return n1 - n2;
    }
}
