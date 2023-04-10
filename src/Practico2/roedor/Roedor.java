/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2.roedor;

/**
 *
 * @author ortiz
 */
public class Roedor {
    private float peso;
    private String tipo;
    
    public Roedor(){
       
    }
    
    public void setTipo(String tipo, float peso){
        this.tipo=tipo;
        this.peso=peso;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public float getPeso(){
        return peso;
    }
   public void imprimir(){
       System.out.println("\n El tipo es: "+getTipo()+"\n Y su peso es: "+getPeso());
   }
}
