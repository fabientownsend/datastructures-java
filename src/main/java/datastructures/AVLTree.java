package datastructures;

public class AVLTree<T extends Comparable<T>> {
    private AVLNode<T> root;

    public void insert(T newDate) {
        AVLNode<T> parentNode = this.root;

        if (this.root == null) {
            parentNode = this. root = new AVLNode<T>(newDate, null);
        } else {
            parentNode = this.root.insert(newDate, root);
        }

        rebalanceTree(parentNode);
    }

    private void rebalanceTree(AVLNode<T> parentNode) {
        setBalance(parentNode);

        if (parentNode.getBalance() < -1) {
            if (height(parentNode.getLeftChild().getLeftChild()) >=  height(parentNode.getLeftChild().getRightChild())) {
                parentNode = rotateRight(parentNode);
            } else {
                parentNode = rotateLeftRight(parentNode);
            }
        } else if (parentNode.getBalance() > 1) {
            if (height(parentNode.getRightChild().getRightChild()) >= height(parentNode.getRightChild().getLeftChild())) {
                parentNode = rotateLeft(parentNode);
            } else {
                parentNode = rotateRightLeft(parentNode);
            }
        }

        if (parentNode.getParentNode() != null) {
            rebalanceTree(parentNode.getParentNode());
        } else {
            this.root = parentNode;
        }
    }

    private void setBalance(AVLNode<T> node) {
        node.setBalance(height(node.getRightChild()) - height(node.getLeftChild()));
    }

    private int height(AVLNode<T> node) {
        if (node == null) {
            return -1;
        }

        return 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
    }

    private AVLNode<T> rotateLeftRight(AVLNode<T> node) {
        System.out.println("Rotate left then right");
        node.setLeftChild(rotateLeft(node.getLeftChild()));
        return rotateRight(node);
    }

    private AVLNode<T> rotateRightLeft(AVLNode<T> node) {
        System.out.println("Rotate right then left");
        node.setRightChild(rotateRight(node.getRightChild()));
        return rotateLeft(node);
    }

    private AVLNode<T> rotateLeft(AVLNode<T> node) {
        System.out.println("Rotation left");
        AVLNode<T> b = node.getRightChild();
        b.setParentNode(node.getParentNode());

        node.setRightChild(b.getLeftChild());

        if (node.getRightChild() != null) {
            node.getRightChild().setParentNode(node);
        }

        b.setLeftChild(node);
        node.setParentNode(b);

        if (b.getParentNode() != null) {
            if (b.getParentNode().getRightChild() == node) {
                b.getParentNode().setRightChild(b);
            } else {
                b.getParentNode().setLeftChild(b);
            }
        }

        setBalance(node);
        setBalance(b);

        return b;
    }

    private AVLNode<T> rotateRight(AVLNode<T> node) {
        System.out.println("Rotatation right");
        AVLNode<T> b = node.getLeftChild();
        b.setParentNode(node.getParentNode());

        node.setLeftChild(b.getRightChild());

        if (node.getLeftChild() != null) {
            node.getLeftChild().setParentNode(node);
        }

        b.setRightChild(node);
        node.setParentNode(b);

        if (b.getParentNode() != null) {
            if (b.getParentNode().getRightChild() == node) {
                b.getParentNode().setRightChild(b);
            } else {
                b.getParentNode().setLeftChild(b);
            }
        }

        setBalance(node);
        setBalance(b);

        return b;
    }

    public T getMin() {
        if (this.root != null) {
            return this.root.getMin();
        } else {
            return null;
        }
    }

    public T getMax() {
        if (this.root != null) {
            return this.root.getMax();
        } else {
            return null;
        }
    }

    public void traverseInOrder() {
        if (this.root != null) {
            this.root.traverse();
        }
    }

    public boolean remove(T newData) {
        if (this.root == null) {
            return false;
        } else {
            if (root.getData().compareTo(newData) == 0) {
                AVLNode<T> auxRoot = new AVLNode<T>(null, null);
                auxRoot.setLeftChild(root);
                boolean result = root.remove(newData, auxRoot);
                root = auxRoot.getLeftChild();
                return result;
            } else {
                return root.remove(newData, null);
            }
        }
    }
}
