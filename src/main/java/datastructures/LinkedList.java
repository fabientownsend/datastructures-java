package datastructures;

public class LinkedList<E> {
    private Node<E> header;
    private Node<E> lastNode;
    private int size;

    public LinkedList() {
        header = new Node<E>(null);
        lastNode = header;
    }

    public void prepend(E data) {
        final Node newFirstNode = new Node<E>(data);

        if(size == 0) {
            header.setNext(newFirstNode);
            lastNode = newFirstNode;
        } else {
            final Node firstNode = header.getNext();
            header.setNext(newFirstNode);
            newFirstNode.setNext(firstNode);
        }

        size++;
    }

    public void append(E data) {
        final Node newLastNode = new Node<E>(data);

        if(size == 0) {
            header.setNext(newLastNode);
        } else {
            lastNode.setNext(newLastNode);
        }

        lastNode = newLastNode;
        size++;
    }

    public void removeFirst() {
        if(size != 0) {
            header.setNext(header.getNext().getNext());
            size--;
        }
    }

    public void removeLast() {
        if(size == 1) {
            header.setNext(null);
            lastNode = header;
            size--;
        } else if(size != 0) {
            Node n = header.getNext();

            for (int i = 0; i < size - 2; i++) {
               n = n.getNext();
            }

            lastNode = n;
            n.setNext(null);
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node n = header.getNext();
        String datas = "";
        while(n != null) {
            datas += n.getData();
            n = n.getNext();
        }
        return datas;
    }
}
