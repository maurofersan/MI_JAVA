/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.prueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *Lista Gnerica
 * @author Alumno
 */
public class Prueba06 {
    
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        
        lista.add(456);
        lista.add(453.3);
        lista.add("Gustavo");
        lista.add(new Date());
        
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
