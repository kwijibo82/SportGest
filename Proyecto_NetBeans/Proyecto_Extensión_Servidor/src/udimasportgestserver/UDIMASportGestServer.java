/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udimasportgestserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class UDIMASportGestServer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        
        //sockets
        ServerSocket serverSocket = null;
        Socket socket = null; 
        
        String json = null;
        
        //entradas y salidas
        InputStream is = null;
        OutputStream os = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        
        try   
        {
            serverSocket = new ServerSocket(5001);
            
            System.out.println ("Esperando conexiones entrantes...");
            
            Scanner sc = new Scanner(System.in);
            String opt = null;
              
            while (!"0".equals(opt))
            {
                socket = serverSocket.accept();
            
                System.out.println("Conexión establecida correctamente!");
                System.out.println("Esperando peticiones. O --> Para servidor");

                is = socket.getInputStream();
                ois = new ObjectInputStream(is);

                json = (String) ois.readObject();
                
                System.out.println("DATOS RECIBIDOS: ");
                System.out.println(json.toString());
            }
   
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            is.close();
            ois.close();
            socket.close();
        }
    }

}
