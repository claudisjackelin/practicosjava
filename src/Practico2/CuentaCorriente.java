/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author ortiz
 */
public class CuentaCorriente {
    private long numeroDeCuentaCorriente;
    private String nombreCliente;
    private long cantidadDineroADepositadoPorCliente;
    private long cantidadDineroAPagarPorCliente;
    
    
    public CuentaCorriente(){
        
    }
    public void setNumeroDeCuentaCorriente(long numeroDeCuentaCorriente){
        this.numeroDeCuentaCorriente=numeroDeCuentaCorriente;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    
    public void setCantidadDineroADepositarPorCliente(long cantidadDineroDepositado){
        this.cantidadDineroADepositadoPorCliente=cantidadDineroDepositado;
    }
    
    public void setCantidadDineroAPagarPorCliente(long cantidadDineroAPagar){
        this.cantidadDineroAPagarPorCliente=cantidadDineroAPagar;
    }
    
    public long getNumeroDeCuentaCorriente(){
        return numeroDeCuentaCorriente;
    }
    
    public String getNombreCliente(){
        return nombreCliente; 
    }
    
    public long getCantidadDineroADepositadoPorCliente(){
        return cantidadDineroADepositadoPorCliente;
    }
        
    public long getCantidadDineroAPagarPorCliente(){
        return cantidadDineroAPagarPorCliente; 
    }
    
    public long calcularSaldo(){
        return cantidadDineroADepositadoPorCliente-cantidadDineroAPagarPorCliente; 
    }
    
}
