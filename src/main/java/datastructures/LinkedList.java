package datastructures;

public class LinkedList<E> {
    private Node<E> header;
    private Node<E> lastNode;
    private int size;

    public LinkedList() {
        header = new Node<E>(null);
        lastNode = header;
    }

    public void prepend(E data) {
        Node n = new Node<E>(data);
        if(size == 0) {
            header.setNext(n);
            lastNode = n;
            size++;
        } else {
            Node temp = header.getNext();
            header.setNext(n);
            n.setNext(temp);
            size++;
        }
    }

    public void append(E data) {
        Node n = new Node<E>(data);
        if(size == 0) {
            header.setNext(n);
            lastNode = n;
            size++;
        } else {
            lastNode.setNext(n);
            lastNode = n;
            size++;
        }
    }

    public void removeFirst() {
        if(size != 0) {
            header.setNext(header.getNext().getNext());
            size--;
        }
    }

    public void removeLast() {
        if(size == 1) {
            header.setNext(null);
            lastNode = header;
            size--;
        } else if(size != 0) {
            Node n = header.getNext();

            for (int i = 0; i < size - 2; i++) {
               n = n.getNext();
            }

            lastNode = n;
            n.setNext(null);
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node n = header.getNext();
        String temp = "";
        while(n != null) {
            temp += n.getData();
            n = n.getNext();
        }
        return temp;
    }
}
