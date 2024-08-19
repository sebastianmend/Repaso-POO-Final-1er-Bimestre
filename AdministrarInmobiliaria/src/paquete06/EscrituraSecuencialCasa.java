/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Villa
 */
public final class EscrituraSecuencialCasa {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Casa registro;
    private ArrayList<Casa> listaCasa;

    public EscrituraSecuencialCasa(String nombreArc) {
        
        nombreArchivo = nombreArc;
        establecerLista(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistro(Casa p) {
        registro = p;
    }

    public void establecerSalida() {
        
        try {
            salida.writeObject(registro); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    
    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerLista() {
        LecturaSecuencialCasas l = 
                new LecturaSecuencialCasas(obtenerNombreArchivo());
        l.establecerCasa();
        listaCasa = l.obtenerCasa();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Casa> obtenerLista() {
        return listaCasa;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 
    
}
    