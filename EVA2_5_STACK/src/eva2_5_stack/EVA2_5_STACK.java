/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author jozza
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Stack Q = new Stack();
        //PUSH= AGREGA UN VALOR AL FINAL DE LA LISTA
        Q.push(100);
        Q.push(200);
        Q.push(300);
        Q.push(400);
        
        Q.imprmir();
        
        System.out.println("VALOR EN LA POSICION 3: "+ Q.peek());
        
        //STACK
        System.out.println("ELIMINAR ULTIMA POSICION...");
        Q.pop();
        
        Q.imprmir();
    }
    
}
