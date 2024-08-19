/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.*;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable {
    
    private Propietario propietarios;
    private Barrio barrio;
    private Ciudad ciudad;
    private Constructora constructor;
    private CalculoCasa calculocasa;
    
    public Casa(Propietario p, Barrio b, Ciudad ciud, Constructora c, CalculoCasa cC){
        
      propietarios = p;
      barrio = b;
      ciudad = ciud;
      constructor = c;
      calculocasa = cC;
      
    }
    
    public Propietario obtenerPropietarios() {
        return propietarios;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public Constructora obtenerConstructor() {
        return constructor;
    }
    
    public CalculoCasa obtenerCalculoCasa() {
        return calculocasa;
    }
    
    public void establecerCalculoCasa(CalculoCasa x) {
        calculocasa = x;
    }
    
    public void establecerPropietarios(Propietario x) {
        propietarios = x;
    }
    
    public void establecerBarrio(Barrio x) {
        barrio = x;
    }
    
    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }
    
    public void establecerConstructor(Constructora x) {
        constructor = x;
    }
    
}

