/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEstaticas;

/**
 *
 * @author Usuario
 */

import clases.Emprendedor;
import clases.Feria;
import clases.Seccion;
import clases.Stand;
import clases.Persona;
import clases.Socials;
import com.mycompany.proyectoferia.ProyectoFeria;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministracionEmprendedores {
    
    public static void infoEmprendedores(){
        for(Emprendedor empre: ProyectoFeria.emprendedores){
            System.out.println(empre.toString2());
        }

    }
    
    public static void registrarEmprendedor(String id, String nombre, String telefono, String email, String direccion, String sitioWeb, String nomResponsable, String descripcion, ArrayList<Socials> redes){
        if((direccion==null||direccion=="")&&(sitioWeb==null||sitioWeb=="")){
            Emprendedor new_Emprendedor = new Emprendedor(id, nombre, telefono, email, nomResponsable, redes, descripcion);
            ProyectoFeria.emprendedores.add(new_Emprendedor);
        } else if (direccion==null||direccion==""){
            Emprendedor new_Emprendedor = new Emprendedor(redes, id, nombre, telefono, email, sitioWeb, nomResponsable, descripcion);
            ProyectoFeria.emprendedores.add(new_Emprendedor);
        } else if (sitioWeb==null||sitioWeb==""){
            Emprendedor new_Emprendedor = new Emprendedor(id, nombre, telefono, email, direccion,  nomResponsable, redes, descripcion);
        } else {
            //tring identificacion, String nombre,String telefono, String email, String direccion, String sitio_web, String nombre_responsable, ArrayList<Socials> redes_sociales, String servicio
            Emprendedor new_Emprendedor = new Emprendedor(id, nombre, telefono, email, direccion, sitioWeb, nomResponsable, redes,descripcion);
            ProyectoFeria.emprendedores.add(new_Emprendedor);
        }
    }
    
    public static void modificarEmprendedor(Emprendedor emp){
        System.out.println(emp.toString());
        System.out.println("Que campo desea modificar: ");
            System.out.println("""
                               1) Nombre
                               2) Nombre Responsable
                               3) Telefono
                               4) Email
                               5) Direccion
                               6) Sitio Web
                               7) Redes Sociales
                               8) Descripcion
                               
                               """);
        boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        opcion = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        while(!salir){
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el valor de nombre:");
                    String nombre=sc1.nextLine();
                    emp.setNombre(nombre);
                    salir = true;
                    break;
                case 2:
                    System.out.println("Ingresa el valor de nombre del responsable:");
                    String nomRes=sc1.nextLine();
                    emp.setNombre_de_responsable(nomRes);
                    salir = true;
                    break;
                case 3:
                    System.out.println("Ingresa el valor de telefono:");
                    String tel=sc1.nextLine();
                    emp.setTelefono(tel);
                    salir = true;
                    break;
                case 4:
                    System.out.println("Ingresa el valor de email:");
                    String email=sc1.nextLine();
                    emp.setEmail(email);
                    salir = true;
                    break;
                case 5:
                    System.out.println("Ingresa el valor de direccion:");
                    String direccion=sc1.nextLine();
                    emp.setDireccion(direccion);
                    salir = true;
                    break;
                case 6:
                    System.out.println("Ingresa el valor de sitio web:");
                    String sitio=sc1.nextLine();
                    emp.setSitio_web(sitio);
                    salir = true;
                    break;
                case 7:
                    System.out.println("Ingresa nombre de red social:");
                    String nombre_red=sc1.nextLine();
                    System.out.println("Ingrese nombre de usuario: ");
                    String usuario = sc.nextLine();
                    Socials social = new Socials(nombre_red, usuario);
                    emp.getRedes_sociales().add(social);
                    salir = true;
                    break;
                case 8:
                    System.out.println("Ingresa el valor de descripcion:");
                    String des=sc1.nextLine();
                    emp.setDescripcion_servicio(des);
                    salir = true;
                    break;
            }
        }
    }
    
    
}
