package datastructures;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data) {
        this.data = data;
        next = null;
    }
}
