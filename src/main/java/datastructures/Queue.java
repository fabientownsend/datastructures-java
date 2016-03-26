package datastructures;

public class Queue<E> {
    private Node<E> header;
    private Node<E> tail;
    private int count;

    public void enqueue(E data) {
        final Node<E> node = new Node<E>(data);

        if(isEmpty()) {
            header = node;
        } else {
            final Node<E> previousTail = this.tail;
            previousTail.setNext(node);
        }

        tail = node;
        count++;
    }

    public E dequeu() {
        final E data = this.header.getData();
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
