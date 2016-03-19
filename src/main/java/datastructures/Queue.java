package datastructures;

public class Queue<E> {
    private Node<E> header;
    private Node<E> tail;
    private int count;

    public void enqueue(E data) {
        Node<E> newNode  = new Node<E>(data);

        if(isEmpty()) {
            header = newNode;
            tail = header;
        } else {
            Node<E> temp = this.tail;
            tail = newNode;
            temp.next = tail;
        }

        count++;
    }

    public E dequeu() {
        E data = this.header.data;
        this.header = this.header.next;

        if(isEmpty()) {
            this.tail = null;
        }

        count--;
        return data;
    }

    public E peek() {
        return header.data;
    }
    public boolean isEmpty() {
        return this.header == null;
    }

    public int getSize() {
        return count;
    }
}
