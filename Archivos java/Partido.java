/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.io.File;

/**
 *
 * @author Javi
 */
public interface Partido {  

    public void resultadoPartido(int jornada);
    
    public int randomResultado(int max, int min); 

}
