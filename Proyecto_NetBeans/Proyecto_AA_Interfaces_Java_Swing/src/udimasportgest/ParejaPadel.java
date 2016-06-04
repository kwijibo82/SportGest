/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */

public class ParejaPadel extends Equipo{
    
    private ArrayList<Jugador> jugadores;
    private Usuario entrenador;
    private Usuario delegado;
    private String idParejaPadel;
    private String nombre;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int puntos;

    public ParejaPadel(ArrayList<Jugador> jugadores, 
            Usuario entrenador, Usuario delegado, String id, String nombre) {
        super(nombre, id);
        
        this.jugadores = jugadores;
        this.entrenador = entrenador;
        this.delegado = delegado;
        this.idParejaPadel = id;
        this.nombre = nombre;
    }

    public ParejaPadel() {
        
    }

    @Override
    public String toString() {
        return "ParejaPadel{" + "jugadores=" + jugadores + ", entrenador=" + entrenador + ", delegado=" + delegado + '}';
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Usuario getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Usuario entrenador) {
        this.entrenador = entrenador;
    }

    public Usuario getDelegado() {
        return delegado;
    }

    public void setDelegado(Usuario delegado) {
        this.delegado = delegado;
    }

    public String getIdParejaPadel() {
        return idParejaPadel;
    }

    public void setIdParejaPadel(String idParejaPadel) {
        this.idParejaPadel = idParejaPadel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    //Setter modificado para que actue como incrementador
    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    //Setter modificado para que actue como incrementador
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados += partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }
    
    //Setter modificado para que actue como incrementador
    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados += partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }
    
    //Setter modificado para que actue como incrementador
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos += partidosPerdidos;
    }
    
    
    
   
      
}
