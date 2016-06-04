/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Javi
 */
public class Datos {
    
    /** 
     * Método que graba en un archivo de texto las simulaciones
     * @param arrayPadel
     * @param arrayFutbol
     * @throws IOException 
     */
    public static void grabarEnArchivo(ArrayList<PartidoPadel> arrayPadel,
            ArrayList<PartidoFutbol> arrayFutbol) throws IOException {

        BufferedWriter output = null;
        try {

            File file = new File("simulacion" +obtenFecha()+ ".txt");
            output = new BufferedWriter(new FileWriter(file));
            
            output.append("-------------------------------\n");
            output.append("      LIGA PADEL\n");
            output.append("-------------------------------\n");
            for (Object o : arrayPadel) {
                output.append(o.toString() + "\n");
            }
            output.append("-------------------------------\n");
            
            output.append("      LIGA Futbol\n");
            output.append("-------------------------------\n");
            for (Object o : arrayFutbol) {
                output.append(o.toString() + "\n");
            }
            
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
    }

    /**
     * Método que obtiene la fecha de cada simulación
     * @return 
     */
    public static String obtenFecha()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss");

	Date date = new Date();

        return dateFormat.format(date);
    }
    
    /**
     * Método que graba todos los datos del sistema en un archivo
     * de texto con extensión csv
     * @throws FileNotFoundException
     * @throws IOException 
     */
     public static void guardarDatosEnFichero() 
            throws FileNotFoundException, IOException   {      
        
         JFileChooser fileChooser = new JFileChooser();
         if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

         File f = fileChooser.getSelectedFile();
         
            FileWriter writer = new FileWriter(f + ".csv"); 


            for(Usuario u :Main.arrayUsuario) 
            {
                  writer.write(u.toString());
            }

            for(Equipo e :Main.arrayEquipos) 
            {
                  writer.write(e.toString());
            }

            for(Competicion c :Main.arrayCompeticion) 
            {
                  writer.write(c.toString());
            }

            writer.close();

         }
         
    }

    /**
     * Método que carga los datos desde un fichero con extensión csv
     * devuelve true si estos se han cargado correctamente en los arrays
     * arrayCompetición, arrayEquipos y arrayUsuarios.
     * @throws IOException 
     */ 
    public static boolean cargarDatos() throws IOException {
        
        boolean resul = false;
        
        //borramos datos previamente de memoria para cerciorarnos de 
        //que los arrays se han llenado con datos nuevos
        Main.arrayCompeticion.clear();
        Main.arrayEquipos.clear();
        Main.arrayUsuario.clear();
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV FILE",
                "CSV", "csv");
        fileChooser.setFileFilter(filter);
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
            
            String spliter = ";";      
        
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = br.readLine();

            while(line!=null)
            {
                String[] arrayStr = line.split(spliter);

                //el csv está codificado de manera que cada linea
                //se inicia indicando qué clase de objeto hay en ella
                switch (arrayStr[0])
                {
                    //linea Usuario
                    case "u":
                        Usuario u = new Usuario();
                        u.setDNI(arrayStr[1]);
                        u.setNombre(arrayStr[2]);
                        Main.arrayUsuario.add(u);
                        break;
                    //linea Equipo
                    case "e":
                        Equipo e = new Equipo();
                        e.setId(arrayStr[1]);
                        e.setNombre(arrayStr[2]);
                        Main.arrayEquipos.add(e);
                        break;
                    //linea Competición
                    case "c":    
                        Competicion c = new Competicion();
                        c.setIdCompeticion(arrayStr[1]);
                        c.setNombre(arrayStr[2]);
                        Main.arrayCompeticion.add(c);
                        break;
                    default:
                        break;
                }

                line = br.readLine();
            }
            
            
            br.close();
            
            //controla que se hayan llenado los arrays, por tanto los
            //datos se habrán debido cargar correctamente
            if (Main.arrayCompeticion.isEmpty() ||
                Main.arrayEquipos.isEmpty() ||
                Main.arrayUsuario.isEmpty())
            {
                resul = false;
            }
            else
            {
                resul = true;
            }
     
            

        }       
        
        return resul;
    }

}
