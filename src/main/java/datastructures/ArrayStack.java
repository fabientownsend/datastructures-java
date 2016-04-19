package datastructures;

public class ArrayStack {
    private int [] stack;
    private int capacity;
    private int size = 0;

    public ArrayStack() {
        stack = new int[10];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
    }

    public void push(Integer data) {
        if(size == capacity) {
            throw new Overflow();
        }

        stack[size] = data;
        size++;
    }

    public void pop() {
        if(isEmpty()) {
            throw new Underflow();
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer peek() {
        if(!isEmpty()) {
            return stack[size - 1];
        } else {
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public void resize() {
        final int[] resizedStack = new int[stack.length*2];
        for(int i = 0; i < stack.length; i++) {
            resizedStack[i] = stack[i];
        }
        stack = resizedStack;
    }

    public String toString() {
        String stackElements = "";
        for(int i = size - 1; i >=0; i--) {
            stackElements += stack[i];
        }
        return stackElements;
    }

    public class Overflow extends RuntimeException {
    }

    public class Underflow extends  RuntimeException {
    }
}
