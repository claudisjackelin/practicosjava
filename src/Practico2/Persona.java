/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class Persona {
    private String nombre;
    private int edad;
    private String domicilio;
    private String estadoCivil;
    
    public Persona(){
        nombre="";
        edad=0;
        domicilio="";
        estadoCivil="";
    }
    
    public Persona(String nombre, int edad, String domicilio, String estadoCivil){
        this.nombre=nombre;
        this.edad=edad;
        this.domicilio=domicilio;
        this.estadoCivil=estadoCivil;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil=estadoCivil;
    }
}
