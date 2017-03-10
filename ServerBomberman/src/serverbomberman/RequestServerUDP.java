/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbomberman;
import com.google.gson.Gson;

import java.util.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
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
    
    public RequestServerUDP(ColaUDP cola, DatagramSocket socket) {
        this.cola = cola; 
       
        this.socket = socket;
        
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }
    
    public static String getCurrentTimeStamp() {
        

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Date now = new Date();
        String strDate = sdf.format(now);
        return strDate;
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
                    System.out.println("chambeando"+"\n");
                    
                    byte [] datos_entrada = new byte[2048];
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
                    
                    System.out.println("Conexión establecida. El cliente "+address+", puerto "+puerto+" dice: "+new String(datos_entrada).trim()+"hora: "+getCurrentTimeStamp());
                    
                    String recibido = new String(datos_entrada).trim();
                    
                    
                    EstadoClient estado_recibido = gson.fromJson(recibido, EstadoClient.class);
                    
                    cola.updateEstado(estado_recibido);
                    
                    //respuesta
                    
                    byte[] datos_salida = new byte[2048];

                    //mandar estado unificado aqui
                    //String mensaje_salida = "putos";
                   
                    String jsonInString = gson.toJson(cola.getEstado());


                    datos_salida = jsonInString.getBytes();
                    
                    DatagramPacket salida = new DatagramPacket(datos_salida, jsonInString.length(), address, puerto);
                    socket.send(salida);
                    System.out.println("Salida "+getCurrentTimeStamp()+": "+jsonInString+"\n");
                }
                 
                 
             }catch(Exception e){
                 System.err.println(e.getMessage());
                 System.exit(1);
             }
        }
    }
    
}
