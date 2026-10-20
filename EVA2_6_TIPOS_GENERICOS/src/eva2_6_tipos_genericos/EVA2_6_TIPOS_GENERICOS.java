/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_tipos_genericos;

/**
 *
 * @author jozza
 */
public class EVA2_6_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int --> Integer
        //double --> Double
        
        //EL DATO GENERICO DEBE DE SER UNA CLASE 
        
        Ejemplo<Integer> prueba = new Ejemplo<Integer>();       
        
      //  prueba.
        
    }
    
}

//class ListaDoble()


class Ejemplo <TIPO_DATO>{
    private TIPO_DATO dato ;
    
  

    public Ejemplo(TIPO_DATO dato) {
        this.dato = dato;
    }

    Ejemplo() {
    }

    public TIPO_DATO getDato() {
        return dato;
    }

    public void setDato(TIPO_DATO dato) {
        this.dato = dato;
    }
    
    
    
}
