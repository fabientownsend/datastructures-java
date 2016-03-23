package datastructures;

public class Queue<T> {
    private Node<T> header;
    private Node<T> tail;
    private int count;

    public void enqueue(T data) {
        Node<T> newNode  = new Node<T>(data);

        if(isEmpty()) {
            header = newNode;
            tail = header;
        } else {
            Node<T> temp = this.tail;
            tail = newNode;
            temp.setNext(tail);
        }

        count++;
    }

    public T dequeu() {
        T data = this.header.getData();
        this.header = this.header.getNext();

        if(isEmpty()) {
            this.tail = null;
        }

        count--;
        return data;
    }

    public T peek() {
        return header.getData();
    }

    public boolean isEmpty() {
        return this.header == null;
    }

    public int getSize() {
        return count;
    }
}
