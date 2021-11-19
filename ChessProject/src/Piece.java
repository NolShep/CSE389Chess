/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryan
 */
public abstract class Piece {
    
    int x;
    int y;
    int color;
    
    abstract boolean isValidMove();
    
    abstract int getX();
    
    abstract int getY();
    
    abstract void setX();
    
    abstract void setY();
   
}
