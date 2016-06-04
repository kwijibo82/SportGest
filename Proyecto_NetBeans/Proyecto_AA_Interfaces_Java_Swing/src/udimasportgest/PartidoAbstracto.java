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
abstract public class PartidoAbstracto implements Partido{

    private String nombre;
    private String deporte;
    private String[] contrincantes;
    private int puntos;
    
    @Override
    public void resultadoPartido(int jornada) {

        
    }
    
    /*Métodos de acceso Getters y Setters*/   
    public int getPuntos() {
        return puntos;
    }

    //Setter modificado para que funcione como un método incrementador
    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String[] getContrincantes() {
        return contrincantes;
    }

    public void setContrincantes(String[] contrincantes) {
        this.contrincantes = contrincantes;
    }
  
}
