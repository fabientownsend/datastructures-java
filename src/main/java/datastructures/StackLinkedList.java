package datastructures;

public class StackLinkedList<E> {
    private Node<E> header;
    private int size;

    public void push(E data) {
        if(header == null) {
            header = new Node<E>(data);
        } else {
            Node<E> temp = header;
            header = new Node<E>(data);
            header.next = temp;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public E pop() {
        E data = header.data;
        header = header.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return header == null;
    }

    public E peek() {
        return header.data;
    }
}
