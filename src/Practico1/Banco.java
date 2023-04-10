/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;
import java.util.ArrayList;

/**
 *
 * @author ortiz
 */
public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<>();
    private String nombre;
    
    public Banco(){
       
    }
    
    public Banco(String nombre){
        this.nombre = nombre;
       
    }
    
    public void insertarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public int getNumeroClientes(){
        return clientes.size();
    }
    public ArrayList<Cliente> getDatosClientes(){
        return clientes;
    }

}
