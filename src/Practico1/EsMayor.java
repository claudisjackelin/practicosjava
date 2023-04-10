/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EsMayor {
    public  boolean esMayor(int x){
        int y;
        System.out.println("Ingrese un valor para Y\n");
        Scanner leer=new Scanner(System.in);
        y=leer.nextInt();
        if((x-y)>=2){
            return true;
        }
        else {
            return false;
        }
        
    }
}
