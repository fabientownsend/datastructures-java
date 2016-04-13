package datastructures;

public class BinarySearchTrees<T extends Comparable<T>> {
    private BSTNode<T> header;

    public void inster(T data) {
        if(this.header != null) {
            this.header.insert(data);
        } else {
            this.header = new BSTNode<T>(data);
        }
    }
}
