/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class ProgramaFibonacci {
    private int cantIteraciones;
    
    public ProgramaFibonacci(int iteraciones){
        cantIteraciones=iteraciones;
    }
    public void setProgramaFibonacci(int iteraciones){
        this.cantIteraciones=iteraciones;
    }
    public void imprimirFor(){
        int r, a=0, b=1, i;
        for(i=0;i<cantIteraciones;i++){
            r=a+b;
            a=b; 
            b=r;
            System.out.printf("Iteracion %d: %d \n", i+1, r);
        }
    }
    
    public void imprimirWhile(){
        int r, a=0, b=1, i=0;
        while(i<cantIteraciones){
            r=a+b;
            a=b;
            b=r;
            System.out.printf("La Iteracion %d es: %d\n", i+1, r);
            i++;
        }

    }
    public void imprimirDoWhile(){
        int r, a=0, b=1, i=0;
        do{
            r=a+b;
            a=b; 
            b=r;
            i++;
            System.out.printf("%d: %d\n", i+1, r);
        }while(i<cantIteraciones);
    }

    public void imprimirFooBarBaz(){
        for(int i=1;i<=cantIteraciones;i++){
            System.out.printf("\n* %d ", i);
            if(i%3==0) System.out.printf("foo ");
            if(i%5==0) System.out.printf("bar ");
            if(i%7==0) System.out.printf("baz ");        
        }    
    }
}

