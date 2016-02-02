
package pe.mauro.pedidoapp.service;


public class PedidoService {
    
    private static final double IGV = 0.18;
    
    public double calcularImpuesto( double importe ){
            double impuesto = importe * IGV;
            return impuesto;
    }
    
    public double calcularTotal(double importe ){
        double total ;
        total = importe + calcularImpuesto(importe);
        return total;
    }
}
