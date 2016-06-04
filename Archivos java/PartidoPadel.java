/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class PartidoPadel extends PartidoAbstracto {
   
    private String equipoGanador;
    private int numeroJornada;
    private ArrayList<String> resultadosArray = new ArrayList();
    private int numPartido;
    private String combinacion;
    private ParejaPadel pareja1;
    private ParejaPadel pareja2;
    private String ganador;

    public PartidoPadel(ParejaPadel pareja1, ParejaPadel pareja2) {
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
    }
   
    @Override
    public void resultadoPartido(int jornada) {
        super.resultadoPartido(jornada); //To change body of generated methods, choose Tools | Templates.
    
        boolean finalPartido = false;
        Set set = new Set(pareja1, pareja2);
        do {
            
            Set s = null;
            try {
                s = this.simularSet(set);
            } catch (IOException ex) {
                Logger.getLogger(PartidoPadel.class.getName())
                        .log(Level.SEVERE, null, ex);
            }

            if (s.getGanadorEquipo1() == 2) 
            {
                this.pareja1.setGanador(true);
                this.ganador = this.pareja1.getNombre();
                System.out.println("GANADOR: " + pareja1.getNombre());
                pareja1.setPartidosGanados(1);
                pareja2.setPartidosPerdidos(1);
                pareja1.setPuntos(3);
                finalPartido = true;
                
            }
            else if (s.getGanadorEquipo2() == 2)
            {
                this.pareja2.setGanador(true);
                this.ganador = this.pareja2.getNombre();
                System.out.println("GANADOR: " + pareja1.getNombre());
                pareja2.setPartidosGanados(1);
                pareja1.setPartidosPerdidos(1);
                pareja2.setPuntos(3);
                finalPartido = true;
            }           
                 
        } while (!finalPartido);
        
    }
    
    /**
     * Método que simula el juego de un set
     * @return 
     */
    public Set simularSet(Set set) throws IOException
    {
           
        int resul;
        do {
            
            resul =  this.randomResultado(0, 2);
           
            if (resul == 1)
            {
                set.setResultadoEquipo1(1); 
            }
            else 
            { 
                set.setResultadoEquipo2(1);    
            }
      
            
        } while (set.getResultadoEquipo1() <= 5 &&
                set.getResultadoEquipo2() <= 5);
        
        //comprueba quien ha ganado el set
        this.ganadorSet(set);
        
        System.out.println(pareja1.getNombre() + " - " + pareja2.getNombre() 
                + ":" + set.getResultadoEquipo1() +
                " - " + set.getResultadoEquipo2());
        
        
        this.resultadosArray.add(set.getResultadoEquipo1() +
                " - " + set.getResultadoEquipo2());
        
        
        return set;
    }
    
    
    /**
     * Método que comprueba quien ha ganado el set según el número de 
     * puntos ganados
     * @param set 
     */
    public void ganadorSet(Set set)
    {
        if (set.getResultadoEquipo1() > set.getResultadoEquipo2()) 
        {
            set.setGanadorEquipo1(1);
        }
        else
        {
            set.setGanadorEquipo2(1);
        }
    }

    /**
     * Sobreescritura del método toString para adecuarse
     * al enunciado del ejercicio.
     * @return 
     */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Jornada nº ");
        sb.append(this.numeroJornada);
        sb.append("; Partido nº: ");
        sb.append(this.numPartido);
        sb.append("; Encuentro: ");
        sb.append(this.combinacion);
        sb.append("; Pareja ganadora: ");
        sb.append(this.ganador);
        sb.append("; Resultados: ");
        sb.append(this.resultadosArray);
        
        return sb.toString();
    }
    
    /**
     * Método que obtiene un resultado aleatorio para un encuentro
     * de liga entre dos intervalos dados por los parámetos max y min.
     * @param max
     * @param min
     * @return 
     */
    @Override
    public int randomResultado(int max, int min) {
       
        Random rand = new Random();
        
        int randomNum = rand.nextInt((max) + min);
        
        return randomNum;
    }

    public String getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(String equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public int getNumeroJornada() {
        return numeroJornada;
    }

    public void setNumeroJornada(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    public ArrayList<String> getResultadosArray() {
        return resultadosArray;
    }

    public void setResultadosArray(ArrayList<String> resultadosArray) {
        this.resultadosArray = resultadosArray;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public void setNumPartido(int numPartido) {
        this.numPartido = numPartido;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public ParejaPadel getPareja1() {
        return pareja1;
    }

    public void setPareja1(ParejaPadel pareja1) {
        this.pareja1 = pareja1;
    }

    public ParejaPadel getPareja2() {
        return pareja2;
    }

    public void setPareja2(ParejaPadel pareja2) {
        this.pareja2 = pareja2;
    }

    public String getParejaGanadora() {
        return ganador;
    }

    public void setParejaGanadora(String parejaGanadora) {
        this.ganador = parejaGanadora;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }   
    
    
    
}
