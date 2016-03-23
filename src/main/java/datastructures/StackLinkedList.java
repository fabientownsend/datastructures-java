package datastructures;

public class StackLinkedList<T> {
    private Node<T> header;
    private int size;

    public void push(T data) {
        if(header == null) {
            header = new Node<T>(data);
        } else {
            Node<T> temp = header;
            header = new Node<T>(data);
            header.setNext(temp);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public T pop() {
        T data = header.getData();
        header = header.getNext();
        size--;
        return data;
    }

    public boolean isEmpty() {
        return header == null;
    }

    public T peek() {
        return header.getData();
    }
}
