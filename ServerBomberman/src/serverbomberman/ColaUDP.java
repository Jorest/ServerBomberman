/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbomberman;

import java.net.DatagramSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;

/**
 *
 * @author lduarte
 */
public class ColaUDP {
    private final LinkedList cola;
    private int activos; 
    private final int cantThreads; 
    Estado estado;
    EstadoClient estado_cliente;

    public EstadoClient getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(EstadoClient estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ColaUDP(int canThreads) {
        cola= new LinkedList();
        this.cantThreads=canThreads;
        Estado estado = new Estado();
        EstadoClient estado_cliente = new EstadoClient();
    }
    
    public void updateEstado(EstadoClient estado_cliente){
        this.estado.setBombas(estado_cliente.getBombas());
    }
    
    public synchronized DatagramSocket get(){
        if(cola.isEmpty()){
            try {
                //System.out.println("No hay chance a dormir!!!");
                activos--;
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        //System.out.println("Hora de levantarse y chambear");
        DatagramSocket socket=(DatagramSocket)cola.poll();
        activos++;
        return socket; 
    }
    
    public synchronized DatagramSocket panico(){
        if(cola.isEmpty()){
            //System.out.println("llego la hora de morir");
            Thread.currentThread().stop();
            
        }
        DatagramSocket socket=(DatagramSocket)cola.poll();
        return socket;    
    }
    
    public synchronized void put(DatagramSocket socket){
        System.out.println("Ingresando a cola");
        cola.add(socket);
        notify();
        if(activos==cantThreads && activos<cantThreads+2){
            RequestServerUDP request= new RequestServerUDP(true,this);
            Thread thread= new Thread(request);
            thread.start();
        }
    }
    
}
