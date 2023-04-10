/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ortiz
 */
public class Conjunto {
    int[] conjuntoUno;
    
    public Conjunto (int[]valor){
        conjuntoUno=valor;
    }
    public int[] interseccion (int[]conjuntoDos){
        int []conjuntoTres= new int[conjuntoUno.length];
        int i,j=0;
        for(i=0;i<conjuntoUno.length;i++){
            int a=0, k=0;
           
            do{
                if(conjuntoUno[i]==conjuntoDos[k]){
                    conjuntoTres[j]=conjuntoUno[i];
                    j++;
                    a=1;
                    
                }
                k++;  
            }while(k<conjuntoDos.length & a!=1);
                 
      }
        return conjuntoTres;
    }
    public int[] interseccionwithList (int[]conjuntoDos){
        List<Integer> conjuntoCuatro = new ArrayList<>();
        int i;
        for(i=0;i<conjuntoUno.length;i++){
            int k=0;
            boolean encontrado = false;
            do{
                if(conjuntoUno[i]==conjuntoDos[k]){
                    encontrado = true;
                    conjuntoCuatro.add(conjuntoUno[i]);
                }
                k++;
            }while(k<conjuntoDos.length & !encontrado);
      }
      return conjuntoCuatro.stream()
                             .mapToInt(Integer::intValue)
                             .toArray();
    }
}
