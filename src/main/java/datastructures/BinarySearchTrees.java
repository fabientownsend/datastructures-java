package datastructures;

public class BinarySearchTrees<T extends Comparable<T>> {
    private BSTNode<T> root;

    public void instert(T data) {
        if(this.root == null) {
            this.root = new BSTNode<T>(data);
        } else {
            insertIntoTree(data, this.root);
        }
    }

    private void insertIntoTree(T newData, BSTNode<T> node) {
        if(newData.compareTo(node.getData()) < 0) {
            if(node.getLeftChild() != null) {
                insertIntoTree(newData, node.getLeftChild());
            } else {
                BSTNode newNode = new BSTNode<T>(newData);
                node.setLeftChild(newNode);
            }
        } else {
            if(node.getRightChild() != null) {
                insertIntoTree(newData, node.getRightChild());
            } else {
                BSTNode newNode = new BSTNode<T>(newData);
                node.setRightChild(newNode);
            }
        }
    }

    public void remove(T value) {
        if(this.root == null) {
            return;
        }
        this.root = remove(value, root);
    }

    private BSTNode<T> remove(T data, BSTNode<T> node) {
        if(node == null) {
            return node;
        }

        if(data.compareTo(node.getData()) < 0) {
            BSTNode<T> tempNode = remove(data, node.getLeftChild());
            node.setLeftChild(tempNode);
        } else if (data.compareTo(node.getData()) > 0) {
            BSTNode<T> tempNode = remove(data, node.getRightChild());
            node.setRightChild(tempNode);
        } else {
            if(node.getLeftChild() == null) {
                BSTNode<T> tempNode = node.getRightChild();
                node = null;
                return  tempNode;
            } else if(node.getRightChild() == null) {
                BSTNode<T> tempNode = node.getLeftChild();
                node = null;
                return  tempNode;
            }

            BSTNode<T> tempNode = getMinNode(node.getRightChild());
            node.setData(tempNode.getData());

            node.setRightChild(remove(tempNode.getData(), node.getRightChild()));
        }

        return node;
    }

    public T getMax() {
        if (this.root == null) {
            return null;
        } else {
            return getMaxNode(this.root).getData();
        }
    }

    private BSTNode<T> getMaxNode(BSTNode<T> node) {
        if(node.getRightChild() != null) {
            return getMaxNode(node.getRightChild());
        }
        return node;
    }

    public T getMin() {
        if (this.root == null) {
            return null;
        } else {
            return getMinNode(root).getData();
        }
    }

    private BSTNode<T> getMinNode(BSTNode<T> node) {
        if(node.getLeftChild() != null) {
            return getMinNode(node.getLeftChild());
        }
        return node;
    }
}
