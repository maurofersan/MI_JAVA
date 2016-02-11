/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.prueba;

import java.util.ArrayList;
import java.util.List;


public class Prueba07 {
    
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Gustavo Coronel");
        lista.add("Hugo Valencia");
        lista.add("Ricardo Marcelo");
        lista.add("Marcelo Miranda");
        
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
