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
public class Equipo {
    
    private boolean ganador;
    private String nombre;
    private String id;
    private int partidosGanados;
    private int partidosEmpatoados;
    private int partidosPerdidos;

    public Equipo() {
    }
      
    public Equipo (String nombre, String id)
    {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }
    
    //Setter modificado  como método incrementador
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados += partidosGanados;
    }

    public int getPartidosEmpatoados() {
        return partidosEmpatoados;
    }

    //Setter modificado  como método incrementador
    public void setPartidosEmpatoados(int partidosEmpatoados) {
        this.partidosEmpatoados = partidosEmpatoados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    //Setter modificado  como método incrementador
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }
    
    

    @Override
    public String toString() {
        return "e;" + id + ";" + nombre + ";\n";
    }
    
    public String imprimir() {
        
        return "ID = " + id + ", " + "Nombre equipo: " + nombre + ";\n";
    }
    
      
}
