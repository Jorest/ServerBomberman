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
public class Jugador {
    private int id; 
    private int x;
    private int y; 
    private int cant_muertes=0; 
    private int cant_bombas=0; 
    private int velocidad=1;
    private int potenciaB=3; 
    private int cant_bombasPermitidas=1;

    public Jugador(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public void MoveIzquierda(){
        x=x-1;    
    }
    public void MoveDerecha(){
         x=x+1; 
    }
    public void MoveArriba(){
         y=y-1; 
    }
    public void MoveAbajo(){
         y=y+1; 
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCant_muertes() {
        return cant_muertes;
    }

    public void setCant_muertes(int cant_muertes) {
        this.cant_muertes = cant_muertes;
    }

    public int getCant_bombas() {
        return cant_bombas;
    }

    public void setCant_bombas(int cant_bombas) {
        this.cant_bombas = cant_bombas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPotenciaB() {
        return potenciaB;
    }

    public void setPotenciaB(int potenciaB) {
        this.potenciaB = potenciaB;
    }

    public int getCant_bombasPermitidas() {
        return cant_bombasPermitidas;
    }

    public void setCant_bombasPermitidas(int cant_bombasPermitidas) {
        this.cant_bombasPermitidas = cant_bombasPermitidas;
    }
    
    
    
    
}
