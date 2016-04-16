package datastructures;

public class BSTNode<T> {
    private T data;
    private BSTNode<T> leftChild;
    private BSTNode<T> rightChild;

    public void setLeftChild(BSTNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BSTNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode<T> getLeftChild() {
        return leftChild;
    }

    public BSTNode<T> getRightChild() {
        return rightChild;
    }

    public BSTNode(T data) {
        this.data = data;
    }

    public T getMinValue() {
        if(this.leftChild  == null) {
            return this.data;
        } else {
            return this.leftChild.getMinValue();
        }
    }

    public T getMaxValue() {
        if(this.rightChild == null) {
            return this.data;
        } else {
            return this.rightChild.getMaxValue();
        }
    }
}
