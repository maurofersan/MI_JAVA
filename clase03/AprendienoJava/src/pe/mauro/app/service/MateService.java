/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.app.service;

/**
 *
 * @author Alumno
 */
public class MateService {
    
    public int promedio(int n1, int n2){
        System.out.println("caso 1");
        return (n1 + n2)/2;
    }
    public double promedio(int n1, double n2){
        System.out.println("caso 2");
        return (n1 + n2)/2;
    }
     public double promedio(double n1, int n2){
        System.out.println("caso 3");
        return (n1 + n2)/2;
    }
     public double promedio(double n1, double n2){
        System.out.println("caso 4");
        return (n1 + n2)/2;
    }
    
}
