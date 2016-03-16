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
            header.next = n;
            lastNode = n;
            size++;
        } else {
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }

    public void append(E data) {
        Node n = new Node<E>(data);
        if(size == 0) {
            header.next = n;
            lastNode = n;
            size++;
        } else {
            lastNode.next = n;
            lastNode = n;
            size++;
        }
    }

    public void removeFirst() {
        if(size != 0) {
            header.next = header.next.next;
            size--;
        }
    }

    public void removeLast() {
        if(size == 1) {
            header.next = null;
            lastNode = header;
            size--;
        } else if(size != 0) {
            Node n = header.next;

            for (int i = 0; i < size - 2; i++) {
               n = n.next;
            }

            lastNode = n;
            n.next = null;
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node n = header.next;
        String temp = "";
        while(n != null) {
            temp += n.data;
            n = n.next;
        }
        return temp;
    }
}
