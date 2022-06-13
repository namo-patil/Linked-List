package com.bridgelabz.datastructure;

public class MyStack<K> {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }
}
