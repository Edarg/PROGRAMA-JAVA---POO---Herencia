/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author EDDY
 */
public class PERSONA {
    
    //atributos
    private int DPI;
    private String Nombre;
    private int Edad;
    
    //Constructor
    public PERSONA(int DPI, String Nombre, int Edad) {
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    //metodo get
    public int getDPI() {
        return DPI;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }
        
    //metodo set
    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //metodo para comprobar mayoria de edad
    public void ComprobarEdadPersonaGeneral (){
        int ME = 18;
        if (ME < this.Edad){
            System.out.println("el usuario "+ this.Nombre
                               +" es mayor de edad");
        }
        else{
            System.out.println("el usuario "+ this.Nombre
                               +" es menor de edad");
        
        }
    
    }
    
    
}
