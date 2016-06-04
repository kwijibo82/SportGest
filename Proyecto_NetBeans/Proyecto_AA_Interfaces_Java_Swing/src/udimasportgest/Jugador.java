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
public class Jugador extends Usuario{
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String habilidad; //diestro o zurdo
    private int edad;
    private int dorsal;

    public Jugador(String nombre, String apellido1, String apellido2, 
            String habilidad, int edad, int dorsal, String DNI) {
        super(DNI, nombre);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.habilidad = habilidad;
        this.edad = edad;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", habilidad=" + habilidad + ", edad=" + edad + ", dorsal=" + dorsal + '}';
    }

    /*Métodos de acceso Getters y Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setPiernaHabil(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
   
}
