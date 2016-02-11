
package pe.mauro.prueba;

import java.util.Arrays;


public class Prueba05 {
    public static void main(String[] args) {
        
        int [] datos = {10,78,36,14,78,65,14,95};
        
        for (int dato : datos) {
            System.out.print(dato+ " ");           
        }
        System.out.println("");
        Arrays.sort(datos);
        
        for (int dato : datos) {
            System.out.print(dato+ " ");        
        }
        System.out.println("");
    }
    
}
