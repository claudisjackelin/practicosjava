/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Persona {
    private int cantidadAnos;
    
    public Persona(int anos){
        cantidadAnos=anos;
    }
    public Persona (){
        
    }
    public int getCantidadAnos(){
        return cantidadAnos;
    }
    public void setCantidadAnos(int cantidadAnos){
       this.cantidadAnos=cantidadAnos; 
    }
    public long segundosVividos(){
        return cantidadAnos*60*60*24*365;
    }
    public long minutosVividos(){
        return cantidadAnos*60*24*365;
    }
    public long horasVividos(){
        return cantidadAnos*24*365;
    }
}

