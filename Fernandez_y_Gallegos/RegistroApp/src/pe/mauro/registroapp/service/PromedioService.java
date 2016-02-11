
package pe.mauro.registroapp.service;

import pe.mauro.registroapp.dto.AlumnoDto;


public class PromedioService {
    
    public void procesar (AlumnoDto dto){
        
        double promedio;
        String estado;
        
        promedio = (dto.getNota1() + dto.getNota2() + dto.getNota3())/3.0;
        
        if(promedio >= 11.0){
            estado = "Aprobado";
        }else{
            estado = "Desaprobado";
        }
        
        dto.setPromedio(promedio);
        dto.setEstado(estado);
    }
}
