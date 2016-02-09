
package pe.mauro.ventaapp.prueba;

import pe.mauro.ventaapp.dto.ItemDto;
import pe.mauro.ventaapp.service.CompAbstract;
import pe.mauro.ventaapp.service.CompFactory;

public class Prueba02 {
    public static void main(String[] args) {
        //Datos
        double total = 567.24;
        String tipo = CompFactory.COMP_BOLETA;
        //proceso
        CompAbstract comp = CompFactory.obtenerComp(tipo);
        ItemDto[] repo = comp.procesar(total);

        for (ItemDto dto : repo) {
            System.out.println(dto.getConcepto() + "|" + dto.getValor());
        }
    }
}
