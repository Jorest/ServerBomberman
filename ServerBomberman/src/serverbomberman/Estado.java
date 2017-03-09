/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbomberman;

/**
 *
 * @author lduarte
 */
public class Estado {
    private int tiempo = 0; 
    private int [][] tablero = new int[][]{
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0},
        { 0, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1,  0, -1, -1,  0,  1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0,  1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0,  1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, 0},
        { 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0}
        
    };
    Jugador [] jugadores; 
    private Bomba [] bombas; 
    private Fire [] fires;
    private Poder [] poderes; 

    public Estado() {
        //tablero=new int [2--1][2--1];
        Jugador jugador1 =  new Jugador(1, 1, 1);
        Jugador jugador2 =  new Jugador(2, 18, 1);
        Jugador jugador3 =  new Jugador(3, 1, 18);
        Jugador jugador4 =  new Jugador(4, 18, 18);
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        jugadores[2] = jugador3;
        jugadores[3] = jugador4;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
  

    public Bomba[] getBombas() {
        return bombas;
    }

    public void setBombas(Bomba[] bombas) {
        this.bombas = bombas;
    }

    public Fire[] getFires() {
        return fires;
    }

    public void setFires(Fire[] fires) {
        this.fires = fires;
    }

    public Poder[] getPoderes() {
        return poderes;
    }

    public void setPoderes(Poder[] poderes) {
        this.poderes = poderes;
    }

        
    
}
