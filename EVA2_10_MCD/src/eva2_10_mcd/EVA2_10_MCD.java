/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author jozza
 */
public class EVA2_10_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("MAXIMO COMUN DIVISOR DE 18 Y 12: "+ maxComun(12,18));
       
    }
    
    public static int maxComun(int valor1, int valor2){
        
    int ma = 0;

    if (valor1 > valor2) {
        ma = valor1 % valor2;

        if (ma == 0) {
            return valor2;
        } else {
            return maxComun(valor2, ma);
        }

    } else {
        ma = valor2 % valor1;

        if (ma == 0) {
            return valor1;
        } else {
            return maxComun(valor1, ma);
        }
    }
}
    } 
    

