package pe.mauro.ventaapp.prueba;

import pe.mauro.ventaapp.dto.ItemDto;
import pe.mauro.ventaapp.service.BoletaService;
import pe.mauro.ventaapp.service.CompAbstract;
//import pe.mauro.ventaapp.service.FacturaService;

public class Prueba01 {

    public static void main(String[] args) {
        double total = 567.24;
        //proceso
        CompAbstract comp = new BoletaService();
        ItemDto[] repo = comp.procesar(total);

        for (ItemDto dto : repo) {
            System.out.println(dto.getConcepto() + "|" + dto.getValor());
        }
    }

}
