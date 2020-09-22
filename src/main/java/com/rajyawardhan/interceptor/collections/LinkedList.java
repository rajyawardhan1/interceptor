package com.rajyawardhan.interceptor.collections;

public class LinkedList {
    private Node latestNode;
    private Node firstNode;

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);

        if (latestNode == null) {
            firstNode = node;
        } else {
            latestNode.setNext(node);
        }
        latestNode = node;
    }

    public void traverse() {
        Node node = firstNode;

        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public void reverse() {
        Node head = firstNode.getNext();
        Node currentNode = firstNode.getNext();
        Node prev = latestNode = firstNode;

        prev.setNext(null);

        while (head!= null) {
            head = head.getNext();
            currentNode.setNext(prev);

            prev = currentNode;
            currentNode = head;
        }

        firstNode = prev;
    }
}
