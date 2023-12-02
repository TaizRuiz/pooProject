/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoferia;

import clases.Auspiciante;
import clases.Emprendedor;
import clases.Feria;
import clasesEstaticas.AdministracionFeria;
import static clasesEstaticas.AdministracionFeria.info_ferias;
import static clasesEstaticas.AdministracionFeria.ver_info_feria;
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
                                
                                // String nombre, String lugar, String descripcion, LocalDate fInicio, LocalDate fFin, String horario, int sec1, int sec2, int sec3, int sec4
                                System.out.println("Ingrese el nombre de la feria: ");
                                String nombre;
                                nombre = scInput.nextLine();
                                
                                System.out.println("Ingrese el lugar de la feria: ");
                                String feria;
                                feria = scInput.nextLine();
                                
                                System.out.println("Ingrese una descripcion de la feria: ");
                                String descripcion;
                                descripcion = scInput.nextLine();
                                
                                System.out.println("Ingrese la fecha de inicio: ");
                                LocalDate fechaI =  new LocalDate(20,20,20);
                                
                              

                                break;
                            case 3:

                                break;
                            case 4:

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
                        System.out.println("---------------------------------------------");
                        System.out.println("Llamo metodo");
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
                                break;
                            case 2:
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
        ferias.add(new Feria("agricola", LocalDate.now(), LocalDate.now(), "Guayaquil", "14:00 p.m", "Feria dedicada a la agricultura"));
        ferias.add(new Feria("Gastronomia", LocalDate.now(), LocalDate.now(), "Quito", "10:00 a.m", "Feria dedicada a la Gatronomia"));
        ferias.add(new Feria("Hogares", LocalDate.now(), LocalDate.now(), "Guayaquil", "9:00 a.m", "Feria dedicada a los Inmuebles"));
        
    }
    
}

