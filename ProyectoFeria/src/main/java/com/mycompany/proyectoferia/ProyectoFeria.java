/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoferia;

import clases.Auspiciante;
import clases.Emprendedor;
import clases.Feria;
import clases.Seccion;
import clases.Socials;
import clasesEstaticas.AdministracionFeria;
import clasesEstaticas.AdministracionAuspiciantes;
import static clasesEstaticas.AdministracionFeria.info_ferias;
import static clasesEstaticas.AdministracionFeria.ver_info_feria;
import enums.TipoServicio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ProyectoFeria {
    public static ArrayList<Feria> ferias;
    public static ArrayList<Emprendedor> emprendedores;
    public static ArrayList<Auspiciante> auspiciantes;
    public static void main(String[] args) {
        ferias=new ArrayList<>();
        emprendedores=new ArrayList<>();
        auspiciantes=new ArrayList<>();
        cargarFeria();
        
        boolean salir = false;
        int opciones;
        Scanner scInput=new Scanner(System.in);
        
        
        
        while(!salir){
            System.out.println("---------------------------------------------");
            System.out.println("Bienvenido");
            System.out.println("Escoja las siguientes opciones:");
            System.out.println("1)Administrar Ferias");
            System.out.println("2)Administrar Emprendedores");
            System.out.println("3)Administrar Auspiciantes");
            System.out.println("4)Administrar Stands");
            System.out.println("5)Salir");
            opciones =scInput.nextInt();
            switch(opciones){
                case 1:
                    
                    boolean salir1 = false;
                    int op;
            
                    while (!salir1){
                        
                        System.out.println("---------------------------------------------");
                        AdministracionFeria.info_ferias();
                        
       System.out.println("""
                          1) ver info feria
                          2) registrar feria 
                          3) modificar feria
                          4) ver informacion de emprendedores
                          5) Regresar""");
       //Scanner scOp=new Scanner(System.in);
       System.out.println("Escoga una opcion");
       op=scInput.nextInt();
                        
                        switch (op) {

                            case 1:
                                System.out.println("entra");
                                int codigo=scInput.nextInt();
                                
                                if (codigo!=0){
                                    AdministracionFeria.ver_info_feria(codigo);
                                }
                                else{
                                    System.out.println("Ingrese un codigo valido");
                                    op=6;
                                }

                                break;
                            case 2:
                                Scanner sc = new Scanner(System.in);
                                // String nombre, String lugar, String descripcion, LocalDate fInicio, LocalDate fFin, String horario, int sec1, int sec2, int sec3, int sec4
                                System.out.println("Ingrese el nombre de la feria: ");
                                String nombreFeria;
                                nombreFeria = sc.nextLine();
                                
                                System.out.println("Ingrese el lugar de la feria: ");
                                String feria;
                                feria = sc.nextLine();
                                
                                System.out.println("Ingrese una descripcion de la feria: ");
                                String descripcion;
                                descripcion = sc.nextLine();
                                
                                System.out.println("Ingrese la fecha de inicio (AA-MM-DD): ");
                                String fechaIni;
                                fechaIni = sc.nextLine();
                                String [] fecha = fechaIni.split("-");
                                LocalDate fechaI = LocalDate.of(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));                                
                                System.out.println("Ingrese la fecha de fin (AA-MM-DD): ");
                                String fechaFin;
                                fechaFin = sc.nextLine();
                                String [] fecha2 = fechaFin.split("-");
                                LocalDate fechaF = LocalDate.of(Integer.parseInt(fecha2[0]), Integer.parseInt(fecha2[1]), Integer.parseInt(fecha2[2]));
                                
                                System.out.println("Ingrese el horario: ");
                                String horario;
                                horario = sc.nextLine();
                                
                                System.out.println("Ingrese cantidad de stand seccion 1:");
                                int sec1;
                                sec1 = sc.nextInt();
                                System.out.println("Ingrese cantidad de stand seccion 2:");
                                int sec2;
                                sec2 = sc.nextInt();
                                System.out.println("Ingrese cantidad de stand seccion 3:");
                                int sec3;
                                sec3 = sc.nextInt();
                                System.out.println("Ingrese cantidad de stand seccion 4:");
                                int sec4;
                                sec4 = sc.nextInt();
                                
                                AdministracionFeria.registrarFeria(nombreFeria, feria, descripcion, fechaI, fechaF, horario, sec1, sec2, sec3, sec4);
                                                          
                                break;
                            case 3:
                                AdministracionFeria.info_ferias();
                                System.out.println("Ingrese el numero de feria que desea modificar: ");
                                int numero;
                                numero = scInput.nextInt();
                                AdministracionFeria.modificarFeria(ferias.get(numero-1));

                                break;
                            case 4:
                                System.out.println("Ingrese el codigo de feria: ");
                                AdministracionFeria.info_ferias();
                                int numeroFeria;
                                numeroFeria = scInput.nextInt();
                                AdministracionFeria.info_emprendedores(ferias.get(numeroFeria-1));
                                break;
                            case 5:
                                System.out.println("Saliendo...");
                                salir1 = true;
                                break;
                            default:
                                System.out.println("Ingrese solo opciones del 1 al 5:");
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean salir2 = false;
                    int op2;
                    
                    while(!salir2){
                        System.out.println("---------------------------------------------");
                        System.out.println("Llamo metodo");
                        System.out.println("""
                          1) Registrar emprendedor
                          2) Editar emprendedor
                          3) Regresar""");
                        //Scanner s=new Scanner(System.in);
                        System.out.println("Escoga una opcion");
                    op2=scInput.nextInt();
                        switch(op2){
                            case 1:
                                System.out.println("opcion 1");
                                break;
                            case 2:
                                System.out.println("opcion 2");
                                break;
                            case 3:
                                salir2 = true;
                                System.out.println("Saliendo ...");
                                break;
                            default:
                                System.out.println("Ingrese solo opciones del 1 al 3:");
                                break;
                        }
                    
                    }
                    
                    break;
                case 3:
                    boolean salir3 = false;
                    int op3;
                    
                    while(!salir3){
                        AdministracionAuspiciantes.info_Auspiciante();
                        System.out.println("---------------------------------------------");
                        /*for(Auspiciante auspici: auspiciantes){
                            System.out.println(auspici.toString());
                        }*/
                        System.out.println("""
                          1) Registrar auspiciante
                          2) Editar auspiciante
                          3) Asignar auspiciante a feria
                          4) Regresar""");
                        //Scanner s=new Scanner(System.in);
                        System.out.println("Escoga una opcion");
                        op3=scInput.nextInt();
                        switch(op3){
                            case 1:
                                // String id, String nombre, String nombre_responsable, String telefono, String email, String direccion, String sitio_web, TipoServicio servicio,  ArrayList<Socials
                                Scanner sc = new Scanner(System.in);
                                System.out.println("Ingrese su identificacion: ");
                                String id;
                                id = sc.nextLine();
                                
                                System.out.println("Ingrese el nombre de la empresa: ");
                                String nombre;
                                nombre = sc.nextLine();
                                
                                System.out.println("Ingrese el nombre de responsable: ");
                                String nombre_responsable;
                                nombre_responsable = sc.nextLine();
                                
                                System.out.println("Ingrese su numero de telefono: ");
                                String telefono;
                                telefono = sc.nextLine();
                                
                                System.out.println("Ingrese su correo: ");
                                String correo;
                                correo = sc.nextLine();
                                
                                System.out.println("Ingrese su direccion: ");
                                String direccion;
                                direccion = sc.nextLine();
                                
                                System.out.println("Ingrese el sitio web: ");
                                String sitio;
                                sitio = sc.nextLine();
                                
                                System.out.println("Seleccione el tipo de servicio que ofrece");
                                System.out.println(""" 
                                                   1) ALIMENTACIÓN
                                                   2) EDUCACIÓN
                                                   3) SALUD
                                                   4)VESTIMENTA
                                                   """);
                                TipoServicio servicio = null;
                                int opcionLi;
                                opcionLi = sc.nextInt();
                                switch(opcionLi){
                                    case 1:
                                        servicio = TipoServicio.ALIMENTACIÓN;
                                        break;
                                    case 2:
                                        servicio = TipoServicio.EDUCACIÓN;
                                        break;
                                    case 3:
                                        servicio = TipoServicio.SALUD;
                                        break;
                                    case 4:
                                        servicio = TipoServicio.VESTIMENTA;
                                        break;
                                    default:
                                        System.out.println("Ingrese solo opciones del 1 al 4:");
                                        break;
                                
                                }
                                System.out.println("Ingrese el numero de red social que tiene: ");
                                int nume = sc.nextInt();
                                ArrayList<Socials> redes = new ArrayList<>();
                                Scanner sc2 = new Scanner(System.in);
                                for(int i = 1; i <= nume; i ++){
                                    
                                    System.out.println("Ingrese el nombre de la red social: ");
                                    String red = sc2.nextLine();
                                    System.out.println("Ingrese que nombre de usuario tiene esa red social: ");
                                    String nomb = sc2.nextLine();
                                    
                                    Socials social = new Socials(red,nomb);
                                    redes.add(social);
                                }
                                System.out.println("Ingrese yes si incluye stands y no si no incluye:");
                                String boo = sc2.nextLine();
                                
                                boolean incluye_stands = false;
                                
                                if(boo == "yes"){
                                    incluye_stands = true;
                                }
                                
                                AdministracionAuspiciantes.registrar_auspiciante(id, nombre, nombre_responsable, telefono, correo, direccion, sitio, servicio, redes, incluye_stands);
                                       
                                       
                                
                                break;
                            case 2:
                                AdministracionAuspiciantes.info_Auspiciante();
                                 System.out.println("Ingrese el numero de el auspiciante que desea modificar: ");
                                int numero;
                                numero = scInput.nextInt();
                                AdministracionAuspiciantes.modificarAuspiciante(auspiciantes.get(numero-1));
                                break;
                            case 3:
                                break;
                            case 4:
                                salir3 = true;
                                System.out.println("Saliendo ...");
                                break;
                            default:
                                System.out.println("Ingrese solo opciones del 1 al 4:");
                                break;
                        }
                    
                    }
                    
                   
                    break;
                case 4:
                    boolean salir4 = false;
                    int op4;
                    
                    while(!salir4){
                        System.out.println("---------------------------------------------");
                        System.out.println("Llamo metodo");
                        System.out.println("""
                          1) Reservar un stand
                          2) Mostrar informacion de stand
                          3) Regresar""");
                        //Scanner s=new Scanner(System.in);
                        System.out.println("Escoga una opcion");
                        op4=scInput.nextInt();
                        switch(op4){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                salir4 = true;
                                System.out.println("Saliendo ...");
                                break;
                            default:
                                System.out.println("Ingrese solo opciones del 1 al 3:");
                                break;
                        
                        }
                    }
                    
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese solo opciones del 1 al 5:");
                    break;
            }
            
        }
        
    }
    
    public static void cargarFeria(){
        //ArrayList<Feria> listaFeria =  new ArrayList<>();
        Feria feria1 = new Feria("agricola", LocalDate.now(), LocalDate.now(), "Guayaquil", "14:00 p.m", "Feria dedicada a la agricultura");
        ferias.add(feria1);
        feria1.getSecciones()[0] = new Seccion(2);
        feria1.getSecciones()[1] = new Seccion(2);
        feria1.getSecciones()[2] = new Seccion(2);
        feria1.getSecciones()[3] = new Seccion(2);
         
        Feria feria2 = new Feria("Gastronomia", LocalDate.now(), LocalDate.now(), "Quito", "10:00 a.m", "Feria dedicada a la Gatronomia");
        ferias.add(feria2);
        feria2.getSecciones()[0] = new Seccion(1);
        feria2.getSecciones()[1] = new Seccion(2);
        feria2.getSecciones()[2] = new Seccion(3);
        feria2.getSecciones()[3] = new Seccion(4);
        ArrayList<Socials> redes=new ArrayList<>();
        redes.add(new Socials("Facebook","user"));
        Emprendedor e1=new Emprendedor("0914463815","Emprendimiento1", "0981383239","dtruiz@live.com","Dafne",redes,"Emprendimiento");
        feria1.getSecciones()[0].getStands()[0].setPersona_responsable(e1);
        feria1.getSecciones()[0].getStands()[0].setFechaAsignacion(LocalDate.now());
        
        Emprendedor e2=new Emprendedor("09506375557","Emprendimiento2", "0968933048","kerimaga@espol.edu.ec","Kevin",redes,"Emprendimiento");
        feria1.getSecciones()[1].getStands()[1].setPersona_responsable(e2);
        feria1.getSecciones()[1].getStands()[1].setFechaAsignacion(LocalDate.now());
       
        Emprendedor e3=new Emprendedor("0978787820","Emprendimiento3", "09787878","kerimaga@espol.edu.ec","Ricardo",redes,"Emprendimiento");
        feria1.getSecciones()[2].getStands()[1].setPersona_responsable(e3);
        feria1.getSecciones()[2].getStands()[1].setFechaAsignacion(LocalDate.now());
        
        Emprendedor e4=new Emprendedor("0993939393","Emprendimiento3", "0978989632","kerimaga@espol.edu.ec","Thayz",redes,"Emprendimiento");
        feria1.getSecciones()[3].getStands()[0].setPersona_responsable(e4);
        feria1.getSecciones()[3].getStands()[0].setFechaAsignacion(LocalDate.now());
        //String identificacion, String nombre, String telefono, String email, String nombre_de_responsable, ArrayList<Socials> redes_sociales, String sector_cubierto
        Auspiciante auspiciante = new Auspiciante("09121212", "ESPOL", "1234567891", "kevinricki-2002@hotmail.com", "Kevin", redes, TipoServicio.ALIMENTACIÓN);
        auspiciante.setIncluye_stand(true);
        feria1.getlAuspiciantes().add(auspiciante);
        
    }
    
    
}

