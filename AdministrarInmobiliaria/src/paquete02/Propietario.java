/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {
    private String nombres;
    private String apellidos;
    private String identificacion;
    
    public Propietario(String n, String a, String i){
        
        nombres = n;
        apellidos = a;
        identificacion = i;
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String n) {
        nombres = n;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String n) {
        apellidos = n;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String n) {
        identificacion = n;
    }
       
}
    
