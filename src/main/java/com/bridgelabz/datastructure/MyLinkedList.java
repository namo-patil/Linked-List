package com.bridgelabz.datastructure;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode currNode = head;
            this.head = newNode;
            this.head.setNext(currNode);
        }
    }

    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printMyNode() {
        INode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.getKey() + "-->");
            currNode = currNode.getNext();
        }
        System.out.println("null");
    }
}
