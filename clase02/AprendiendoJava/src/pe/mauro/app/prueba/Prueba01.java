
package pe.mauro.app.prueba;

import pe.mauro.app.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        
        mostrar(prod1);
        
        prod1.setNombre("Laptop");
        prod1.setPrecio(5000.0);
        
        System.out.println("-----------------");
        mostrar(prod1);
    }

    private static void mostrar(Producto prod) {
        System.out.println("Nombre: "+ prod.getNombre());
        System.out.println("Precio: "+ prod.getPrecio());
        System.out.println("Stock: "+ prod.getStock());
        System.out.println("Activo: "+ prod.isActivo());
    }
}
