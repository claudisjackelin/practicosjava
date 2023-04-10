/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class Pixel {
    private int x;
    private int y;
    private int color;
    
    public Pixel(){
        
    }
    
    public Pixel (int x, int y, int color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    
    public Boolean transladarseEncimaDe(int x, int y){
        if(y<=0){
            return false;
        }
        this.y=y-1;
        this.x=x;
        return true;
    }
    
    public Boolean transladarseDebajoDe(int x, int y){
        this.y=y+1;
        this.x=x;
        return true;
    }
    
    public Boolean transladarseALaDerechaDe(int x, int y){
        this.y=y;
        this.x=x+1;
        return true;
    }
    
    public Boolean transladarseALaIzquierdaDe(int x, int y){
        if(x<=0){
            return false;
        }
        this.y=y;
        this.x=x-1;
        return true;
    }
    
    public Boolean cambiarColor(int color){
      if(color>255 || color <0){
          return false;
      }
        this.color=color;
        return true;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getColor(){
        return color;
    }
}
