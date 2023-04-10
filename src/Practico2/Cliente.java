/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class Cliente {
    private String nombre;
    private Long dni;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, Long dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDni(Long dni){
        this.dni=dni;
    }
    public String getNombre(){
        return nombre;
    }
    public long getDni(){
        return dni;
    }
}
