/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;
import java.util.Date;

/**
 *
 * @author ortiz
 */
public class Compra {
    private int[] idProducto= new int[100];
    private int[] cantidadPorProducto= new int[100];
    private Long dniCliente;
    private Date fecha;
    private int i;
    
    public Compra(Long dniCliente){
        fecha = new Date();
        i=0;
        this.dniCliente=dniCliente;        
    }
    
    public void agregarProducto(int idProducto, int cantidad){
        this.idProducto[i]= idProducto;
        this.cantidadPorProducto[i]= cantidad;
        i++;
    }
    public void agregarProducto(int idProducto){
        agregarProducto(idProducto, 1);
    }
    public int[] getIdProductos(){
        return idProducto;
    }
    public int[] getCantidadPorProducto(){
        return cantidadPorProducto;
    } 
    public Long getDniCliente(){
        return dniCliente;
    }
    public int getCantidadProductos(){
        return i;
    }

}
    
