package pe.mauro.edutecapp.controller;

import pe.mauro.edutec.lib.Promedio;

public class PromedioController {

    private Promedio promedio;

    public PromedioController() {
        promedio = new Promedio();
    }

    public int promediar(int n1, int n2) {
        return promedio.promediar(n1, n2);
    }

    public int promediar(int n1, int n2, int n3) {
        return promedio.promediar(n1, n2, n3);
    }

    public int promediar(int n1, int n2, int n3, int n4) {
        return promedio.promediar(n1, n2, n3, n4);
    }

    public int promediar(int n1, int n2, int n3, int n4, int n5) {
        return promedio.promediar(n1, n2, n3, n4, n5);
    }
}
