package datastructures;

public class BSTNode<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public BSTNode(T data) {
        this.data = data;
    }
}
