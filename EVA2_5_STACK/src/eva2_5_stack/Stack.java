/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author jozza
 */

    
    public class Stack {

    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public Stack() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    // O(N)
    public void imprmir() {
        Nodo temp = inicio;

        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }

    // O(N)
    public void imprimirInverso() {
        Nodo temp = fin;

        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
    }

    // O(1)
    public int longitud() {
        return tama;
    }

    // O(1)
    public boolean listaVacia() {
        return inicio == null;
    }

    // O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    // O(1): 
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {// AGREGAR AL INCICIO CUANDO LA LISTA ESTA VACIA
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }

        tama++;
    }

    // O(N)
    public int valorEn(int posicion) {
if (posicion < 0 || posicion >= tama) {
    throw new RuntimeException("LA POSICION " + posicion + " NO ES VALIDA");
    }

    Nodo temp = inicio;

    for (int i = 0; i < posicion; i++) {
        temp = temp.getSiguiente();
    }

    return temp.getValor();
}
    // O(N): 
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int posi = 0;

        while (temp != null) {

            if (temp.getValor() == valor) {
                return posi;
            }

            temp = temp.getSiguiente();
            posi++;
        }

        throw new RuntimeException( "EL " + valor + " NO SE ENCUENTRA EN LA LISTA");
    }

    // O(N)
    public Nodo insertarEn(int valor, int posicion) {

        if (posicion < 0 || posicion > tama) {
            throw new RuntimeException("LA POSICION  " + posicion + " NO ES VALIDA");
        }

        Nodo nuevo = new Nodo(valor);

//inicio
        if (posicion == 0) {

            nuevo.setSiguiente(inicio);

            if (inicio != null) {
                inicio.setPrevio(nuevo);
            } else {
                fin = nuevo;
            }

            inicio = nuevo;
        } else {

            // Buscar el nodo anterior
            Nodo temp = inicio;

            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }

            // Conectar el nuevo nodo con el siguiente
            nuevo.setSiguiente(temp.getSiguiente());
            nuevo.setPrevio(temp);

            // Si hay un nodo después, actualizar su previo
            if (temp.getSiguiente() != null) {
                temp.getSiguiente().setPrevio(nuevo);
            } else {
                fin = nuevo;
            }

            // Conectar el nodo anterior con el nuevo
            temp.setSiguiente(nuevo);
        }

        tama++;
        return nuevo;
    }

    // O(N)
    public Nodo borrarEn(int posicion) {

        if (posicion < 0 || posicion >= tama) {
            throw new RuntimeException("LA POSICION " + posicion + " NO ES VALIDA");
        }

        Nodo eliminado;

        // Borrar el primer nodo
        if (posicion == 0) {

            //temp
            eliminado = inicio;
            inicio = inicio.getSiguiente();

            if (inicio != null) {
                inicio.setPrevio(null);
            } else {
                fin = null;
            }

        } else {

            // Buscar el nodo que se eliminara
            eliminado = inicio;

            for (int i = 0; i < posicion; i++) {
                eliminado = eliminado.getSiguiente();
            }

            Nodo anterior = eliminado.getPrevio();
            Nodo siguiente = eliminado.getSiguiente();

            // Reconectar los nodos 
            anterior.setSiguiente(siguiente);

            if (siguiente != null) {
                siguiente.setPrevio(anterior);
            } else {
                fin = anterior;
            }
        }

        
        tama--;
        return eliminado;
    }

  
    
    //QUEUE --> FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR)
    //PUSH= AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push(int valor){
    
        agregar(valor);
        
        
        
    }
    //PEEK= LEE EL VALOR DIRECTAMNETE ACCESIBLE, SIN BORRARLO
    public int peek(){
        return valorEn(3);
        
    }
    //POP= LEE EL VALOR DIRECTAMENTE ACCESIBLE, Y DESPUES LO BORRA
    //STACK ULTIMO EN LA FILA PRIMERO EN SALIR
    public int pop(){
        
        int tam = longitud();
        
       
       int e = borrarEn(tam-1).getValor();
       
       return tam;

        
        
        
    }
    
}
    

