/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author jozza
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaSimple lista = new ListaSimple();
    /*   int[] arreglo = new int[1000000];
       
       long ini, fin, tiempo;
       
       ini = System.nanoTime(); //TOMAMOS LA "HORA" ENTES DE EMPEZAR
               
       for(int i = 0; i < arreglo.length; i++){
           
           arreglo[i] = (int)(Math.random()*100);
       }
        
        
       fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIZAR EL PROCESO
       
       tiempo = fin - ini;
       
        System.out.println("TIEMPO ARREGLO: "+tiempo);
        
    
    
     for(int i = 0; i < 1000000; i++){
           
           lista.agregar((int)(Math.random()*100));
       }
        
       fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIZAR EL PROCESO
       
       tiempo = fin - ini;
       
        System.out.println("TIEMPO ARREGLO: "+tiempo);
    */

        System.out.println("Tamaño de la lista: "+ lista.longitud());
lista.agregar(100);
lista.agregar(200);
lista.agregar(300);
lista.agregar(400);
lista.agregar(500);

lista.imprmir();

 System.out.println("Tamaño de la lista: "+ lista.longitud());
    System.out.println("Longitud O(1): " + lista.longitud2());

 
 //ENCONTRAR VALOR EN..
 System.out.println("VALOR DE POSICION 2: " + lista.valorEn(2));
 
 //ENCONTRAR POSCION DE 
 
  System.out.println("CANTIDAD 500 ESTA EN LA POSICION: " + lista.encontrar(500));
  
  
  System.out.println("VALOR 250 EN LA POSICION 2: " + lista.insertarEn(250, 2).getValor());

  lista.imprmir();

   System.out.println("BORRAR EN POSICION 2: " + lista.borrarEn(2).getValor());
   
   lista.imprmir();

   System.out.println("IMPRIMIR AL REVEZ");
   lista.imprmirAlrevez();
   
   //IMRPIMIR LONGITUD O(1)

  
  
 lista.vaciarLista();

lista.imprmir();
  System.out.println("Tamaño de la lista: "+ lista.longitud());
  

  
  

  
    }
    

    
}
