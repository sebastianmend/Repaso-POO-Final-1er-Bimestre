/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Villa
 */
public class EscrituraSecuencialCalculoDepartamento {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private CalculoDepartamento registro;
    private ArrayList<CalculoDepartamento> listaCalculoD;

    public EscrituraSecuencialCalculoDepartamento(String nombreArc) {
        // abre el archivo
        nombreArchivo = nombreArc;
        establecerLista(); 
        try 
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

    public void establecerRegistro(CalculoDepartamento p) {
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
    
    // Obtenemos los registros del archivo
    
    public void establecerLista() {
        LecturaSecuencialCalculoDepartamento l = 
                new LecturaSecuencialCalculoDepartamento(obtenerNombreArchivo());
        l.establecerConstructora();
        listaCalculoD = l.obtenerPropietario();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<CalculoDepartamento> obtenerLista() {
        return listaCalculoD;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        // cierra el archivo
        try 
        {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    }
}
