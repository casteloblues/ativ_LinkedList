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
public class Ativ_LinkedList {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    private Node header;
    private int size;
    private Node trailer;

    public Ativ_LinkedList() {
        this.header = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Node first() {
        return header;
    }

    public void addFirst(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
            novo.setNext(null);
            novo.setPrev(null);
        } else {
            header.setPrev(novo);
            novo.setNext(header);
            header = novo;
            header.setPrev(null);
        }
        size++;
    }

    public void addLast(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
            novo.setNext(null);
            novo.setPrev(null);
        } else {
            novo.setPrev(trailer);
            trailer.setNext(novo);
            trailer = novo;
            novo.setNext(null);
        }
        size++;
    }

    public Node last() {
        return trailer;
    }

    public void mostraLista() {
        Node aux = header;
        while (aux.getNext() != null) {
            System.out.println(aux.getNomeAnimal() + " ");
            aux = aux.getNext();
        }
        System.out.println(aux.getNomeAnimal() + " ");

        System.out.println("FIM DA LISTA ");

    }

    public void remove(Node node) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia, impossÃ­vel remover");
        }

        if (node.getNomeAnimal().equals(header.getNomeAnimal())) {
            header.getNext().setPrev(null);
            header = header.getNext();
            size--;
        }
        if (node.getNomeAnimal().equals(trailer.getNomeAnimal())) {
            trailer.getPrev().setNext(null);
            trailer = trailer.getPrev();
            size--;
        } else {
            Node n;
            for (n = header; !(n.getNomeAnimal().equals(node.getNomeAnimal())); n = n.getNext());
            n.getPrev().setNext(n.getNext());
            n.getNext().setPrev(n.getPrev());
            size--;
        }
    }

    public void addBefore(Node novo, String animal) {
        if (isEmpty()) {
            addFirst(novo);
        } else {
            Node n;
            for (n = header; !(n.getNomeAnimal().equals(animal)); n = n.getNext());
            novo.setPrev(n.getPrev());
            n.getPrev().setNext(novo);
            n.setPrev(novo);
            novo.setNext(n);
            size++;
        }

    }

    public void addAfter(Node novo, String animal) {
        if (isEmpty()) {
            addFirst(novo);
        } else {

            Node n;
            for (n = header; !(n.getNomeAnimal().equals(animal)); n = n.getNext());
            novo.setNext(n.getNext());
            n.getNext().setPrev(novo);
            novo.setPrev(n);
            n.setNext(novo);
            size++;
        }
    }

    public void showCentral() {
        Node aux = header;
        int i = 0;
        int c = (size / 2);
        while (i != c) {
            aux = aux.getNext();
            i++;
        }
        System.out.println(aux.getNomeAnimal() + "\n");
    }

    public void removeCentral() throws Exception {
        Node n = header;
        int i = 0;
        int c = (size / 2);
        if (isEmpty()) {
            throw new Exception("Lista vazia, impossivel remover");
        }

        while (i != c) {
            n = n.getNext();
            i++;
        }
        n.getPrev().setNext(n.getNext());
        n.getNext().setPrev(n.getPrev());
        size--;
    }
    
    public void elem_num (Node n) throws Exception {
        int num_vezes = 0;
        Node aux = header;
        
        if (isEmpty()) {
            throw new Exception("Lista vazia");
        }
        
        while (aux.getNext() != null) {
            if (aux.getNomeAnimal().equals(n.getNomeAnimal())) {
                num_vezes++;
            }
            aux = aux.getNext();
        }
        System.out.println(num_vezes);
    }
}
