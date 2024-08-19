/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;


import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Departamento implements Serializable {
    
    private Propietario propietario;
    private Barrio barrio;
    private Ciudad ciudad;
    private Constructora constructora;
    private CalculoDepartamento calculoDep;
    
    public Departamento(Propietario p, Barrio b, Ciudad c, Constructora cons, CalculoDepartamento cD){
        propietario = p;
        barrio = b;
        ciudad = c;
        constructora = cons;
        calculoDep = cD;
    }
    
    
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    
    public CalculoDepartamento obtenerCalculoDepartamento() {
        return calculoDep;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
    
    public void establecerCalculoDpartamento(CalculoDepartamento x) {
        calculoDep = x;
    }
    
    public void establecerPropietario(Propietario x) {
        propietario = x;
    }

    public void establecerBarrio(Barrio x) {
        barrio = x;
    }
    
    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }

    public void establecerConstructora(Constructora x) {
        constructora = x;
    }
    
    
}
