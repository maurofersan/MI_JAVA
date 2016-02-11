/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.registroapp.controller;

import pe.mauro.registroapp.dto.AlumnoDto;
import pe.mauro.registroapp.service.PromedioService;

public class RegistroController {
    
    PromedioService service;

    public RegistroController() {
        service = new PromedioService();
    }
    
    public void procesar (AlumnoDto dto){
        service.procesar(dto);
    }
}
