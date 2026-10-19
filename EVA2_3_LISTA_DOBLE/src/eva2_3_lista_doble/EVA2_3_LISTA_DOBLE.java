/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author jozza
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ListaDoble lista = new ListaDoble();

        // AGREGAR
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);

        System.out.println("IMPRIMIR LISTA");
        lista.imprmir();

        System.out.println("LISTA INVERSA");
        lista.imprimirInverso();

        // INSERTAR
        System.out.println("INSERTAR 250 EN POSICION 2");
        lista.insertarEn(250, 2);
        lista.imprmir();

        // LONGITUD
        System.out.println("LONGITUD DE LA LISTA");
        System.out.println(lista.longitud());

        // LISTA VACIA
        System.out.println("LA LISTA ESTA VACIA?");
        System.out.println(lista.listaVacia());

        // VALOR EN UNA POSICION
        System.out.println("VALOR EN LA POSICION 2");
        System.out.println(lista.valorEn(2));

        // ENCONTRAR UN VALOR
        System.out.println("POSICION DEL VALOR 400");
        System.out.println(lista.encontrar(400));

        // BORRAR EN UNA POSICION
        System.out.println("BORRAR EL NODO EN LA POSICION 1");
        lista.borrarEn(1);
        lista.imprmir();

        // IMPRIMIR INVERSO DESPUES DE BORRAR
        System.out.println("LISTA INVERSA DESPUES DE BORRAR");
        lista.imprimirInverso();

        // IMPRIMIR AL REVES
        System.out.println("IMPRIMIR AL REVES");
        lista.imprimirInverso();

        // VACIAR LISTA
        System.out.println("VACIAR LISTA");
        lista.vaciarLista();

        // COMPROBAR SI QUEDO VACIA
       // System.out.println("COMPROBAR QUE LA LISTA ESTA VACIA");
        //System.out.println(lista.listaVacia());

        // COMPROBAR LONGITUD FINAL
        System.out.println("LONGITUD DESPUES DE VACIAR");
        System.out.println(lista.longitud());

        // COMPROBAR QUE NO HAY NODOS
        System.out.println("LISTA DESPUES DE VACIAR");
        lista.imprmir();
    }


    
    
}
