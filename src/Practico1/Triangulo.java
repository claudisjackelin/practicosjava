/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Triangulo {
    double catetoOpuesto;
    double catetoAdyacente;
    
    public void triangulo (double catetoOpuesto,double ca ){
        this.catetoOpuesto=catetoOpuesto;
        this.catetoAdyacente=ca;
    }
    public void toHipotenusa(){
        double valorHipotenusa;
        valorHipotenusa=Math.sqrt(Math.pow(catetoOpuesto, 2)+Math.pow(catetoAdyacente, 2));
        System.out.println("La Hipotenusa es: "+valorHipotenusa);
        System.out.printf("La hipotenusa es: %fl",Math.sqrt(Math.pow(catetoOpuesto, 2)+Math.pow(catetoAdyacente, 2)) );
        //return Math.sqrt(Math.pow(catetoOpuesto, 2)+Math.pow(catetoAdyacente, 2));
    }
  
}
