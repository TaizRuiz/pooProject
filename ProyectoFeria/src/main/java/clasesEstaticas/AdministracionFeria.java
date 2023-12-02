/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEstaticas;

import clases.Emprendedor;
import clases.Feria;
import clases.Seccion;
import clases.Stand;
import clases.Persona;
import com.mycompany.proyectoferia.ProyectoFeria;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class AdministracionFeria{
      
    //ArrayList<Socials> redesSocial = new ArrayList<>(); 
    
    public static void info_ferias(){
        for (Feria f: ProyectoFeria.ferias){
            System.out.println(f.toString());
        }
    }
    public static void ver_info_feria(int codigo){
        for (Feria f: ProyectoFeria.ferias){
            if(f.getCodigo()==codigo){
                System.out.println(f.toString()+" lista auspiciantes: "+ f.getlAuspiciantes()+" fecha fin: "+f.getfFin()+"horario: "+f.getHorario()+"descripcion: "+f.getDescripcion());
                int cont=0;
                for (Seccion s:f.getSecciones()){
                    cont++;
                    int numStands=s.getNum_stands();
                    System.out.println(" Stands en seccion "+cont+": "+numStands );
                }
            }
        }
    }
    
    public static void registrarFeria(String nombre, String lugar, String descripcion, LocalDate fInicio, LocalDate fFin, String horario, int sec1, int sec2, int sec3, int sec4){
        Feria new_feria=new Feria(nombre, fInicio, fFin, lugar, horario, descripcion);
        new_feria.getSecciones()[0]=new Seccion(sec1);
        new_feria.getSecciones()[1]=new Seccion(sec2);
        new_feria.getSecciones()[2]=new Seccion(sec3);
        new_feria.getSecciones()[3]=new Seccion(sec4);   
    }
    
    public static void modificarFeria(Feria f){
        System.out.println("Que campo desea modificar:");
        System.out.println("""
                           1) Nombre
                           2) Descripcion
                           3) Lugar
                           4) Fecha de Inicio
                           5) Fecha de Fin
                           6) Horario
                           7) Salir
                           """);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa una opcion:");
        String opcion=sc.nextLine();
        while(opcion!="7"){
                    switch (opcion) {
            case "1":
                System.out.println("Ingresa el valor de nombre:");
                String nombre=sc.nextLine();
                f.setNombre(nombre);
                break;
            case "2":
                System.out.println("Ingresa el valor de descripcion:");
                String descripcion=sc.nextLine();
                f.setDescripcion(descripcion);
                break;
            case "3":
                System.out.println("Ingresa el valor de lugar:");
                String lugar=sc.nextLine();
                f.setLugar(lugar);
                break;
            case "4":
                System.out.println("Ingresa el valor de la fecha de inicio aa/mm/dd :");
                LocalDate ld_current=f.getfInicio();
                String fInicio=sc.nextLine();
                String[] partesFecha=fInicio.split("/");
                Integer aa=Integer.parseInt(partesFecha[0]);
                Integer mm=Integer.parseInt(partesFecha[1]);
                Integer dd=Integer.parseInt(partesFecha[2]);
                LocalDate fNueva=LocalDate.of(aa,mm, dd);
                f.setfInicio(fNueva);
                break;
            case "5":
                System.out.println("Ingresa el valor de la fecha de inicio aa/mm/dd :");
                LocalDate ld_currentFin=f.getfFin();
                String fFin=sc.nextLine();
                String[] partesFechaFin=fFin.split("/");
                Integer aaF=Integer.parseInt(partesFechaFin[0]);
                Integer mmF=Integer.parseInt(partesFechaFin[1]);
                Integer ddF=Integer.parseInt(partesFechaFin[2]);
                LocalDate fNuevaF=LocalDate.of(aaF,mmF, ddF);
                f.setfFin(fNuevaF);
                break;
            case "6":
                System.out.println("Ingresa el valor de horario:");
                String horario=sc.nextLine();
                f.setHorario(horario);
                break;
            case "7":
                System.out.println("Saliendo del menu...");
                opcion="7";
                break;
            default:
                System.out.println("Opcion ingresada no valida");
                opcion="7";
                break;
        }
        }

    }
    
    public static void info_emprendedores(Feria f){
        int cont=0;
        for (Seccion s: f.getSecciones()){
         cont++;
         int num_seccion=cont;
         for (Stand st: s.getStands()){
             System.out.println("Codigo de stand:" +String.valueOf(st.getCodigo()));
             System.out.println("Seccion: "+num_seccion);
             Emprendedor e=(Emprendedor)st.getPersona_responsable();
             System.out.println(e.toString());
         }
        }
    }
    
    //OPCIONES 2
    
    public static void info_Empre(){
        for (Emprendedor empre: ProyectoFeria.emprendedores){
            System.out.println(empre.toString());
        }
    }
    
    
    public static void registrarEmprendedor(String identificacion, String nombre,String telefono, String email, String direccion, String sitio_web, String nombre_responsable, ArrayList redes){
        if(direccion == null && sitio_web == null){
            Emprendedor new_Emprendedor = new Emprendedor(identificacion, nombre, telefono, email, null, null, nombre_responsable, redes);
        } else if(direccion == null){
            Emprendedor new_Emprendedor = new Emprendedor(identificacion, nombre, telefono, email, null, sitio_web, nombre_responsable, redes);
        } else if(sitio_web == null){
            Emprendedor new_Emprendedor = new Emprendedor(identificacion, nombre, telefono, email, direccion, null, nombre_responsable, redes);
        }  
    }
    
    public static void modificar_emprendedor(Emprendedor e){
    
    }
    
}