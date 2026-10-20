/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author jozza
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue Q = new MyQueue();
        //PUSH= AGREGA UN VALOR AL FINAL DE LA LISTA
        Q.push(100);
        Q.push(200);
        Q.push(300);
        Q.push(400);
        
        Q.imprmir();
        
        System.out.println("VALOR EN LA POSICION 3: "+ Q.peek());
        
        System.out.println("ELIMINAR PRIMERA POSICION...");
        Q.pop();
        
        Q.imprmir();
        
        
    }
    
}
