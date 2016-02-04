
package pe.mauro.app.model;

/**
 *
 * @author Alumno
 */
public class Producto {
    
    private String nombre;
    private int stock;
    private double precio;
    private boolean activo;

    public Producto() {
        this.nombre = "Curso Java";
        this.precio = 300.0;
        this.stock = 20;
        this.activo = true;
        System.out.println("Objeto Creado");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.err.println("Chau objeto");
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
