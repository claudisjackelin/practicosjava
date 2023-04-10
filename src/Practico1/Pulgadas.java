/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Pulgadas {
    
    private Double valor;
    
    public Pulgadas(Double inicializacion){
        valor = inicializacion;
    }
    
    public void setValor(Double entrada){
        valor = entrada;
    }
    
    public Double getValor(){
        return valor;
    }
    
    public Double toMeters(){
        return valor*0.0253;
    }
    
    public Double toCentimeters(){
        return valor*0.0253;
    }
    
    public Double toKilometers(){
        return valor*0.0253;
    }
}
