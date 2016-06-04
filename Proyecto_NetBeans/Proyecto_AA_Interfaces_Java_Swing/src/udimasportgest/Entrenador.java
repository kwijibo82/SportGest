/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

/**
 *
 * @author Javi
 */
public class Entrenador extends Usuario {
    
    private String nombre;
    private int Edad;

    public Entrenador(String nombre, int Edad, String DNI) {
        super(DNI, nombre);
        this.nombre = nombre;
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", Edad=" + Edad + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    

    
    
}
