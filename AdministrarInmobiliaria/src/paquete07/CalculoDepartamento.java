/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;


import java.io.Serializable;

/**
 *
 * @author Villa
 */
public class CalculoDepartamento implements Serializable {
    private double precioM2;
    private double numeroM2;
    private double valorAlicuotaM;
    private double costoFinal;
    private int numeroCuartos;
    private String nombreEdif;
    private String ubicacion;
    
    public CalculoDepartamento(String nom, String ubi,double pM2, double numM2,double vAM, int numC){
        nombreEdif = nom;
        ubicacion = ubi;
        precioM2 = pM2;
        numeroM2 = numM2;
        valorAlicuotaM = vAM;
        numeroCuartos = numC;
    }
    
    
    public double obtenerPrecioM2() {
        return precioM2;
    }
    
    public int obtenerNuemroCuartos() {
        return numeroCuartos;
    }
    
    public double obtenerNumeroM2() {
        return numeroM2;
    }
    
    public double obtenerValorAlicuotaM() {
        return valorAlicuotaM;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public String obtenerEdificio() {
        return nombreEdif;
    }
    
    public String obtenerUbicacion() {
        return ubicacion;
    }
    
    public void establecerUbicacion(String x) {
        ubicacion = x;
    }
    
    public void establecerEdificio(String x) {
        nombreEdif = x;
    }
    public void establecerPrecioM2(double x) {
        precioM2 = x;
    }
    
    public void establecerNumerosC(int x) {
        numeroCuartos = x;
    }
    
    public void establecerNumeroM2(double x) {
        numeroM2 = x;
    }
    
    public void establecerValorAlicuotaM(double x) {
        valorAlicuotaM = x;
    }
    
    public void calcularCostoFinal() {
        costoFinal = (numeroM2 * precioM2) + (valorAlicuotaM * 12); // costo final es igual al (número de metros * valor del metro cuadrado) + (valor alícuota mensual * 12).
    }
}
