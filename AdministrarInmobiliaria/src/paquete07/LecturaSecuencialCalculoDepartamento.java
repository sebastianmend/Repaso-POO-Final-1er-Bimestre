/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Villa
 */
public class LecturaSecuencialCalculoDepartamento {
    
    private ObjectInputStream entrada;
    private ArrayList<CalculoDepartamento> calculoDepartamento;
    private String nombreArchivo;
    // private Propietario registroBuscado; // es el registro que debo buscar
                                         // por defecto es null

    public LecturaSecuencialCalculoDepartamento(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerConstructora() {
        // 
        calculoDepartamento = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    CalculoDepartamento registro = (CalculoDepartamento) entrada.readObject();
                    calculoDepartamento.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    


    public ArrayList<CalculoDepartamento> obtenerPropietario() {
        return calculoDepartamento;
    }
    
    /*public Club obtenerRegistroBuscado() {
        return registroBuscado;
    }*/

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Valor/Datos de la Casa\n";
        for (int i = 0; i < obtenerPropietario().size(); i++) {
            CalculoDepartamento p = obtenerPropietario().get(i);
            cadena = String.format("%s%d-%.2f-%.2f-%.2f\n", cadena,
                    p.obtenerNuemroCuartos(),
                    p.obtenerPrecioM2(),
                    p.obtenerNumeroM2(),
                    p.obtenerCostoFinal());
        }

        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            // System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    }
    
}
