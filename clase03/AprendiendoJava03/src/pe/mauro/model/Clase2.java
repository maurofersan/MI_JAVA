
package pe.mauro.model;


public class Clase2 extends Clase1 {
    
    protected final String CIUDAD = "Chiclayo";

    public Clase2() {
        super("Mauro");
    }

    @Override
    public int sumar(int n1, int n2) {
        System.out.println("Ciudad Old: "+ super.CIUDAD);
        System.out.println("Ciudad New: "+ CIUDAD);
        return (n1 + n2)/(n1 - n2); 
    }
    
    public int potencia(int b , int e){
        int p = 1;
        for (int i = 1; i < e; i++) {
            p *= b;
        }
        return p; 
    }
    
    
    
    
    
}
