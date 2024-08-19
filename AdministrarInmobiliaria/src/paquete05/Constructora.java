/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {
    
    private String nomCons;
    private String idCons;
    
    public Constructora(String n, String i){
        
        nomCons =  n;
        idCons = i;
    
    }

    public String getNomCons() {
        return nomCons;
    }

    public void setNomCons(String nomCons) {
        this.nomCons = nomCons;
    }

    public String getIdCons() {
        return idCons;
    }

    public void setIdCons(String idCons) {
        this.idCons = idCons;
    }

}
