/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable {
    
    private String nomBarrio;
    private String ref;
    
    public Barrio(String n, String r){
    
        nomBarrio = n;
        ref = r;
    }
    
    
    public String obtenerNomBarrio() {
        return nomBarrio;
    }
    
    public String obtenerRef() {
        return ref;
    }
    
    public void establecerNomBarrio(String x) {
        nomBarrio = x;
    }
    
    public void establecerRef(String x) {
        ref = x;
    }
    
    
}
    

