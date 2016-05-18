package datastructures;

public class AVLNode<T extends Comparable<T>> {
    private T data;
    private AVLNode<T> leftChild;
    private AVLNode<T> rightChild;


    private AVLNode<T> parentNode;
    private int balance;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public AVLNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AVLNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public AVLNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(AVLNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public AVLNode<T> getParentNode() {
        return parentNode;
    }

    public void setParentNode(AVLNode<T> parentNode) {
        this.parentNode = parentNode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AVLNode(T data, AVLNode<T> parentNode) {
        this.data = data;
        this.parentNode = parentNode;
        this.leftChild = null;
        this.rightChild = null;
    }

    public AVLNode<T> insert(T newData, AVLNode<T> parentNode) {
        if (newData.compareTo(this.data) < 0) {
            if(this.leftChild == null) {
                this.leftChild = new AVLNode<T>(newData, parentNode);
            } else {
                this.leftChild.insert(newData, this);
            }
        } else {
            if(this.rightChild == null) {
                this.rightChild = new AVLNode<T>(newData, parentNode);
            } else {
                this.rightChild.insert(newData, this);
            }
        }

        return parentNode;
    }

    public boolean remove(T value, AVLNode<T> parent) {
        if (value.compareTo(this.data) < 0) {
            if (this.leftChild != null) {
                return this.leftChild.remove(value, this);
            } else {
                return false;
            }
        } else if (value.compareTo(this.data) > 0) {
            if (this.rightChild != null) {
                return this.rightChild.remove(value, this);
            } else {
                return false;
            }
        } else {
            if (this.leftChild != null && this.rightChild != null) {
                this.data = this.rightChild.minValue();
                this.rightChild.remove(this.data, this);
            } else if (parent.getLeftChild() == this) {
                parent.setLeftChild((this.leftChild != this) ? leftChild : rightChild);
            } else if (parent.getRightChild() == this) {
                parent.setRightChild((this.leftChild != this) ? leftChild : rightChild);
            }
            return true;
        }
    }

    public T minValue() {
        if (this.leftChild == null) {
            return this.data;
        } else {
            return this.leftChild.minValue();
        }
    }

    public T maxValue() {
        if (this.rightChild == null) {
            return this.data;
        } else {
            return this.rightChild.maxValue();
        }
    }

    public void traverse() {
        if (this.leftChild != null) {
            this.leftChild.traverse();
        }

        System.out.print(this +"-");

        if (this.rightChild != null) {
            this.rightChild.traverse();
        }
    }

    public  T getMin() {
        if (this.leftChild == null) {
            return this.data;
        } else {
            return this.leftChild.getMin();
        }
    }

    public  T getMax() {
        if (this.rightChild == null) {
            return this.data;
        } else {
            return this.rightChild.getMax();
        }
    }
}
