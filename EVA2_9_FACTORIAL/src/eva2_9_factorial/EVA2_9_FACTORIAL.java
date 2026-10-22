/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_factorial;

/**
 *
 * @author jozza
 */
public class EVA2_9_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("FACTORIAL DE 5:"+factorialCiclo(5));
           System.out.println("FACTORIAL DE 5:"+factorialRecu(5));
    }
    
 
    
    public static int factorialCiclo(int valor){
          int fac=1;
        for(int i = 1 ; i<=valor; i++){
            
          fac*=i;
            
        
          
        }
        
        return fac;
    }
    
    public static int factorialRecu(int valor){
        if(valor==0){
            return 1;
        }else{
            return valor*factorialRecu(valor-1);
        }
        
        
    }
        
        
        
    }

