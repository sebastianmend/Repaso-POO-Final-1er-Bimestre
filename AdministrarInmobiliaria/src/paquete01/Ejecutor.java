/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;
import paquete07.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcMenup;

        do {

            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                    "\tSistema Inmobiliario",
                    "\t====================",
                    "\t1) Crear",
                    "\t2) Listar",
                    "\t3) Validar",
                    "\t0) Salir",
                    "\t====================",
                    " Ingrese por teclado: ");

            opcMenup = sc.nextInt();

            switch (opcMenup) {

                case 1:

                    int opcCreacion;

                    System.out.println("\tOpciones de Creacion");
                    System.out.println("\t======================");
                    System.out.println("\t1)Crear propietario: ");
                    System.out.println("\t2)Crear barrio: ");
                    System.out.println("\t3)Crear ciudad: ");
                    System.out.println("\t4)Crear constructora: ");
                    System.out.println("\t5)Crear casa: ");
                    System.out.println("\t6)Crear departamento: ");
                    System.out.println("\t0)Finalizar Programa ");
                    System.out.println("\t======================");
                    System.out.print("Ingrese por teclado: ");
                    opcCreacion = sc.nextInt();
                    if (opcCreacion == 0) {
                        opcMenup = 0;
                    }

                    if (opcCreacion == 1) {

                        agregarPropietario();

                        sc.nextLine();

                    } else {

                        if (opcCreacion == 2) {
                            agregarBarrio();

                        } else {

                            if (opcCreacion == 3) {

                                agregarCiudad();

                            } else {
                                if (opcCreacion == 4) {
                                    agregarConstructora();
                                } else {
                                    if (opcCreacion == 5) {
                                        agregarCasa();
                                    } else {
                                        if (opcCreacion == 6) {
                                            agregarDepartamento();

                                        }
                                    }
                                }
                            }

                        }

                    }

                    break;

                case 2:

                    int opcListar;

                    System.out.println("\tOpciones de Listado");
                    System.out.println("\t====================");
                    System.out.println("\t1)Listar propietario: ");
                    System.out.println("\t2)Listar barrio: ");
                    System.out.println("\t3)Listar ciudad: ");
                    System.out.println("\t4)Listar constructora: ");
                    System.out.println("\t5)Listar casa: ");
                    System.out.println("\t6)Listar departamento: ");
                    System.out.println("\t0)Finalizar Programa ");
                    System.out.println("\t====================");
                    System.out.print("Ingrese por teclado: ");
                    opcListar = sc.nextInt();
                    if (opcListar == 0) {
                        opcMenup = 0;
                    }

                    if (opcListar == 1) {

                        verPropietario();

                    } else {

                        if (opcListar == 2) {
                            verBarrio();

                        } else {

                            if (opcListar == 3) {

                                verCiudad();

                            } else {
                                if (opcListar == 4) {
                                    verConstructora();
                                } else {
                                    if (opcListar == 5) {
                                        verCasa();
                                    } else {
                                        if (opcListar == 6) {
                                            verDepartamento();

                                        }
                                    }
                                }
                            }

                        }

                    }

                    break;

                case 3:
                    int opcValidar;

                    System.out.println("\tOpciones de Validacion");
                    System.out.println("\t======================");
                    System.out.println("\t1)Validar propietario: ");
                    System.out.println("\t2)Validar barrio: ");
                    System.out.println("\t3)Validar ciudad: ");
                    System.out.println("\t4)Validar constructora: ");
                    System.out.println("\t0)Finalizar Programa ");
                    System.out.println("\t======================");
                    System.out.print("Ingrese por teclado: ");
                    opcValidar = sc.nextInt();
                    if (opcValidar == 0) {
                        opcMenup = 0;

                    }

                    if (opcValidar == 1) {

                        buscarPropietario();

                    } else {

                        if (opcValidar == 2) {
                            buscarBarrio();

                        } else {

                            if (opcValidar == 3) {

                                buscarCiudad();

                            } else {
                                if (opcValidar == 4) {
                                    buscarConstructora();
                                }

                            }

                        }

                    }

                    break;

                default:

                    System.out.println("Gracias por usar el programa");

                    break;

            }

        } while (opcMenup != 0);
    }

    public static void verPropietario() {
        String nombreArchivo = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivo);
        lectura.establecerPropietario();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void verConstructora() {
        String nombreArchivo = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura
                = new LecturaSecuencialConstructora(nombreArchivo);
        lectura.establecerConstructora();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void verCiudad() {
        String nombreArchivo = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura
                = new LecturaSecuencialCiudad(nombreArchivo);
        lectura.establecerCiudad();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void verBarrio() {
        String nombreArchivo = "datos/barrios.dat";
        LecturaSecuencialBarrio lectura
                = new LecturaSecuencialBarrio(nombreArchivo);
        lectura.establecerBarrio();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void verCalculoCasa() {
        String nombreArchivo = "datos/valorcasa.dat";
        LecturaSecuencialCalculoCasa lectura
                = new LecturaSecuencialCalculoCasa(nombreArchivo);
        lectura.establecerConstructora();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void agregarCasa() {

        // Propietario
        String nombreArchivo1 = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su identificacion: ");
        String id = entrada.nextLine();

        String nombreArchivoPropietario = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivoPropietario);
        lectura.establecerRegistroBuscado(id);
        Propietario temp = lectura.obtenerBuscarJugador();

        if (temp != null) {
            System.out.println("El id ya existe, no es necesario ingresar de nuevo el propietario");
        }

        // Constructora
        String nombreArchivo2 = "datos/constructoras.dat";

        System.out.println("Ingrese ID de la constructora: ");
        String id2 = entrada.nextLine();

        String nombreArchivoConstructora = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura2
                = new LecturaSecuencialConstructora(nombreArchivoConstructora);
        lectura2.establecerRegistroBuscado(id2);
        Constructora temp2 = lectura2.obtenerBuscarJugador();

        if (temp2 != null) {
            System.out.println("La constructora ya existe, no es necesario ingresarla de nuevo");
        }

        // Ciudad
        String nombreArchivo3 = "datos/ciudades.dat";
        System.out.println("Ingrese nombre de la ciudad: ");
        String nombreCiud = entrada.nextLine();

        String nombreArchivoCiudad = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura3
                = new LecturaSecuencialCiudad(nombreArchivoCiudad);
        lectura3.establecerRegistroBuscado(nombreCiud);
        Ciudad temp3 = lectura3.obtenerRegistroBuscado();

        if (temp3 != null) {
            System.out.println("La ciudad ya existe, no es necesario ingresarla de nuevo");
        } else {
            System.out.println("Se ingreso una ciudad que no existe por lo tanto se usara\n"
                    + " una ciudad por defecto (Loja-Macara)");

            nombreArchivoCiudad = "datos/ciudades.dat";
            lectura3
                    = new LecturaSecuencialCiudad(nombreArchivoCiudad);
            lectura3.establecerRegistroBuscado("Macara");
            temp3 = lectura3.obtenerRegistroBuscado();
        }

        // Barrio
        String nombreArchivo4 = "datos/barrios.dat";
        System.out.println("Ingrese nombre del Barrio: ");
        String nombreB = entrada.nextLine();

        LecturaSecuencialBarrio lectura4
                = new LecturaSecuencialBarrio(nombreArchivo4);
        lectura4.establecerRegistroBuscado(nombreB);
        Barrio temp4 = lectura4.obtenerRegistroBuscado();

        if (temp4 != null) {
            System.out.println("El barrio ya existe");
        }

        // Calculo
        String nombreArchivo5 = "datos/valorcasa.dat";
        System.out.println("Ingrese precio metro cuadrado: ");
        double pmetro = entrada.nextDouble();
        System.out.println("Ingrese numero de metros cuadrados: ");
        double numMetroC = entrada.nextDouble();
        System.out.println("Ingrese numero de cuartos: ");
        int numCuartos = entrada.nextInt();

        if (temp == null || temp2 == null || temp3 == null || temp4 == null) {
            if (temp4 == null) {
                System.out.println("La casa no puede ser creada porque el barrio no existe");
            }
            System.out.println("La casa no puede ser creada");
        } else {
            CalculoCasa d = new CalculoCasa(pmetro, numMetroC, numCuartos);

            d.calcularCostoF();

            EscrituraSecuencialCalculoCasa archivo5
                    = new EscrituraSecuencialCalculoCasa(nombreArchivo5);

            // establecer el valor del atributo registro
            archivo5.establecerRegistro(d);
            // establecer en el archivo el atributo del registro
            archivo5.establecerSalida();
            archivo5.cerrarArchivo();

            // Casa
            String nombreArchivo6 = "datos/casas.dat";

            Casa f = new Casa(temp, temp4, temp3, temp2, d);

            EscrituraSecuencialCasa archivo6
                    = new EscrituraSecuencialCasa(nombreArchivo6);

            // establecer el valor del atributo registro
            archivo6.establecerRegistro(f);
            // establecer en el archivo el atributo del registro
            archivo6.establecerSalida();
            archivo6.cerrarArchivo();
            System.out.println("Casa creada");
        }

    }

    public static void verCasa() {
        String nombreArchivo = "datos/casas.dat";
        LecturaSecuencialCasas lectura
                = new LecturaSecuencialCasas(nombreArchivo);
        lectura.establecerCasa();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void agregarPropietario() {
        String nombreArchivo1 = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su identificacion: ");
        String id = entrada.nextLine();

        String nombreArchivoPropietario = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivoPropietario);
        lectura.establecerRegistroBuscado(id);
        Propietario j = lectura.obtenerBuscarJugador();

        if (j == null) {

            Propietario c = new Propietario(nombre, apellido, id);

            EscrituraSecuencialPropietarios archivo1
                    = new EscrituraSecuencialPropietarios(nombreArchivo1);

            // establecer el valor del atributo registro
            archivo1.establecerRegistro(c);
            // establecer en el archivo el atributo del registro
            archivo1.establecerSalida();
            archivo1.cerrarArchivo();

        } else {
            System.out.println("El id ya existe");
        }

    }

    public static void agregarBarrio() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo4 = "datos/barrios.dat";
        System.out.println("Ingrese nombre del Barrio: ");
        String nombreB = entrada.nextLine();
        System.out.println("Ingrese una referencia: ");
        String referencia = entrada.nextLine();
        String nombreArchivoBarrio = "datos/barrios.dat";
        LecturaSecuencialBarrio lectura
                = new LecturaSecuencialBarrio(nombreArchivoBarrio);
        lectura.establecerRegistroBuscado(nombreB);
        Barrio j = lectura.obtenerRegistroBuscado();

        if (j == null) {
            Barrio z = new Barrio(nombreB, referencia);

            EscrituraSecuencialBarrio archivo4
                    = new EscrituraSecuencialBarrio(nombreArchivo4);

            // establecer el valor del atributo registro
            archivo4.establecerRegistro(z);
            // establecer en el archivo el atributo del registro
            archivo4.establecerSalida();
            archivo4.cerrarArchivo();
        } else {
            System.out.println("El nombre del barrio YA existe en los registros");
        }

    }

    public static void agregarCiudad() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo3 = "datos/ciudades.dat";
        System.out.println("Ingrese nombre de la ciudad: ");
        String nombreCiud = entrada.nextLine();
        System.out.println("Ingrese nombre de la provincia: ");
        String prov = entrada.nextLine();
        String nombreArchivoCiudad = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura
                = new LecturaSecuencialCiudad(nombreArchivoCiudad);
        lectura.establecerRegistroBuscado(prov);
        Ciudad j = lectura.obtenerRegistroBuscado();

        if (j == null) {
            Ciudad o = new Ciudad(nombreCiud, prov);

            EscrituraSecuencialCiudad archivo3
                    = new EscrituraSecuencialCiudad(nombreArchivo3);

            // establecer el valor del atributo registro
            archivo3.establecerRegistro(o);
            // establecer en el archivo el atributo del registro
            archivo3.establecerSalida();
            archivo3.cerrarArchivo();
        } else {
            System.out.println("El nombre de la ciudad YA existe en los registros");
        }

    }

    public static void agregarConstructora() {
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo2 = "datos/constructoras.dat";

        System.out.println("Ingrese nombre de la Constructora: ");
        String nombrec = entrada.nextLine();
        System.out.println("Ingrese ID de la constructora: ");
        String iD = entrada.nextLine();

        String nombreArchivoConstructora = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura
                = new LecturaSecuencialConstructora(nombreArchivoConstructora);
        lectura.establecerRegistroBuscado(iD);
        Constructora j = lectura.obtenerBuscarJugador();

        if (j == null) {
            Constructora q = new Constructora(nombrec, iD);

            EscrituraSecuencialConstructora archivo
                    = new EscrituraSecuencialConstructora(nombreArchivo2);

            // establecer el valor del atributo registro
            archivo.establecerRegistro(q);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
            archivo.cerrarArchivo();
        } else {
            System.out.println("El nombre de la constructora " + iD + " YA existe en los registros");
        }

    }

    public static void agregarDepartamento() {

        String nombreArchivo1 = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su identificacion: ");
        String id = entrada.nextLine();

        String nombreArchivoPropietario = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivoPropietario);
        lectura.establecerRegistroBuscado(id);
        Propietario temp = lectura.obtenerBuscarJugador();

        if (temp != null) {
            System.out.println("El id ya existe, no es necesario ingresar de nuevo el propietario");
        }

        // Constructora
        String nombreArchivo2 = "datos/constructoras.dat";

        System.out.println("Ingrese ID de la constructora: ");
        String id2 = entrada.nextLine();

        String nombreArchivoConstructora = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura2
                = new LecturaSecuencialConstructora(nombreArchivoConstructora);
        lectura2.establecerRegistroBuscado(id2);
        Constructora temp2 = lectura2.obtenerBuscarJugador();

        if (temp2 != null) {
            System.out.println("La constructora ya existe, no es necesario ingresarla de nuevo");
        }

        // Ciudad
        String nombreArchivo3 = "datos/ciudades.dat";
        System.out.println("Ingrese nombre de la ciudad: ");
        String nombreCiud = entrada.nextLine();

        String nombreArchivoCiudad = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura3
                = new LecturaSecuencialCiudad(nombreArchivoCiudad);
        lectura3.establecerRegistroBuscado(nombreCiud);
        Ciudad temp3 = lectura3.obtenerRegistroBuscado();

        if (temp3 != null) {
            System.out.println("La ciudad ya existe, no es necesario ingresarla de nuevo");
        }

        // Barrio
        String nombreArchivo4 = "datos/barrios.dat";
        System.out.println("Ingrese nombre del Barrio: ");
        String nombreB = entrada.nextLine();

        LecturaSecuencialBarrio lectura4
                = new LecturaSecuencialBarrio(nombreArchivo4);
        lectura4.establecerRegistroBuscado(nombreB);
        Barrio temp4 = lectura4.obtenerRegistroBuscado();

        if (temp4 != null) {
            System.out.println("El barrio ya existe, no es necesario ingresarla de nuevo");
        }

        // Calculo
        String nombreArchivo5 = "datos/departamento.dat";
        System.out.println("Ingrese el nombre del edificio: ");
        String nombreEdif = entrada.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese precio metro cuadrado: ");
        double pmetro = entrada.nextDouble();
        System.out.println("Ingrese numero de metros cuadrados: ");
        double numMetroC = entrada.nextDouble();
        System.out.println("Ingrese el valor de alicuota mensual: ");
        double valAM = entrada.nextDouble();
        System.out.println("Ingrese numero de cuartos: ");
        int numCuartos = entrada.nextInt();

        if (temp == null || temp2 == null || temp3 == null || temp4 == null) {
            System.out.println("El departamento no puede ser creado");
        } else {
            CalculoDepartamento d = new CalculoDepartamento(nombreEdif, direccion, pmetro, numMetroC, valAM, numCuartos);
            d.calcularCostoFinal();
            EscrituraSecuencialCalculoDepartamento archivo5
                    = new EscrituraSecuencialCalculoDepartamento(nombreArchivo5);

            // establecer el valor del atributo registro
            archivo5.establecerRegistro(d);
            // establecer en el archivo el atributo del registro
            archivo5.establecerSalida();
            archivo5.cerrarArchivo();

            // Casa
            String nombreArchivo6 = "datos/departamento.dat";

            Departamento f = new Departamento(temp, temp4, temp3, temp2, d);

            EscrituraSecuencialDepartamento archivo6
                    = new EscrituraSecuencialDepartamento(nombreArchivo6);

            // establecer el valor del atributo registro
            archivo6.establecerRegistro(f);
            // establecer en el archivo el atributo del registro
            archivo6.establecerSalida();
            archivo6.cerrarArchivo();
            System.out.println("Departamento creado exitosamente"
                    + "");
        }
    }

    public static void verDepartamento() {
        String nombreArchivo = "datos/departamento.dat";
        LecturaSecuencialDepartamento lectura
                = new LecturaSecuencialDepartamento(nombreArchivo);
        lectura.establecerDepartamento();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void buscarPropietario() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el id del propietario: ");
        String p = entrada.nextLine();

        String nombreArchivoPropietario = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivoPropietario);
        lectura.establecerRegistroBuscado(p);
        Propietario j = lectura.obtenerBuscarJugador();

        if (j == null) {
            System.err.println("El id " + p + " NO existe en los registros");
        } else {
            System.out.println("El id " + p + " SI existe en los registros");
        }

    }

    public static void buscarConstructora() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el id de la constructora: ");
        String co = entrada.nextLine();

        String nombreArchivoConstructora = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura
                = new LecturaSecuencialConstructora(nombreArchivoConstructora);
        lectura.establecerRegistroBuscado(co);
        Constructora j = lectura.obtenerBuscarJugador();

        if (j == null) {
            System.err.println("El nombre de la constructora " + co + " NO existe en los registros");
        } else {
            System.out.println("El nombre de la constructora " + co + " SI existe en los registros");
        }
    }

    public static void buscarCiudad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la ciudad: ");
        String c = entrada.nextLine();

        String nombreArchivoCiudad = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura
                = new LecturaSecuencialCiudad(nombreArchivoCiudad);
        lectura.establecerRegistroBuscado(c);
        Ciudad j = lectura.obtenerRegistroBuscado();

        if (j == null) {
            System.err.println("El nombre de la ciudad " + c + " NO existe en los registros");
        } else {
            System.out.println("El nombre de la ciudad " + c + " SI existe en los registros");
        }
    }

    public static void buscarBarrio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del barrio: ");
        String b = entrada.nextLine();

        String nombreArchivoBarrio = "datos/barrios.dat";
        LecturaSecuencialBarrio lectura
                = new LecturaSecuencialBarrio(nombreArchivoBarrio);
        lectura.establecerRegistroBuscado(b);
        Barrio j = lectura.obtenerRegistroBuscado();

        if (j == null) {
            System.err.println("El nombre del barrio " + b + " NO existe en los registros");
        } else {
            System.out.println("El nombre del barrio " + b + " SI existe en los registros");
        }
    }
}
