package com.bridgelabz.datastructure;

public class MyQueue<K> {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueu(INode newNode) {
        myLinkedList.append(newNode);
    }

    public INode isEmpty() {
        return myLinkedList.head;
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }
}
