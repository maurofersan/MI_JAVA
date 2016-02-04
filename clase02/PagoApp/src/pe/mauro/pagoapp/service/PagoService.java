
package pe.mauro.pagoapp.service;

import pe.mauro.pagoapp.dto.PagoDto;



public class PagoService {
    
    public void procesar(PagoDto dto){
        
        double ingresos, renta, neto;
        
        ingresos = dto.getHorasDia()* dto.getDias() * dto.getPagoHora();
        
        if(ingresos > 1500){
            renta = ingresos*0.08;
        }else {
            
            renta = 0.0;   
        }
        neto = ingresos - renta;
        
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
    }
}
