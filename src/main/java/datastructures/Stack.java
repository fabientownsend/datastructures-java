package main.java.datastructures;

public class Stack {
    private int [] array;
    private int top = -1;
    private int size = 0;

    public Stack() {
        array = new int[10];
    }

    public Stack(int size) {
        array = new int[size];
    }

    public void push(Integer data) {
        top += 1;

        if(array.length == top) {
            resize();
        }

        array[top] = data;
        size++;
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
            return array[top];
        } else {
            return null;
        }
    }

    public int getSize() {
        return array.length;
    }

    public void resize() {
        int[] temp = new int[array.length*2];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public String toString() {
        String temp = "";
        for(int i = top; i >=0; i--) {
            temp += array[i];
        }
        return temp;
    }
}
