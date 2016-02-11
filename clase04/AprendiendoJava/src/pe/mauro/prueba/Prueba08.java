/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class Prueba08 {
    public static void main(String[] args) {
        
        Map<String, Object> datos = new HashMap<>();
        
        datos.put("001", "Gustavo Coronel");
        datos.put("002", "Claudia Ramos");
        datos.put("003", "Mauro Fernandez");
        datos.put("004", "Hugo Valencia");
        datos.put("005", "Laura Torres");
        
        for (String key : datos.keySet()) {
            System.out.println(key +"|"+ datos.get(key));
        }
        System.out.println("------------------");
        datos.put("002", "Karla Torres");
        for (Object key : datos.keySet()) {
            System.out.println(key +"|"+ datos.get(key));
        }
    }
}
