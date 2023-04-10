/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class Kiosco {
    private Compra[] compras= new Compra[100];
    private int i;
    
    public Kiosco(){
        i=0;
    }
    public void agregarUnaCompra(Compra compra){
        this.compras[i]=compra;
        i++;
    }
    public Compra[] getCompras(){
        return compras;
    }
}
