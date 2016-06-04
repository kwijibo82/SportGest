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
public class Competicion {

    private String nombre;
    private String idCompeticion;

    public Competicion(String nombre, String idCompeticion) {
        this.nombre = nombre;
        this.idCompeticion = idCompeticion;
    }

    public Competicion() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCompeticion() {
        return idCompeticion;
    }

    public void setIdCompeticion(String idCompeticion) {
        this.idCompeticion = idCompeticion;
    }

    @Override
    public String toString() {
        return "c;" + idCompeticion + ";" + nombre + ";\n";
    }
    
    public String imprimir() {
        return "ID competición = " + idCompeticion + ", " + 
                "Nombre competición= " + nombre + ";\n";
    }
     
    
}
