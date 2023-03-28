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
public class ADMIN extends PERSONA{
    
    //atributo
    private int ID_Admin;

    //Constructor
    public ADMIN(int ID_Admin, int DPI, String Nombre, int Edad) {
        super(DPI, Nombre, Edad);
        this.ID_Admin = ID_Admin;
    }

    //metodo get
    public int getID_Admin() {
        return ID_Admin;
    }

    //metodo set
    public void setID_Admin(int ID_Admin) {
        this.ID_Admin = ID_Admin;
    }
    
    
    //metodo para registrar Admin
    public void RegistraAdmin(){
        System.out.println(this.getID_Admin()
                           + " es administrador registrado");    
    }
        
    //metodo para validar mayoria de edad
    public void MayoriaEdadAdmin(){
        int edad = this.getEdad();
        if(edad < 18)
        {
            System.out.println("el admin "+ this.getID_Admin()
                               +" es menor de edad");
        }
        else{
            System.out.println("el admin "+ this.getID_Admin()
                               +" es mayor de edad");
        }
    }
    
    
    
}
