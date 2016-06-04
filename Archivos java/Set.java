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
public class Set extends PartidoPadel{
    
    private int resultadoEquipo1;
    private int resultadoEquipo2;
    private int ganadorEquipo1;
    private int ganadorEquipo2;

    public Set(ParejaPadel pareja1, ParejaPadel pareja2) {
        super(pareja1, pareja2);
    }    

    public int getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    public void setResultadoEquipo1(int resultadoEquipo1) {
        this.resultadoEquipo1 += resultadoEquipo1;
    }

    public int getResultadoEquipo2() {
        return resultadoEquipo2;
    }

    public void setResultadoEquipo2(int resultadoEquipo2) {
        this.resultadoEquipo2 += resultadoEquipo2;
    }

    public int getGanadorEquipo1() {
        return ganadorEquipo1;
    }

    public void setGanadorEquipo1(int ganadorEquipo1) {
        this.ganadorEquipo1 += ganadorEquipo1;
    }

    public int getGanadorEquipo2() {
        return ganadorEquipo2;
    }

    public void setGanadorEquipo2(int ganadorEquipo2) {
        this.ganadorEquipo2 += ganadorEquipo2;
    }

}
