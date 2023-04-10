/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import Practico1.Ano;
import Practico1.Banco;
import Practico1.BancoWithArray;
import Practico1.Cheque;
import Practico1.Cliente;
import Practico1.Conjunto;
import Practico1.EsMayor;
import Practico1.Persona;
import Practico1.ProgramaFibonacci;
import Practico1.Pulgadas;
import Practico1.Saluda;
import Practico1.Temperatura;
import Practico1.Triangulo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ortiz
 */
public class MenuPractico1 {
       
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
            System.out.println("13--Ejercicio 14.1\n");
            System.out.println("14--Volver \n");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println("Ejecutando ejercicio 1");
                    break;
                case 2:
                    Saluda saludar= new Saluda();
                    saludar.saludar();
                    break;
                case 3:
                    EsMayor esMayor= new EsMayor();
                    if (esMayor.esMayor(5)){
                        System.out.println("True");
                    }else{
                        System.out.println("Falso");
                    }
                    break;
                case 4:
                    double valorPulgadas, valorMetros;
                    System.out.println("Ingrese Un Valor en Pulgadas a "
                                                +"convertir en metros\n");
                    Pulgadas pulgadas= new Pulgadas(5D);
                    valorPulgadas=leer.nextDouble();
                    pulgadas.setValor(valorPulgadas);
                    valorMetros= pulgadas.toMeters();
                    System.out.println("El valor en metro de"+ valorPulgadas+" es:"+ valorMetros); 
                    break;
                    
                case 5:                    
                    Cheque cheque = new Cheque("1234567895");
                    if(cheque.esFalso()){
                        System.out.println("El cheque es falso"); 
                    }
                    else{
                        System.out.println("El cheque es valido"); 
                    }
                    
                    break;
                case 6:
                    int[] conjuntoUno={1,2,43,7,8,9,5,12,56,3};
                    int[] conjuntoDos= new int[10];
                    int[] conjuntoTres= new int[10];
                    int i;
                    Conjunto conjunto= new Conjunto(conjuntoUno);
                    for(i=0;i<conjuntoDos.length;i++){
                        System.out.printf("Introduzca numero %d: ", i+1);
                        conjuntoDos[i] = leer.nextInt();
                    }
                    conjuntoTres=conjunto.interseccion(conjuntoDos);
                    for(int j: conjuntoTres){
                        System.out.print(j);
                    }
                    break;

                case 7:
                    int anos;
                    Persona cantidadAnos= new Persona();
                    System.out.printf("\nIntroduzca su edad  ");
                    anos=leer.nextInt();
                    cantidadAnos.setCantidadAnos(anos);
                    System.out.printf("Los segundos vividos son: %d: \n", cantidadAnos.segundosVividos());
                    System.out.printf("Los minutos vividos son: %d: \n", cantidadAnos.minutosVividos());
                    System.out.printf("Las horas vividos son: %d: \n", cantidadAnos.horasVividos());
                    
                    break;
                case 8:
                    Temperatura temperatura = new Temperatura();
                    float tempFahrenheit;
                    System.out.println("Ingrese la temperatura en Fahrenheit a convertir en celsius  ");
                    tempFahrenheit=leer.nextFloat();
                    temperatura.setTemperatura(tempFahrenheit);
                    System.out.printf("La temperatura ingresa en grados Celsius es: %f\n", temperatura.toCelsius());
                    break;
                case 9:
                    double catOpuesto, catAdyacente;
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Ingrese el valor del cateto opuesto\n");
                    catOpuesto=leer.nextDouble();
                    System.out.println("Ingrese el valor del cateto adyacente\n");
                    catAdyacente=leer.nextDouble();
                    triangulo.triangulo(catOpuesto, catAdyacente);
                    triangulo.toHipotenusa();
                    
                    break;
                case 10:
                    Ano ano = new Ano();
                    int numeroAno, numeroMes;
                    System.out.println("Ingrese el numero del año\n");
                    numeroAno = leer.nextInt();
                    ano.setNumeroAnos(numeroAno);
                    if(ano.esBisiesto()){
                        System.out.println("El año es bisiesto\n");
                    }
                    else{
                        System.out.println("El año no es bisiesto\n");
                    }
                    System.out.println("Ingrese el numero del mes\n");
                    numeroMes = leer.nextInt();
                    ano.diasDelMes(numeroMes);
                    break;
                case 11:
                    int cantIteraciones;
                    System.out.println("Ingrese el numero de iteraciones\n");
                    cantIteraciones=leer.nextInt();
                    ProgramaFibonacci fibonacci = new ProgramaFibonacci(cantIteraciones);
                    fibonacci.imprimirFor();
                    System.out.println("\nIngrese el numero de iteraciones\n");
                    cantIteraciones=leer.nextInt();
                    fibonacci.setProgramaFibonacci(cantIteraciones);
                    fibonacci.imprimirFooBarBaz();
                            
                    break;
                    
                case 12:
                    String nombreBanco;
                    System.out.println("\nIngrese nombre del banco ");
                    nombreBanco=leer.next();
                    BancoWithArray banco = new BancoWithArray(nombreBanco);
                    Integer continuar;
                    do{
                        String nombreCliente;
                        int numeroDocumento;
                        System.out.println("\nIngrese Nombre del Cliente:");
                        nombreCliente=leer.next();
                        System.out.println("\nIngrese numero de documento:");
                        numeroDocumento=leer.nextInt();
                        Cliente clienteBanco = new Cliente (nombreCliente, numeroDocumento);
                        banco.insertarCliente(clienteBanco);
                        //bancoIcbc.insertarCliente(cliente1);
                        System.out.println("\nPara continuar presione 1");
                        continuar = leer.nextInt();
                    }while(continuar.equals(1));
                    System.out.println("\nEl banco tiene " + banco.getNumeroClientes() + " clientes.\n");
                    
                    for( i=0; i<banco.getNumeroClientes();i++){
                        System.out.println(banco.getDatosClientes()[i].getNombre()+"  "+ banco.getDatosClientes()[i].getDni());
                    }
                    break;  
                   
                case 13:
                    System.out.println("\nIngrese nombre del banco ");
                    nombreBanco=leer.next();
                    Banco banco1 = new Banco(nombreBanco);
                    do{
                        String nombreCliente;
                        int numeroDocumento;
                
                        System.out.println("\nIngrese Nombre del Cliente:");
                        nombreCliente=leer.next();
                        System.out.println("\nIngrese numero de documento:");
                        numeroDocumento=leer.nextInt();
                        Cliente clienteBanco = new Cliente (nombreCliente, numeroDocumento);
                        banco1.insertarCliente(clienteBanco);
                        //bancoIcbc.insertarCliente(cliente1);
                        System.out.println("\nPara continuar presione 1");
                        continuar = leer.nextInt();
                    }while(continuar.equals(1));
                    System.out.println("\nEl banco tiene " + banco1.getNumeroClientes() + " clientes.\n");
                    ArrayList<Cliente> clientes;
                    clientes=banco1.getDatosClientes();
                    for( i=0; i<clientes.size();i++){
                        
                        System.out.println(clientes.get(i).getNombre()+ " "+ clientes.get(i).getDni());
                    }
                    break;
                          
                case 14:
                    //System.out.println("Adios");
                    break;
                default: 
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=14);
    }
    
}


