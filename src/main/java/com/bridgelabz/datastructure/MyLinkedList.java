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

    public void append(INode node) {
        if (this.head == null) {
            this.head = node;
        }
        if (this.tail == null) {
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void insert(INode insertNode) {
        INode currNode = this.head.getNext();
        this.head.setNext(insertNode);
        insertNode.setNext(currNode);
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
