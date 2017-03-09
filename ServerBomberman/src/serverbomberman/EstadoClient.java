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
public class EstadoClient {
    private Jugador jugador; 
    private int [][] tablero;
    private Bomba [] bombas;

    public EstadoClient() {
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public Bomba[] getBombas() {
        return bombas;
    }

    public void setBombas(Bomba[] bombas) {
        this.bombas = bombas;
    }
    
    
    
}
