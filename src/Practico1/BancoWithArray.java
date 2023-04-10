package Practico1;

/**
 *
 * @author ortiz
 */
public class BancoWithArray {
    private Cliente clientes[]= new Cliente[100];
    private String nombre;
    private int indice;
    
    public BancoWithArray(){
        this.indice = 0;
    }
    
    public BancoWithArray(String nombre){
        this.nombre = nombre;
        this.indice = 0;
    }
    
    public void insertarCliente(Cliente cliente){
        clientes[indice]=cliente;
        indice++;
    }
    
    public int getNumeroClientes(){
        return indice;
    }
    public Cliente[] getDatosClientes(){
        return clientes;
    }

}
