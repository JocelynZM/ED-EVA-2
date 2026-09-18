/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_referencias;

/**
 *
 * @author jozza
 */
public class EVA_2_1_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRIMER
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100; 
        System.out.println("inicio = " + inicio);
        System.out.println("inicio.valor = " + inicio.valor);
        System.out.println("inicio.otro = " + inicio.otro);
        
        //CREAR UNA LISTA:
        //DOS
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;
        //TRES
        //SE CREA OTRO
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor=300;
        //CUATRO
        //SE CREA OTRO
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor= 400;
        

        //EL PRIMERO ES INCIIO
        
        Ejemplo sig = inicio;
        
        
        while(sig != null){
            System.out.println("["+ sig.valor+"]");
            
            //se mueve la direccion de siguiente de inicio a otro
            sig = sig.otro;
            
        }


    }
    
}
//CLASE NODO
class Ejemplo{
    int valor;
     Ejemplo otro;
}
