package Practico1;

/**
 *
 * @author ortiz
 */
public class Cliente {
    private String nombre;
    private int dni;
    
    public Cliente(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    public Cliente(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
}
