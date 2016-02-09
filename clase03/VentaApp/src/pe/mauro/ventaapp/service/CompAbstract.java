
package pe.mauro.ventaapp.service;

import pe.mauro.ventaapp.dto.ItemDto;

public abstract class CompAbstract {
    
    protected final double IGV = 0.18;
    protected final double SERVICIO = 0.10;
    
    public abstract ItemDto[] procesar(double total);
}
