/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class Producto {
    private String nombre;
    private int idProducto;
    private float precio;
    
    public Producto(){
 
    }
    public Producto(String nombre, int idProducto, float precio){
        this.nombre=nombre;
        this.idProducto=idProducto;
        this.precio=precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getCodigo(){
        return idProducto;
    }

    public float getPrecio(){
        return precio;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCodigo(int codigo){
        this.idProducto=codigo;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }
}
