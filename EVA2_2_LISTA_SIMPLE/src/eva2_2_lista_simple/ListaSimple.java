
package eva2_2_lista_simple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jozza
 */
public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    private int tam;
    
    
    public ListaSimple(){
        
        inicio=null;//AL CREAR LA LISTA, SE CREA 
        fin = null;//SIRVE PARA NO RECORRER TODO
        tam =0;
    }
    
   //SIEMPRE SE AGRAGA AL FINAL DE LA LISTA 
    // VERSION 1: O(N) SE AGREGA AL FINAL  SE RECORREN TODOS
    // VERSION MEJORADA: O(1) CON NODO FIN, YA NOSE RECORREN TODOS
    
    
    
 //O(1)
public void agregar(int valor){
    Nodo nuevo = new Nodo(valor); // CREO EL NODO PARA EL VALOR A INSERTAR
    
    if(inicio == null){ //LISTA VACIA? VERDADERO
        inicio = nuevo; //NUEVO ES EL PRIMER NODO DE LA LISTA
        
        fin = nuevo;

    }else{//LISTA CON NODOS
        //MOVERNOS AL FINAL
       // Nodo temp = inicio;
        Nodo back = fin;
        
       // while(temp.getSiguiente() != null){
          //  temp = temp.getSiguiente();
            
                 
            
     //   }
        //  temp.setSiguiente(nuevo);//CONECTO NUEVO AL FINAL DE LA LISTA
         fin.setSiguiente(nuevo);
         fin = nuevo;
    }
 //LONGITUD2   
 tam++;   
    
    
}

//O(N) 
public void imprmir(){
                 Nodo temp = inicio;

        while(temp != null){
            
            System.out.println("["+temp.getValor()+"]");
            
            //se mueve la direccion de siguiente de temp a siguiente
            temp = temp.getSiguiente();
            
        }
    
    
}


// O(N)
public int longitud(){
    
          Nodo temp = inicio;
         int longitud=0;
         
        while(temp != null){//MIENTRAS TEMP NO APUNTE A NULL PASA DE NODO EN NODO Y ACUMLA EL ESPACIO EN LONGITUD DE CADA UNO
    
            temp = temp.getSiguiente();
               
                longitud = longitud+1;
  
        }
    return longitud;
}
//O(1)
public int longitud2() {
  return tam;

    
}


//O(1)
public boolean listaVacia(){
    
    if(inicio == null){
        
        return true;
    }else{
        
       return false;
       
       
    
    }
    
 
        
}
//O(1)
public void vaciarLista(){
    
    inicio = null;
    fin = null;
    tam = 0;
    
}

//VALIDAR: POSICION TENGA UN VALOR VALIDO 
                                //throws
//O(n)
public int valorEn(int posicion) {
    //EXCEPCION
    //VALIDAR POSICION
    //MANERA 1
    /*
    if(posicion < 0){
        throw new IllegalArgumentException("LA POSICION NO ES VALIDA");
    }

    Nodo temp = inicio;

    for(int i = 0; i < posicion; i++){

        if(temp == null){
            throw new IllegalArgumentException("LA POSICION NO SE ENCUENTRA EN LA LISTA");
        }

        temp = temp.getSiguiente();
    }

    if(temp == null){
        throw new IllegalArgumentException("LA POSICION NO SE ENCUENTRA EN LA LISTA");
    }

    return temp.getValor();
*/
    
    //MANERA 2
    
    //O(N)
    int tam = longitud();
    
    if ( posicion >= 0 && posicion < tam){
        
        
                    Nodo temp = inicio;

        for(int i =0; i< posicion; i++){
            
            temp = temp.getSiguiente(); // PASA A CADA NODO
        }
        return temp.getValor();//RETORNA EL VALOR DE LA POSICION QUE SE ASIGNO
    }else{
        
        throw new RuntimeException("LA POSICION " + posicion + "NO ES VALIDA");
        
    }
}
 


//REGRESA LA PRIMER APARSCION DEL VALOR EN LA LISTA
//REGRESA LA POSICION

//O(n)
public int encontrar(int valor){

    Nodo temp = inicio;
    
 int posi=0;
 
        for(int i =0; i< longitud(); i++){
            
            

            if ( temp.getValor()==valor){//RETORNA EL VALOR CUANDO SEA EL MISMO QUE SE PUSO EN EL PARAMETRO
                return posi;
            }
            
            //RECORRE LA LISTA Y GUARDA LAS POSICONES EN POSI
            temp = temp.getSiguiente();
            posi = posi +1;
        }
        
          throw new RuntimeException("EL VALOR " + valor + " NO SE ENCUENTRA EN LA LISTA");
        
}

//O(n)
public Nodo insertarEn(int valor, int posicion) {

    if (posicion < 0 || posicion > tam) {
        throw new RuntimeException(
            "LA POSICION " + posicion + " NO ES VALIDA"
        );
    }

    Nodo nuevo = new Nodo(valor);

  
    if (posicion == 0) { //SI SE QUIERE AGREGAR AL INICIO
        nuevo.setSiguiente(inicio);
        inicio = nuevo;

        if (fin == null) {
            fin = nuevo;
        }
//LONGITUD2
        tam++;
        return nuevo;
    }

   //BUSQUEDA DEL NODO ANTERIOR
    Nodo temp = inicio;

    for (int i = 0; i < posicion - 1; i++) {
        temp = temp.getSiguiente();
    }

    //CONECTA EL NUEVO NODO CON LA POSICION SIGUIENTE
   
    nuevo.setSiguiente(temp.getSiguiente());//CONCETA EL NUEVO NODO CON EL QUE YA EXISTIA
    
    //CONECTA EL NODO ANTERIOR DEL NUEVO CON EL NODO NUEVO
    temp.setSiguiente(nuevo);

   
    if (nuevo.getSiguiente() == null) {//AGREGAR AL FINAL
        fin = nuevo;
    }
//LONGITUD2
    tam++;
    return nuevo;
}

//O(n)
public Nodo borrarEn(int posicion) {

    if (posicion < 0 || posicion >= tam) {
        throw new RuntimeException(
            "LA POSICION " + posicion + " NO ES VALIDA PARA ELIMINAR"
        );
    }

    Nodo eliminado;

    // Borrar el primer nodo
    if (posicion == 0) {
        eliminado = inicio;
        inicio = inicio.getSiguiente();

        if (inicio == null) {
            fin = null;
        }
//LONGITUD2
        tam--;
        return eliminado;
    }

    
    Nodo temp = inicio;

    for (int i = 0; i < posicion - 1; i++) {
        temp = temp.getSiguiente();
    }


    eliminado = temp.getSiguiente();

   
    temp.setSiguiente(eliminado.getSiguiente());

    if (eliminado == fin) {
        fin = temp;
    }

    //LONGITUD2
    tam--;
    return eliminado;
}

 
    //O(N)^2 
public void imprmirAlrevez(){
   

    int tam = longitud();
//QUE POSICION ES LA ULTIMA
    for (int i = tam - 1; i >= 0; i--) {

        Nodo temp = inicio;
//RECORRE HASTA ESA POSICION
        for (int j = 0; j < i; j++) {
            temp = temp.getSiguiente();
        }

        System.out.println("[" + temp.getValor() + "]");
    }
 
           
                     
            
        }
    
    
}

