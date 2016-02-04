
package pe.mauro.app.prueba;

import pe.mauro.app.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba04 {
    
    public static void main(String[] args) {
       Producto prod1 = new Producto();
        mostrar(prod1);
        
        Producto prod2 = new Producto("Tele", 100, 3000.3, true);
        System.out.println("--------------");
        mostrar(prod2);
    }
    
     private static void mostrar(Producto prod) {
        System.out.println("Nombre: "+ prod.getNombre());
        System.out.println("Precio: "+ prod.getPrecio());
        System.out.println("Stock: "+ prod.getStock());
        System.out.println("Activo: "+ prod.isActivo());
    }
}
