package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToFront() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumber_WhenAddedToLinkedList_ShouldBeAddedInBetweenTwoNodes() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> insertNode = new MyNode<>(30);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.printMyNode();
        myLinkedList.insert(insertNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(insertNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenAnElement_WhenWantedToDelete_ShouldRemoveFromFirst() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        myLinkedList.pop();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenAnElement_WhenWantedToDelete_ShouldRemoveFromLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenAnElement_WhenSearchedInLinkedList_ShouldBeFound() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        INode foundNode = myLinkedList.searchNode(mySecondNode);
        boolean result = foundNode.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenAnElement_WhenInsert_ShouldBeAddedAfter() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        myLinkedList.insertAfter(30, myFourthNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.head.getNext().getNext().equals(myFourthNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNodeWithKeyValue_WhenSearchAndDeletedNode_ShouldBeDisplaySizeOfLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList<K> myLinkedList = new MyLinkedList<K>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.printMyNode();
        myLinkedList.searchAndDelete(40);
        myLinkedList.printMyNode();
        System.out.println("Size of Linked List: " + myLinkedList.size());
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
    }
}
