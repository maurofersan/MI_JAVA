
package pe.mauro.ventaapp.service;

import pe.mauro.ventaapp.dto.ItemDto;


public class BoletaService extends CompAbstract{

    @Override
    public ItemDto[] procesar(double total) {
        //variables
        double servicio, totalGeneral;
        //proceso
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        //reporte
         ItemDto[] repo = {
            new ItemDto("Total", total),
            new ItemDto("Servicio", servicio),
            new ItemDto("Total General", totalGeneral),
        };
        return repo;
    }
    
    
}
