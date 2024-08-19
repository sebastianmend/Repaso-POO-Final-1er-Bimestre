/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    
    private String nomCiud;
    private String nomProv;
    
    public Ciudad(String n, String p){
        
        nomCiud = n;
        nomProv = p;
        
    }
    
    public String obtenerNomCiud() {
        return nomCiud;
    }
    
    public String obtenerNomProv() {
        return nomProv;
    }
    
    public void establecerNomCiud(String n) {
        nomCiud = n;
    }
    
    public void establecerNomProv(String n) {
        nomProv = n;
    }
}
