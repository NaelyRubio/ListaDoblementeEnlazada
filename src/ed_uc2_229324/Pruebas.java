/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc2_229324;

/**
 *
 * @author naely
 */
public class Pruebas {


    public static void main(String[] args) {
        
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        lista.addFirst(5);
        lista.addLast(10);
        lista.addFirst(3);
        lista.removeLast();
        lista.addLast(20);
        System.out.println("Contiene 10? " + lista.contains(10));
        System.out.println("Elemento en posición 1: " + lista.getElement(1));
        System.out.println("Tamaño actual: " + lista.size());
        System.out.println("Lista: " + lista);
        lista.clear();
        System.out.println("Después de clear: " + lista);
    }
}
  