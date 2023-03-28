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
public class CLIENTE extends PERSONA{
    
    //atributo
    private int ID_Cliente;
    
    //constructor
    public CLIENTE(int ID_Cliente, int DPI, String Nombre, int Edad) {
        super(DPI, Nombre, Edad);
        this.ID_Cliente = ID_Cliente;
    }
    
    //metodo get
    public int getID_Cliente() {
        return ID_Cliente;
    }
    
    //metodo set
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }
    
    //metodo para registrar cliente
    public void RegistrarCliente(){
        System.out.println("el cliente "+this.ID_Cliente
                           +" ya esta registrado");
    }
    
    //metodo para validar mayoria de edad
    public void MayoriaEdadCliente(){
        
        int edad = this.getEdad();
        if(edad < 18)
        {
            System.out.println("el cliente "+ this.getID_Cliente()
                               +" es menor de edad");
        }
        else{
            System.out.println("el cliente "+ this.getID_Cliente()
                               +" es mayor de edad");
        } 
    }
    
    //metodo para ver todos los datos del cliente
    public void VerDatosDeCliente(){
        System.out.println("Datos de Clientes\n"
                           + "hemos registrado a "+this.getNombre()
                           +" en nuestra base de datos.\nSe identifica con "
                           + "su DPI "+this.getDPI()+" y posee una edad de "
                           +this.getEdad()+ " años \npor lo tanto se le asigna"
                           + " este numero de cliente "
                           +this.ID_Cliente);
    }
    
    
    
    
    
    
    
    
    
}
