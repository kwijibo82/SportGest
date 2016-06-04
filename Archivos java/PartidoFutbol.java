/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.util.Random;

/**
 *
 * @author Javi
 */
public class PartidoFutbol extends PartidoAbstracto {

    private String ganador;
    private String resultado;
    private boolean empate;
    private int numeroJornada;
    private int numPartido;
    private EquipoFutbol ef1;
    private EquipoFutbol ef2;
    private String combinacion;

    public PartidoFutbol(EquipoFutbol ef1, EquipoFutbol ef2) {
        this.ef1 = ef1;
        this.ef2 = ef2;
    }
    

    @Override
    public void resultadoPartido(int jornada) {
        super.resultadoPartido(jornada); 
     
      //generamos resultados para ambos equipos
      this.ef1.setNumGoles(randomResultado(0, 6));
      this.ef2.setNumGoles(randomResultado(0, 6));
             
      System.out.println( ef1.getNombre() + " - " + ef2.getNombre() + " --> " +
            ef1.getNumGoles() + " - " + ef2.getNumGoles());
      
      this.resultado = ef1.getNumGoles() + " - " + ef2.getNumGoles();
      
      empate = false;
      
      this.equipoGanador(ef1, ef2);
      
      if (!empate) {  //solo mostramos el ganador "normal" si no ha habido empate
            System.out.println("GANADOR: " + this.ganador);

      }
        
    }
    
    public void equipoGanador(EquipoFutbol ef1, EquipoFutbol ef2)
    {
        if (ef1.getNumGoles() > ef2.getNumGoles()) 
        {
           ef1.setGanador(true);
           ef1.setPuntos(3);
           ef1.setPartidosGanados(1);
           ef2.setPartidosPerdidos(1);
           this.setEquipoGanador(ef1.getNombre()); 
           
        }
        else if (ef1.getNumGoles() < ef2.getNumGoles())
        {
            ef2.setGanador(true);
            ef2.setPuntos(3);
            ef2.setPartidosGanados(1);
            ef1.setPartidosPerdidos(1);
            this.setEquipoGanador(ef2.getNombre()); 
        }
        else if (ef1.getNumGoles() == ef2.getNumGoles())
        {
            this.empate = true;
            ef1.setPartidosEmpatados(1);
            ef2.setPartidosEmpatados(1);
            ef1.setPuntos(1);
            ef2.setPuntos(1);
            
            //NOTA DE CORRECIÓN: Se otorga 1 punto por empate aunque por
            //motivos de una futura escalabilidad del software se han dejado
            //el método de desempate.
            desempate(ef1, ef2);
        }
    }
    
    /**
     * Método que produce un desempate entre los dos equipos empatados
     * por el sistema del gol de oro (el priemro en marcar es el ganador).
     */
    public void desempate(EquipoFutbol ef1, EquipoFutbol ef2)
    {
        boolean golDeOro = false;
        do 
        {
            //volvemos a generar resultados para ambos equipos
             this.ef1.setNumGoles(randomResultado(0, 6));
             this.ef2.setNumGoles(randomResultado(0, 6));

            if (ef1.getNumGoles() > ef2.getNumGoles()) {
                
                ef1.setGanador(true);
                this.setEquipoGanador(ef1.getNombre()); 
                System.out.println("GANADOR POR GOL DE ORO: " + ef1.getNombre());
                golDeOro = true;
                
            }
            else if (ef1.getNumGoles() < ef2.getNumGoles())
            {
                ef2.setGanador(true);
                this.setEquipoGanador(ef2.getNombre()); 
                System.out.println("GANADOR POR GOL DE ORO: " + ef2.getNombre());
                golDeOro = true;
            }   

        } while (!golDeOro);
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
    
    /**
     * Sobreescritura del método toString para mostrar mejor los 
     * resultados por pantalla.
     * */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Jornada nº ");
        sb.append(this.numeroJornada);
        sb.append("; Partido nº: ");
        sb.append(this.numPartido);
        sb.append("; Encuentro: ");
        sb.append("; Local: ");
        sb.append(this.ef1.getNombre());
        sb.append("; Visitante: ");
        sb.append(this.ef2.getNombre());
        if (!empate) {
            sb.append("; Equipo ganador: ");
            sb.append(this.ganador);           
        }
        else
        {
            sb.append("; Equipo ganador: ");
            sb.append("Empate");
        }
        sb.append("; Resultado: ");
        sb.append(this.resultado);
        
        if (empate) {
            sb.append(" EMPATE! GANADOR POR GOL DE ORO: ");
            sb.append(this.ganador);
        }
        
        return sb.toString();
    }

    public String getEquipoGanador() {
        return ganador;
    }

    public void setEquipoGanador(String equipoGanador) {
        this.ganador = equipoGanador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }

    public int getNumeroJornada() {
        return numeroJornada;
    }

    public void setNumeroJornada(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public void setNumPartido(int numPartido) {
        this.numPartido = numPartido;
    }
    
    public EquipoFutbol getEf1() {
        return ef1;
    }

    public void setEf1(EquipoFutbol ef1) {
        this.ef1 = ef1;
    }

    public EquipoFutbol getEf2() {
        return ef2;
    }

    public void setEf2(EquipoFutbol ef2) {
        this.ef2 = ef2;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    
 
}
