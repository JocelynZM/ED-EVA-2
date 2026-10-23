/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author jozza
 */
public class EVA2_11_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("FIBONACCI POSICION 4: "+fibo(4)); 
    }
    
    
    public static int fibo(int posi){
        
       if(posi>1){
           return fibo(posi-2)+ fibo(posi-1);
           
       }else{
           
           return 1;
       }
    }
    
}
