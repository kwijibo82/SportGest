/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgest;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Javi
 */
public class EnviarDato {
    
    //ip y puerto
    private static final String IP = "127.0.0.1";
    private static final int PUERTO = 5001;
    
    
    /**
     * Método que envia un Json al servidor
     * @param jsonAsString
     * @throws IOException 
     */
    public static void enviarJson(String jsonAsString) throws IOException
    {
        //socket
        Socket socketClient = null;
        
        //entrades y salidas
        InputStream is = null;
        OutputStream os = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        
        try
        {
            //conexión
            socketClient = new Socket(IP, PUERTO);
                     
            //datos.Persona p = new datos.Persona("Alba", 28, "0000000A", "Dona");
            
            //abrimos socket
            os = socketClient.getOutputStream();
            oos = new ObjectOutputStream(os);
            
            oos.writeObject(jsonAsString);     
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            os.close();
            oos.close();
            socketClient.close();
        }      
    }
    
}
