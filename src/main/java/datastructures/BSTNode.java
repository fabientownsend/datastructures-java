package datastructures;

public class BSTNode<T extends Comparable<T>> {
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

    public void insert(T data) {
        if(data.compareTo(this.data) < 0) {
            if(this.leftChild != null) {
                this.leftChild.insert(data);
            } else {
                this.leftChild = new BSTNode<T>(data);
            }
        } else {
            if(this.rightChild != null) {
                this.rightChild.insert(data);
            } else {
                this.rightChild = new BSTNode<T>(data);
            }
        }
    }

    public boolean remove(T data, BSTNode<T> parent) {
        if(data.compareTo(this.data) < 0) {
            if(this.leftChild != null) {
                return this.leftChild.remove(data, this);
            } else {
                return false;
            }
        } else if (data.compareTo(this.data) > 0){
            if(this.rightChild != null) {
                return this.rightChild.remove(data, this);
            } else {
                return false;
            }
        } else {
            if (this.leftChild != null && this.rightChild != null) {
                this.data = this.rightChild.getMinValue();
                this.rightChild.remove(this.data, this);
            } else if(parent.getLeftChild() == this) {
                BSTNode<T> node = (leftChild != null) ? leftChild : rightChild;
                parent.setLeftChild(node);
            } else if(parent.getRightChild() == this) {
                BSTNode<T> node = (leftChild != null) ? leftChild : rightChild;
                parent.setRightChild(node);
            }
        }
        return true;
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
