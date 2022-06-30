package com.bridgelabz.datastructure;

public class MyStack<K> {
    private final MyLinkedList<K> myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList<K>();
    }

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }
}
