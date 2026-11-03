/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author jozza
 */
public class arbolBinario {
    
    private Nodo root;

    public arbolBinario() {
        this.root = null;
    }
    
    public void agregar(int valor){
        //SI ESTA VACIO EL ARBOL
        if(root==null ){//ARBOL VACIO
            
            root = new Nodo(valor);
            
        }else{
            agregarRecu(root, valor);
            
        }
    }
    
    //METODO RECURSIVO PARA AGREGAR UN NODO
    private void agregarRecu(Nodo actual, int valor){
        
        if(valor >actual.getValor()){//ALA DERECHA
            
            if(actual.getDerecha()!= null){//OCUPADO
                
                agregarRecu(actual.getDerecha(),valor);
                
            }else{//DISPONIBLE
                
                actual.setDerecha(new Nodo(valor));
                
            }
            
        }else if(valor<actual.getValor()){//ALA IZQUIERDA
 
            if(actual.getIzquierda()!= null){//OCUPADO
                
                agregarRecu(actual.getIzquierda(),valor);
                
            }else{//DISPONIBLE
                
                actual.setIzquierda(new Nodo(valor));
                
            }
            //else ---> EL VALOR ESTA REPETIDO
        
        }
                
                
            }
        
        
    
    
    public void preOrder(){
        
        preOrdenRecu(root);
        System.out.println("");
        
    }
    
    
    public void inOrder(){
        
        inOrderRecu(root);
        System.out.println("");
        
    }
    
    public void posOrder(){
        
        posOrderRecu(root);
        System.out.println("");
        
    }
    
    // PREORDEN: RECORRE PRIMERO LA RAÍZ, DESPUÉS EL LADO IZQUIERDO Y AL FINAL EL LADO DERECHO
    
     private void preOrdenRecu(Nodo actual){
         
         if(actual != null){
         System.out.print(actual.getValor()+ "-");
    preOrdenRecu(actual.getIzquierda());//LEER EL LADO IZQ 
    preOrdenRecu(actual.getDerecha());//LEER EL LADO DERECHO
    }
     }


//IN-ORDER
// INORDEN: RECORRE HACIA LA IZQUIERDA HASTA LLEGAR A NULL,
// IMPRIME LOS NODOS AL REGRESAR HACIA LA RAÍZ
// Y DESPUÉS RECORRE EL LADO DERECHO.


 private void inOrderRecu(Nodo actual){
         
         if(actual != null){
             inOrderRecu(actual.getIzquierda());//LEER EL LADO IZQ 
              System.out.print(actual.getValor()+ "-");   
    inOrderRecu(actual.getDerecha());//LEER EL LADO DERECH
    
    
    }
             
         
     }




//POS-ORDEN
//PRIMERO RECORRE LA IZQUIERDA, DESPUES LA DERECHA Y AL FINAL LA RAIZ

private void posOrderRecu(Nodo actual){
         
         if(actual != null){
             
             posOrderRecu(actual.getIzquierda());//LEER EL LADO IZQ 
        
    posOrderRecu(actual.getDerecha());//LEER EL LADO DERECH
    System.out.print(actual.getValor()+ "-");   
    }
             
         
     }

}