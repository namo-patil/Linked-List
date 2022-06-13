package com.bridgelabz.datastructure;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Use to add new node at the start of list
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

    // Use to add new node at the end of list
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

    // Use to insert new node between two nodes
    public void insert(INode insertNode) {
        INode currNode = this.head.getNext();
        this.head.setNext(insertNode);
        insertNode.setNext(currNode);
    }

    //    public void popFirst(INode node) {
//        INode currNode = node;
//        head = node.getNext();
//    }
//
//    public void popLast(INode node) {
//        INode currNode = node;
//        while (currNode.getNext().equals(tail)) {
//            currNode = currNode.getNext();
//        }
//        this.tail = currNode.getNext();
//        currNode.getNext().setNext(null);
//    }
    // Use to delete first element
    public INode pop() {
        INode currNode = head;
        head = head.getNext();
        return currNode;
    }

    public void printMyNode() {
        INode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.getKey() + "-->");
            currNode = currNode.getNext();
        }
        System.out.println(currNode);
    }
}
