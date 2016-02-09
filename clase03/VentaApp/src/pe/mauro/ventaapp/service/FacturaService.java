

package pe.mauro.ventaapp.service;

import pe.mauro.ventaapp.dto.ItemDto;


public class FacturaService extends CompAbstract{

    @Override
    public ItemDto[] procesar(double total) {
        //variables
        double consumo, impuesto, servicio, totalGeneral;
        //proceso
        consumo = total / (1 + IGV);
        impuesto = total - consumo;
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        //reporte
        ItemDto[] repo = {
            new ItemDto("Consumo", consumo),
            new ItemDto("Impuesto", impuesto),
            new ItemDto("Total", total),
            new ItemDto("Servicio", servicio),
            new ItemDto("Total General", totalGeneral),
        };
        return repo;
    }
    
    
}
