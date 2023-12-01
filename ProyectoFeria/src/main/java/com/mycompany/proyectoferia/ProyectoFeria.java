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
        Scanner scInput=new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Escoja las siguientes opciones:");
        System.out.println("1)Administrar Ferias");
        System.out.println("2)Opcion 2");
        System.out.println("3)Salir");
        
        String opcion=scInput.nextLine();
        
        while(opcion!="3"){
            switch(opcion){
                case "1":
                    
                     System.out.println("llamo metodo");
       System.out.println("""
                          1) ver info feria
                          2) registrar feria 
                          3) modificar feria
                          4) ver informacion de emprendedores
                          5) Salir""");
       Scanner scOp=new Scanner(System.in);
       System.out.println("Escoga una opcion");
       String op=scOp.next();
       while (op!="5"){
           AdministracionFeria.info_ferias();
           switch (op) {
               
               case "1":
                   String codigo=scOp.nextLine();
                   Integer codigoFeria=Integer.parseInt(codigo);
                   if (codigoFeria!=null){
                       AdministracionFeria.ver_info_feria(codigoFeria);
                   }
                   else{
                       System.out.println("Ingrese un codigo valido");
                       op="5";
                   }
                   
                   break;
               case "2":
                   
                   break;
               case "3":
                   
                   break;
               case "4":
                   
                   break;
               case "5":
                   op="5";
                   
                   System.out.println("saliendo....");
                   break;
               default:
                   op="5";
                   System.out.println("saliendo....");
                   break;
           }
       }
                    break;
                case "2":
                    System.out.println("escogiste la segunda opcion");
                    break;
                case "3":
                    opcion="3";
                    System.out.println("saliendo...");
                    break;
                default:
                    opcion="3";
                    System.out.println("saliendo");
                    break;
            }
            
        }
        
    }
    
    
}
