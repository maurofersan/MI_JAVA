
package pe.mauro.ventaapp.controller;

import pe.mauro.ventaapp.dto.ItemDto;
import pe.mauro.ventaapp.service.CompFactory;


public class VentaController {
    
    public String[] obtenerTipos() {
        String tipos[] = {CompFactory.COMP_FACTURA, CompFactory.COMP_BOLETA};
        return tipos;
    }
    
    public ItemDto[] procesar(String tipo , double total){
        //TODO faltaaa...................................
        return null;
    }
}
