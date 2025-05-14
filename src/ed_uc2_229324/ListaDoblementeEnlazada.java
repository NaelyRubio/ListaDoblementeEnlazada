/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_229324;



/**
 *
 * @author naely
 */
public class ListaDoblementeEnlazada {

    private NodoDoble inicio;
    private NodoDoble fin;
    private int tam;
  
    public ListaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista esta vacia
     * @return  true si esta vacia, false en caso contrario
     */
    public boolean isEmpty() {
        return inicio == null;
    }

    /**
     * Devuelve el numero de elementos en la lista
     * @return numero entero mayor o igual a 0
     */
    public int size() {
        return tam;
    }

    /**
     * Agregar un elemento al inicio de la lista
     * @param dato numero entero que se desea agregar
     * @return true si el elemnto fue agregado correctamente
     */
    public boolean addFirst(int dato) {
        if (String.valueOf(dato).length() > 50) {
            return false;
        }

        NodoDoble nuevo = new NodoDoble(dato);
        if (isEmpty()) {
            inicio = fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
        tam++;
        return true;
    }
    
    
    /**
     * Agrega un elemento al final de la lista
     * @param dato numero entero que se desea agregar
     * @return true si el elemento fue agregado correctamente
     */
     public boolean addLast(int dato) {
        if (String.valueOf(dato).length() > 50) return false;

        NodoDoble nuevo = new NodoDoble(dato);
        if (isEmpty()) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
        tam++;
        return true;
    }

     /**
      * Elimina el primero elemento de la lista
      * @return true si se elimino correctamtente 
      */
     public boolean removeFirst() {
        if (isEmpty()) return false;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        tam--;
        return true;
    }
     
     /**
      * Elimina el ultimo elemento de la lista
      * @return true si se elimino correctamente
      */
     public boolean removeLast() {
        if (isEmpty()) return false;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        tam--;
        return true;
    }
     
     /**
      * Verifica si un elemento existe en la lista
      * @param dato numero entero a buscar
      * @return true si existe false si no
      */
      public boolean contains(int dato) {
        NodoDoble actual = inicio;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

      /**
       * Obtiene el elemento en la posicion indicada
       * @param index posicion del elemento a recuperar
       * @return valor entero del nodo 
       */
       public int getElement(int index) {
        if (index < 0 || index >= tam) return Integer.MIN_VALUE;

        NodoDoble actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
       
       
       /**
        * Elimina todos los elementos de la lista
        */
       public void clear() {
        inicio = null;
        fin = null;
        tam = 0;
    }
       
       /**
        * Devuelve una representacion de los elementos en forma de cadea
        * @return cadena con los datos de la lista enlazada
        */
        public String toString() {
        if (isEmpty()) return "Lista vacía";

        StringBuilder sb = new StringBuilder();
        NodoDoble actual = inicio;
        while (actual != null) {
            sb.append(actual.dato).append(" <-> ");
            actual = actual.siguiente;
        }
        return sb.append("null").toString();
    }

}
