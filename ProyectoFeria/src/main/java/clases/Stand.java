/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Stand {
    private static int num_stand=0;
    private int codigo;
    private LocalDate fechaAsignacion;
    private Persona persona_responsable;
    public Stand (){
        codigo=(num_stand++);
    }

    public static int getNum_stand() {
        return num_stand;
    }

    public static void setNum_stand(int num_stand) {
        Stand.num_stand = num_stand;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Persona getPersona_responsable() {
        return persona_responsable;
    }

    public void setPersona_responsable(Persona persona_responsable) {
        this.persona_responsable = persona_responsable;
    }

    
    
}
