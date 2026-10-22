package eva2_5_stack;

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
    private Nodo siguiente;
    private Nodo Previo;
    
    //CONSTRUCTORES
    public Nodo(){
        siguiente = null; //ESTO ES MUY IMPORTANTE,MARCA EL FIN DE LA LISTA
        
        Previo = null;
    }


    
    public Nodo(int valor) {//PONER EL VALOR A GUARADAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        siguiente = null;
        Previo = null;
        
    }
    
    
    //GET Y SETS

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return Previo;
    }

    public void setPrevio(Nodo Previo) {
        this.Previo = Previo;
    }
    
    
}
