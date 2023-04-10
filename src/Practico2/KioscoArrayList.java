/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

import java.util.ArrayList;

/**
 *
 * @author ortiz
 */
public class KioscoArrayList {
    private ArrayList<Compra> compras= new ArrayList<>();

    
    public KioscoArrayList(){

    }
    
    public void agregarUnaCompra(Compra compra){
        compras.add(compra);

    }
    
    public ArrayList<Compra> getCompras(){
        return compras;
    }
}
