/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Seccion {
    private int num_stands;
    private Stand[] stands;

    public Seccion(int num_stands) {
        this.num_stands = num_stands;
        stands=new Stand[this.num_stands];
    }

 

    public void setNum_stands(int num_stands) {
        this.num_stands = num_stands;
    }

    public Stand[] getStands() {
        return stands;
    }

    public void setStands(Stand[] stands) {
        this.stands = stands;
    }

    public int getNum_stands() {
       return this.num_stands;
    }
    
    
}
