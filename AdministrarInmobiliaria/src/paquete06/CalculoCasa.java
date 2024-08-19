/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.io.Serializable;

/**
 *
 * @author Villa
 */
public class CalculoCasa implements Serializable{
    
    private double pmetroc;
    private double nummetrosc;
    private double costoF;
    private int numcuartos;
    
    public CalculoCasa(double p, double n, int numC){
        
        pmetroc = p;
        nummetrosc = n;
        numcuartos = numC;
        
    }

    public double getPmetroc() {
        return pmetroc;
    }

    public void setPmetroc(double p) {
        this.pmetroc = p;
    }

    public double getNummetrosc() {
        return nummetrosc;
    }

    public void setNummetrosc(double n) {
        this.nummetrosc = n;
    }

    public double getCostoF() {
        return costoF;
    }

    public void calcularCostoF() {
        this.costoF = nummetrosc * pmetroc;
    }

    public int getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(int n) {
        this.numcuartos = n;
    } 
    
}
