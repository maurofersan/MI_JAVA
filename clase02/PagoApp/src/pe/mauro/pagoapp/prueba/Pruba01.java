/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.pagoapp.prueba;

import pe.mauro.pagoapp.dto.PagoDto;
import pe.mauro.pagoapp.service.PagoService;

/**
 *
 * @author Alumno
 */
public class Pruba01 {
    public static void main(String[] args) {
        
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(140.0);
        
        PagoService service = new PagoService();
        service.procesar(dto);
        
        System.out.println("Ingresos: "+ dto.getIngresos());
        System.out.println("Renta: "+dto.getRenta());
        System.out.println("Neto: "+ dto.getNeto());
    }
}

