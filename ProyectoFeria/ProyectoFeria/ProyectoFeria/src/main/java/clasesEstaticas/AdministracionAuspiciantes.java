/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEstaticas;

import clases.Auspiciante;
import clases.Feria;
import clases.Socials;
import com.mycompany.proyectoferia.ProyectoFeria;
import enums.TipoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UserPC
 */
public class AdministracionAuspiciantes {
    
    
    public static void info_Auspiciante(){
        for(Feria feria: ProyectoFeria.ferias){
            ArrayList<Auspiciante> listaAus = feria.getlAuspiciantes();
            if(!listaAus.isEmpty()){
                for(Auspiciante auspi: listaAus){
                    System.out.println(auspi.getNombre_de_responsable());
                }
            }
            
        }
    }
    
    public static void registrar_auspiciante(String id, String nombre, String nombre_responsable, String telefono, String email, String direccion, String sitio_web, TipoServicio servicio,  ArrayList<Socials> redes_sociales){
        if((direccion == null || direccion == "") && (sitio_web == null || sitio_web == "")){
            Auspiciante new_Auspiciante = new Auspiciante(id, nombre, telefono, email, nombre_responsable, redes_sociales, servicio);
            //new_Auspiciante.setIncluye_stand(incluye);
            ProyectoFeria.auspiciantes.add(new_Auspiciante);
        } else if(direccion == null || direccion == "" ){
            Auspiciante new_Auspiciante = new Auspiciante(id, nombre, telefono, email, direccion, nombre_responsable, redes_sociales, servicio);
            //new_Auspiciante.setIncluye_stand(incluye);
            ProyectoFeria.auspiciantes.add(new_Auspiciante);
        } else if(sitio_web == null || sitio_web == ""){
            Auspiciante new_Auspiciante = new Auspiciante(redes_sociales, id, nombre, telefono, email, sitio_web, nombre_responsable, servicio);
            //new_Auspiciante.setIncluye_stand(incluye);
            ProyectoFeria.auspiciantes.add(new_Auspiciante);
        }
        
        
    
    }
    
    public static void modificarAuspiciante(Auspiciante A){
        System.out.println(A.toString());
        System.out.println("Que campo desea modificar:");
                System.out.println("""
                           1) Nombre
                           2) Nombre Responsable
                           3) Telefono
                           4) Email
                           5) Direccion
                           6) Sitio web
                           7) Servicio
                           8) Red social
                           
                           """);
        boolean salir = false;
        int opcion;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa una opcion:");
        opcion=sc.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
        while(!salir){
                
                
            switch (opcion) {
                
                case 1:
                    System.out.println("Ingresa el valor de nombre:");
                    String nombre=sc1.nextLine();
                    A.setNombre(nombre);
                    salir = true;
                    break;
                case 2:
                    System.out.println("Ingresa el Nombre Responsable:");
                    String nomb_re=sc1.nextLine();
                    A.setNombre_de_responsable(nomb_re);
                    salir = true;
                    break;
                case 3:
                    System.out.println("Ingresa el numero de telefono:");
                    String telefono=sc1.nextLine();
                    A.setTelefono(telefono);
                    salir = true;
                    break;
                case 4:
                    System.out.println("Ingresa el email:");
                    String email=sc1.nextLine();
                    A.setEmail(email);
                    salir = true;
                    break;
                case 5:
                    System.out.println("Ingresa la direccion:");
                    String direccion=sc1.nextLine();
                    A.setDireccion(direccion);
                    salir = true;
                    break;
                case 6:
                    System.out.println("Ingresa el sitio web:");
                    String sitio =sc1.nextLine();
                    A.setSitio_web(sitio);
                    salir = true;
                    break;
                case 7:

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
                    A.setSector_cubierto(servicio);
                    salir = true;

                    break;
                case 8:
                    
                    System.out.println("Ingrese nombre de red social: ");
                    String nombre_red = sc.nextLine();
                    System.out.println("Ingrese nombre de usuario: ");
                    String usuario = sc.nextLine();
                    Socials social = new Socials(nombre_red, usuario);
                    A.getRedes_sociales().add(social);
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
                    break;
              
            }
        }

    }
    
    public static void asignarFeria(int codigo, String id){
        Scanner sc = new Scanner(System.in);
        for (Feria f: ProyectoFeria.ferias){
            if(f.getCodigo() == codigo){
                for (Auspiciante A: ProyectoFeria.auspiciantes){
                    if(A.getIdentificacion() == id){
                        System.out.println("Descripcion de lo que cubre el auspicio: ");
                        String descripcion = sc.nextLine();
                        System.out.println("Incluye stand en la feria: (Si/No)");
                        String boo = sc.nextLine();
                                
                        boolean incluye_stands = false;
                                
                        if(boo == "Si"){
                            incluye_stands = true;
                        }
                        
                        A.setIncluye_stand(incluye_stands);
                        f.getlAuspiciantes().add(A);
                    }
                } 
            }
        } 

        
        // No olvides cerrar el Scanner al final
        sc.close();
    }
    
}
