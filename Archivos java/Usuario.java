/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.io.Serializable;

/**
 *
 * @author Javi
 */
public class Usuario implements Serializable  {
   
    private String DNI;
    private String nombre;

    public Usuario(String nombre, String DNI) 
    {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public Usuario() {
         
    }

    /*Métodos de acceso Getters y Setters*/
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    @Override
    public String toString() {
        return "u;" + DNI +";"+ nombre + ";\n";
                
    }
    
    public String imprimir(){
        
        return "DNI = " + DNI + ", " + "Nombre usuario: " + nombre + ":\n";
        
    }
    
    
    
    
}
