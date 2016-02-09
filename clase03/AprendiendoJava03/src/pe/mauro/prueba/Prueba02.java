package pe.mauro.prueba;

import pe.mauro.model.Clase1;
import pe.mauro.model.Clase2;
import pe.mauro.model.Clase3;
import pe.mauro.model.Clase4;

public class Prueba02 {

    public static void main(String[] args) {
        Clase2 obj = new Clase2();

        System.out.println("Compatibilidad de un objeto de Clase2");
        System.out.println("Object: " + ((obj instanceof Object) ? "SI" : "NO"));
        System.out.println("Clase1: " + ((obj instanceof Clase1) ? "SI" : "NO"));
        System.out.println("Clase2: " + ((obj instanceof Clase2) ? "SI" : "NO"));
        System.out.println("Clase3: " + ((obj instanceof Clase3) ? "SI" : "NO"));
        System.out.println("Clase4: " + ((obj instanceof Clase4) ? "SI" : "NO"));
        
        
    }

}
