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
public class LecturaSecuencialDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamento;
    private String nombreArchivo;
    // private Propietario registroBuscado; // es el registro que debo buscar
                                         // por defecto es null

    public LecturaSecuencialDepartamento(String n) {
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

    public void establecerDepartamento() {
        // 
        departamento = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamento.add(registro);
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
    
   

    public ArrayList<Departamento> obtenerDepartamento() {
        return departamento;
    }
    
  

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Datos del Departamento\n";
        for (int i = 0; i < obtenerDepartamento().size(); i++) {
            Departamento p = obtenerDepartamento().get(i);
            cadena = String.format("%s\nInformacion de propietario\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificacion: %s\n"
                    + "Informacion Barrio\n"
                    + "Nombre del Barrio: %s\n"
                    + "Referencia: %s\n"
                    + "Informacion Ciudad\n"
                    + "Nombre Ciudad: %s\n"
                    + "Nombre Provincia: %s\n"
                    + "Informacion Constructora\n"
                    + "Nombre Constructora: %s\n"
                    + "Id constructora: %s\n"
                    + "Informacion Costo\n"
                    + "Nombre del edificio: %s\n"
                    + "Direccion: %s\n"
                    + "Costo Total: %.2f\n", cadena,
                    p.obtenerPropietario().getNombres(),
                    p.obtenerPropietario().getApellidos(),
                    p.obtenerPropietario().getIdentificacion(),
                    p.obtenerBarrio().obtenerNomBarrio(),
                    p.obtenerBarrio().obtenerRef(),
                    p.obtenerCiudad().obtenerNomCiud(),
                    p.obtenerCiudad().obtenerNomProv(),
                    p.obtenerConstructora().getNomCons(),
                    p.obtenerConstructora().getIdCons(),
                    p.obtenerCalculoDepartamento().obtenerEdificio(),
                    p.obtenerCalculoDepartamento().obtenerUbicacion(),
                    p.obtenerCalculoDepartamento().obtenerCostoFinal());
                    
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
