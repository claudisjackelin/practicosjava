/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Cheque {
    int DIGITOS=10;
    private String numeroDeCheque;
    public Cheque(){
    }
    
    public Cheque(String numeroDeCheque){
        this.numeroDeCheque=numeroDeCheque;
    }
    
    public static int getNum(){
        return 14;
    }
    
    public boolean esFalso(){
       int i=0, cantCeros=0, cantNumeros=0;
       do{
           if(numeroDeCheque.substring(i, i+1).equals("0")){
               cantCeros++;
               cantNumeros=0;
           }
           else{
             cantNumeros++;
             cantCeros=0;
           }
           i++;
       }while(cantCeros<3 &cantNumeros<4 &i<DIGITOS);
        return !(i==DIGITOS);
    }
  
}
