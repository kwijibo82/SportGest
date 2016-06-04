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
public class EquipoFutbol extends Equipo{
    
    private int numJugadores;
    private ArrayList<Jugador> jugadores; 
    private Usuario entrenador;
    private Usuario delegado;
    private String idEquipoFutbol;
    private String nombre;
    private int numGoles;
    private int puntos;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;

    public EquipoFutbol(String nombre, String id) {
        super(nombre, id);
        this.nombre = nombre;
        this.idEquipoFutbol = id;
    }
   
    public EquipoFutbol(int numJugadores, ArrayList<Jugador> jugadores,
            Usuario entrenador, Usuario delegado, String idEquipoFutbol,
            String nombre) {
        super(nombre, idEquipoFutbol);
        
        this.numJugadores = numJugadores;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
        this.delegado = delegado;
        this.idEquipoFutbol = idEquipoFutbol;
        this.nombre = nombre;
    }

    EquipoFutbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" + "numJugadores=" + numJugadores + ", jugadores=" + jugadores + ", entrenador=" + entrenador + ", delegado=" + delegado + ", idEquipoFutbol=" + idEquipoFutbol + ", nombre=" + nombre + '}';
    }

     
    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
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

    public String getIdEquipoFutbol() {
        return idEquipoFutbol;
    }

    public void setIdEquipoFutbol(String idEquipoFutbol) {
        this.idEquipoFutbol = idEquipoFutbol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public int getPuntos() {
        return puntos;
    }

    //Setter modificado para que actúe como un incrementador 
    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    //Setter modificado pare que incremente el número de partidos ganados
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados += partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    //Setter modificado pare que incremente el número de partidos empatados
    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados += partidosEmpatados;
    }

    public int getPartidosPerdidos() {  
        return partidosPerdidos;
    }

    //Setter modificado pare que incremente el número de partidos perdidos
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos += partidosPerdidos;
    }
 
}
