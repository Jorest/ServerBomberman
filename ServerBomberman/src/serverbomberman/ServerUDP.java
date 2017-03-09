/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbomberman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author lduarte
 */
public class ServerUDP {
    //ServerSocket servidor;
    DatagramSocket socket;
    DatagramPacket entrada;
    ColaUDP cola;
    Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    int max_jugadores = 4;
    
    /**
     * @param args the command line arguments
     */
    public ServerUDP() throws IOException{
        int puerto = 4001;
        
        estado = new Estado();
        
        byte [] datos_entrada = new byte[1024];
        
        System.out.println("Servidor iniciando...");
           
        entrada = new DatagramPacket(datos_entrada, datos_entrada.length);
        
        cola = new ColaUDP(max_jugadores);
        
        for(int i=0; i<max_jugadores; i++){
            DatagramSocket socket1 = new DatagramSocket(puerto);
            
            RequestServerUDP request = new RequestServerUDP(cola, estado, socket1);
            
            Thread thread = new Thread(request);
            thread.start();
            cola.put(socket1);
            
            puerto++;
        }

        
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        // TODO code application logic here
        
        //ArrayList<Jugador> clientes = new ArrayList<Jugador>();
              

        System.out.println("Iniciando Servidor");
        
        ServerUDP server = new ServerUDP();
        


    }
    
    
}
