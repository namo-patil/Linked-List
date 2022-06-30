package com.bridgelabz.datastructure;

public class MyQueue<K> {
    private final MyLinkedList<K> myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList<K>();
    }

    public void enqueu(INode newNode) {
        myLinkedList.append(newNode);
    }
    public INode dequeue(){
        return myLinkedList.pop();
    }

    public INode isEmpty() {
        return myLinkedList.head;
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }
}
