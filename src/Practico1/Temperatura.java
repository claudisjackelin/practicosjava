/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Temperatura {
    private float temFahrenheit;
    
    public Temperatura(){
        // existe si no hay ninguno, aqui no es necesario, es como si existiera
    }
    public void setTemperatura(float x){
        this.temFahrenheit=x;
    }
    public float toCelsius(){
        return ((temFahrenheit-32)*5)/9;
    }
}
