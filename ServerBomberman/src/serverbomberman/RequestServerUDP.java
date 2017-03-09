/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbomberman;
import com.google.gson.Gson;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Calendar;
;

/**
 *
 * @author lduarte
 */
final class RequestServerUDP implements Runnable {
    private DatagramSocket socket; 
    private ColaUDP cola; 
    private boolean auxiliar=false;
    Estado estado;
    

    public RequestServerUDP( boolean auxiliar, ColaUDP cola) {
        this.auxiliar=auxiliar; 
        this.cola=cola;
       
    }

    public RequestServerUDP(ColaUDP cola) {
        this.cola=cola; 
    }
    
    public RequestServerUDP(ColaUDP cola, Estado estado, DatagramSocket socket) {
        this.cola = cola; 
        this.estado =  estado;
        this.socket = socket;
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }
     
    @Override
    public void run() { 
       while(true){
           if(auxiliar){
                socket=cola.panico();
            }else{
                socket=cola.get();
            }
            try{
                while(true){
                    Gson gson = new Gson();
                    System.out.println("chambeando");
                    byte [] datos_entrada = new byte[1024];
                    String respuesta = "";
                    String leido = "";
                    String leido_string = "";

                    String request_line = "";
                    StringTokenizer separador = null;

                    DatagramSocket socket = this.socket;
                    //recibiendo
                    DatagramPacket entrada = new DatagramPacket(datos_entrada, datos_entrada.length);

                    //socket = cola.get();
                    
                    
                    socket.receive(entrada);
                       
                    //mandar a actualizar estado aqui
                    
                    int puerto = entrada.getPort();                 
                    InetAddress address = entrada.getAddress();
                    
                    System.out.println("Conexión establecida. El cliente "+address+", puerto "+puerto+" dice: "+new String(datos_entrada).trim()+"hora: "+Calendar.getInstance().getTime()+"\n");
                    
                    String recibido = new String(datos_entrada).trim();
                    EstadoClient estado_recibido = gson.fromJson(recibido, EstadoClient.class);
                    
                    
                    //respuesta
                    

                    byte[] datos_salida = new byte[1024];

                    //mandar estado unificado aqui
                    //String mensaje_salida = "putos";
                   
                    String jsonInString = gson.toJson(estado);


                    datos_salida = jsonInString.getBytes();

                    DatagramPacket salida = new DatagramPacket(datos_salida, jsonInString.length(), address, puerto);
                    socket.send(salida);
                }
                 
                 
             }catch(Exception e){
                 System.err.println(e.getMessage());
                 System.exit(1);
             }
        }
    }
    
}
