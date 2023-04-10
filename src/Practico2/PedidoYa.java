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
public class PedidoYa {
   private ArrayList<Cliente> listaClientes = new ArrayList<>();
   private ArrayList<Producto> listaProductos = new ArrayList<>();
   private KioscoArrayList kiosco;
   
   public PedidoYa(){  
    listaClientes.add(new Cliente("Maria", 789654123L));
    listaClientes.add(new Cliente("Jose", 852147963L));
    listaClientes.add(new Cliente("Karla", 95802977L));
    listaClientes.add(new Cliente("Marcos", 95803600L));
    
    listaProductos.add(new Producto("Shampo", 123, 850));
    listaProductos.add(new Producto("Pasta", 456, 350));
    listaProductos.add(new Producto("Atun", 741, 670));
    listaProductos.add(new Producto("Arroz", 963, 299));
    
    }
   
   public ArrayList<Producto> getListaProductos(){
       return listaProductos;
   }
   
   public Boolean existeCliente(Long dni){
       for(Cliente item:listaClientes){
           if(dni.equals(item.getDni())) {
               return true;
           }
       }
       return false;
   } 
   
   public void setAdministradorKiosco(KioscoArrayList listaCompras){
       this.kiosco=listaCompras;
   }
   
   public Double totalMonto(){
       double montoTotal=0;
       for(Compra compra: kiosco.getCompras()){
           montoTotal+=totalMonto(compra);
       }
       return montoTotal;
   }
   
   public Double totalMonto(Cliente unCliente){
        double montoTotal=0;
        for(Compra compra: kiosco.getCompras()){
           if(unCliente.getDni()==compra.getDniCliente()){
               montoTotal=totalMonto(compra);
           }

       }
       return montoTotal;
   }
   
   public Double totalMonto(Compra unaCompra){
        double montoTotal=0;
        int[] idProducto = unaCompra.getIdProductos();
        int[] cantidadPorProducto = unaCompra.getCantidadPorProducto();
            for(int i=0; i<unaCompra.getCantidadProductos(); i++ ){
                 float precio;
                 precio = getPrecio(idProducto[i]);
                 montoTotal+=cantidadPorProducto[i]* precio;
             }
        return montoTotal;     
   }
   
   private float getPrecio(int idProducto){
       for(Producto producto: this.listaProductos){
           if(producto.getCodigo()== idProducto){
               return producto.getPrecio();
           }
       }
       return 0;
   }

}
