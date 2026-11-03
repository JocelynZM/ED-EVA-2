package eva2_12_arbol_binario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jozza
 */
public class Nodo {
    //DOS ATRIBUTOS
    
    private int valor;
    private Nodo Derecha;
    private Nodo Izquierda;
    
    //CONSTRUCTORES
    public Nodo(){
        Derecha = null; //ESTO ES MUY IMPORTANTE,MARCA EL FIN DE LA LISTA
        
        Izquierda = null;
    }


    
    public Nodo(int valor) {//PONER EL VALOR A GUARADAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        Derecha = null;
        Izquierda= null;
        
    }
    
    
    //GET Y SETS

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo Derecha) {
        this.Derecha = Derecha;
    }

    public Nodo getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo Izquierda) {
        this.Izquierda = Izquierda;
    }
    
    
}
