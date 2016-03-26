package datastructures;

public class ArrayStack {
    private int [] stack;
    private int top = -1;

    public ArrayStack() {
        stack = new int[10];
    }

    public ArrayStack(int size) {
        stack = new int[size];
    }

    public void push(Integer data) {
        top += 1;

        if(stack.length == top) {
            resize();
        }

        stack[top] = data;
    }

    public void pop() {
        if(!isEmpty()) {
            top -= 1;
        }
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Integer peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public int getSize() {
        return stack.length;
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
        for(int i = top; i >=0; i--) {
            stackElements += stack[i];
        }
        return stackElements;
    }
}
