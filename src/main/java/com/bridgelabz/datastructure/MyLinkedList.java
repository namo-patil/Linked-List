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

    // Use to delete first element of list
    public INode pop() {
        INode currNode = head;
        head = head.getNext();
        return currNode;
    }

    // Use to delete last element of list
    public void popLast() {
        INode secondLast = head;
        INode lastNode = head.getNext();
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
            secondLast = secondLast.getNext();
        }
        secondLast.setNext(null);
        this.tail = secondLast;
    }

    // Use to search node in list
    public INode searchNode(INode node) {
        INode currNode = node;
        while (currNode != null && currNode.getNext() != null) {
            if (currNode.getKey().equals(node.getKey())) {
                System.out.println("The Found value: " + currNode.getKey());
                break;
            } else
                currNode = currNode.getNext();
        }
        return currNode;
    }

    public void insertAfter(INode myNode, INode newNode) {
        INode currNode = this.head;
        while (currNode != null && currNode.getNext() != null) {
            if (currNode.getKey().equals(myNode.getKey())){
                newNode.setNext(currNode.getNext());
                currNode.setNext(newNode);
                break;
            }
            else
                currNode = currNode.getNext();
        }
    }

    // Use to print node of list
    public void printMyNode() {
        INode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.getKey() + "-->");
            currNode = currNode.getNext();
        }
        System.out.println(currNode);
    }
}
