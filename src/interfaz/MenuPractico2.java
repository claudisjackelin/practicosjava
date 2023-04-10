/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import Practico2.Cliente;
import Practico2.Compra;
import Practico2.CuentaCorriente;
import Practico2.Kiosco;
import Practico2.KioscoArrayList;
import Practico2.PedidoYa;
import Practico2.Persona;
import Practico2.Pixel;
import Practico2.Producto;
import Practico2.roedor.Gerbil;
import Practico2.roedor.Hamster;
import Practico2.roedor.Raton;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author ortiz
 */
public class MenuPractico2 {
        public static void seleccionarEjercicio(){
        Scanner leer=new Scanner(System.in);
        int opcion;        
                    
        do{
            System.out.println("\nMenu\n");
            System.out.println("1---Ejercicio 1\n");
            System.out.println("2---Ejercicio 3\n");
            System.out.println("3---Ejercicio 5\n");
            System.out.println("4---Ejercicio 6\n");
            System.out.println("5---Ejercicio 7\n");
            System.out.println("6---Ejercicio 8\n");
            System.out.println("7---Ejercicio 9\n");
            System.out.println("8---Ejercicio 10\n");
            System.out.println("9---Ejercicio 11\n");
            System.out.println("10--Ejercicio 12\n");
            System.out.println("11--Ejercicio 13\n");
            System.out.println("12--Ejercicio 14\n");
            System.out.println("13--volver \n");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: 
                    Persona persona1= new Persona();
                    persona1.setNombre("Maria");
                    persona1.setEdad(24);
                    persona1.setEstadoCivil("Soltera");
                    persona1.setDomicilio("Juana Koslay");
                    Persona persona2= new Persona();
                    persona2.setNombre("Marcos");
                    persona2.setEdad(27);
                    persona2.setEstadoCivil("Casado");
                    persona2.setDomicilio("Villa Ballester");
                    System.out.println(persona1.getNombre()+" "+persona1.getEdad()+ " "+persona1.getEstadoCivil()+" "+persona1.getDomicilio());
                    System.out.println(persona2.getNombre()+" "+persona2.getEdad()+ " "+persona2.getEstadoCivil()+" "+persona2.getDomicilio());
                    break;
                case 2:
                    CuentaCorriente cuentaCorriente1= new CuentaCorriente();
                    CuentaCorriente cuentaCorriente2= new CuentaCorriente();
                    cuentaCorriente1.setNumeroDeCuentaCorriente(123654789);
                    cuentaCorriente1.setNombreCliente("Carlos");
                    cuentaCorriente1.setCantidadDineroADepositarPorCliente(80000);
                    cuentaCorriente1.setCantidadDineroAPagarPorCliente(60000);
                    cuentaCorriente2.setNumeroDeCuentaCorriente(123789654);
                    cuentaCorriente2.setNombreCliente("Juan");
                    cuentaCorriente2.setCantidadDineroADepositarPorCliente(300000);
                    cuentaCorriente2.setCantidadDineroAPagarPorCliente(280000);
                    System.out.println("\nNumero de Cuenta:"+" "+cuentaCorriente1.getNumeroDeCuentaCorriente()+" " +"Nombre Cliente:"+" "+
                    cuentaCorriente1.getNombreCliente()+" "+ "Total Depositado:"+" "+cuentaCorriente1.getCantidadDineroADepositadoPorCliente()+" "+
                    "Total deducido:"+" "+cuentaCorriente1.getCantidadDineroAPagarPorCliente()+" "+"Disponible:"+" "+cuentaCorriente1.calcularSaldo()+" ");
                    
                    System.out.println("\nNumero de Cuenta:"+" "+cuentaCorriente2.getNumeroDeCuentaCorriente()+" "+"Nombre Cliente:"+"  "+
                    cuentaCorriente2.getNombreCliente()+" "+"Total Depositado: "+ "  " +cuentaCorriente2.getCantidadDineroADepositadoPorCliente()+" "+
                    "Total deducido: "+"  "+ cuentaCorriente2.getCantidadDineroAPagarPorCliente()+" "+"Disponible: "+" " + cuentaCorriente2.calcularSaldo());
                    
                    break;
                case 3:
                    PedidoYa pedido= new PedidoYa();
                    KioscoArrayList administradorCompras= new KioscoArrayList();
                    Long dni;
                    Cliente cliente= new Cliente();
                    int codigo,cantidad, op, opc;

                    do{   
                        System.out.println("\n Verificacion De Cliente");
                        System.out.println("\nIngrese Dni:");
                        dni=leer.nextLong();
                        if(pedido.existeCliente(dni)){
                            System.out.println("\nLista De Productos Disponobles:\n");
                            Compra compra= new Compra(dni);
                            for(Producto obj:pedido.getListaProductos()){
                                System.out.println(obj.getNombre()+"  Codigo:"+obj.getCodigo()+"  Precio:"+obj.getPrecio());
                            }
                            do{
                                System.out.println("\nSeleccione El Producto ingresando el codigo");
                                codigo=leer.nextInt();
                                System.out.println("\nIngrese Cantidad:");
                                cantidad=leer.nextInt();
                                compra.agregarProducto(codigo, cantidad);
                                System.out.println("\nPrecione 1 para agregar otro producto. 0 para finalizar la compra");
                                op=leer.nextInt();
                            }while(op==1);
                            administradorCompras.agregarUnaCompra(compra);

                        }
                        else {
                            System.out.println("\nCliente no encontrado");
                        }
                        pedido.setAdministradorKiosco(administradorCompras);
                    
                        System.out.println("\n Presione 1 Para agregar Cliente. 0 Para salir");
                        opc=leer.nextInt();
                    }while(opc==1);
                    
                    System.out.println("\nMonto Total De Todos Las Compras: "+pedido.totalMonto());
                    cliente.setDni(dni);
                    System.out.println("\nMonto Total del cliente  "+dni+" :"+pedido.totalMonto(cliente));
  
                    break;
                case 4:
                    Pixel pixel=new Pixel(2,3,56);
                    pixel.transladarseALaDerechaDe(2, 2);
                    System.out.println("\nx: "+pixel.getX()+" " +"\nY: "+pixel.getY()+" "+"\nColor: "+ pixel.getColor());
                    pixel.transladarseALaIzquierdaDe(2, 2);
                    System.out.println("\nx: "+pixel.getX()+" " +"\nY: "+pixel.getY()+" "+"\nColor: "+ pixel.getColor());
                    pixel.transladarseDebajoDe(2, 2);
                    System.out.println("\nx: "+pixel.getX()+" " +"\nY: "+pixel.getY()+" "+"\nColor: "+ pixel.getColor());
                    pixel.transladarseEncimaDe(2, 2);
                    pixel.cambiarColor(210);
                    System.out.println("\nx: "+pixel.getX()+" " +"\nY: "+pixel.getY()+" "+"\nColor: "+ pixel.getColor());
                    break;
                    
                case 5:                    
                    Hamster hamster= new Hamster();
                    hamster.imprimir();
                    Raton raton= new Raton();
                    raton.imprimir();
                    Gerbil gerbil = new Gerbil();
                    gerbil.imprimir();
                    break;
                case 6:
    
                    break;

                case 7:
   
                    
                    break;
                case 8:
                 
                    break;
                case 9:
   
                    
                    break;
                case 10:
          
                    break;
                case 11:
 
                    break;
                    
                case 12:
              
                    break;  
                   
                case 13:
      
                    break;
                          

                default: 
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=13);
    }
    
}

