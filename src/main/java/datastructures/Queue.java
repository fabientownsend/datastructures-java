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
            temp.setNext(tail);
        }

        count++;
    }

    public E dequeu() {
        E data = this.header.getData();
        this.header = this.header.getNext();

        if(isEmpty()) {
            this.tail = null;
        }

        count--;
        return data;
    }

    public E peek() {
        return header.getData();
    }

    public boolean isEmpty() {
        return this.header == null;
    }

    public int getSize() {
        return count;
    }
}
