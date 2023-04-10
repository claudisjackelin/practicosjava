/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author ortiz
 */
public class Ano {
    private int numeroAno;
   public Ano(int ano){
       numeroAno=ano;
   }
   public Ano(){
       
   }
    public int getNumeroAnos(){
        return numeroAno;
    }
    public void setNumeroAnos(int cantidadAnos){
       this.numeroAno=cantidadAnos; 
    }
    public boolean esBisiesto(){
        return ((numeroAno%4==0 &&numeroAno%100!=0) || (numeroAno%100==0 && numeroAno%400==0));
   }
   
    public void diasDelMes(int mes){      
       switch(mes){
           case 1:
               System.out.println("31 dias");
               break;
           case 2:
               if(esBisiesto()){
                    System.out.println("29 dias");
               }
               else{
                   System.out.println("28 dias");
               }
               break;
           case 3:
               System.out.println("31 dias");
               break;
           case 4:
               System.out.println("30 dias");
               break;
           case 5:
               System.out.println("31 dias");
               break;
           case 6:
               System.out.println("30 dias");
               break;
           case 7:
               System.out.println("31 dias");
               break;
           case 8:
               System.out.println("31 dias");
               break;
           case 9:
               System.out.println("30 dias");
               break;
           case 10:
               System.out.println("31 dias");
               break;
           case 11:
               System.out.println("30 dias");
               break;
           case 12:
               System.out.println("31 dias");
               break;
           default:
               System.out.println("Ingrease una opcion valida\n");
       }
   }
       
}
