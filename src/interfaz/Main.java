/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import Practico1.*;
import Practico2.*;
import java.util.Scanner;

/**
 *
 * @author ortiz
 */
public class Main {
        public static void main(String[] args) {
            int seleccion;
            do{
                System.out.println("\nSeleccione una opcion");
                System.out.println("\nMenu\n");
                System.out.println("1---Practico 1\n");
                System.out.println("2---Practico 2\n");
                System.out.println("3--Salir \n");
                        
                Scanner leer=new Scanner (System.in);
                seleccion=leer.nextInt();
                switch(seleccion){
                    case 1:
                        MenuPractico1.seleccionarEjercicio();
                        break;
                    case 2:
                        MenuPractico2.seleccionarEjercicio();
                        break;
                    case 3:
                        System.out.println("Adios");
                        break;
                        
                    default:
                        System.out.println("Opcion no valida");        
                }
            }while(seleccion!=3);   
    }
}