
package pe.mauro.mateapp.controller;

import pe.mauro.mateapp.service.MyMath;

public class AppController {

    public long factorial(int n) {
        return MyMath.factorial(n);
    }

    public boolean primo(int n) {
        return MyMath.primo(n);
    }
    
}
