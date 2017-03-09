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
    private int tiempo=0; 
    private int [][] tablero=new int[][]{
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
    private Jugador [] jugadores; 
    private Bomba [] bombas; 
    private Fire [] fires;
    private Poder [] poderes; 

    public Estado() {
        //tablero=new int [2--1][2--1];
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
