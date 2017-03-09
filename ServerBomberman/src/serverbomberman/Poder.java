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
public class Poder {
    private int tipo; 
    private int x; 
    private int y; 

    public Poder(int tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
    
    
    
}
