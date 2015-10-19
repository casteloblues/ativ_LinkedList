/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ_linkedlist;

/**
 *
 * @author 31240550
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ativ_LinkedList lista = new Ativ_LinkedList();

        try {

            lista.addFirst(new Node("Boi"));
            lista.addFirst(new Node("Pato"));
            lista.addLast(new Node("Gato"));
            lista.addFirst(new Node("Peixe"));

            lista.addAfter(new Node("Crocodilo"), "Boi");

            lista.addBefore(new Node("Girafa"), "Pato");

            lista.remove(new Node("Gato"));

            System.out.println("Tamanho da Lista: " + lista.size());
            System.out.println("Primeiro Animal: " + lista.first().getNomeAnimal());
            System.out.println("Ultimo Animal: " + lista.last().getNomeAnimal());
            lista.mostraLista();
            
            lista.elem_num(new Node("Boi"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
