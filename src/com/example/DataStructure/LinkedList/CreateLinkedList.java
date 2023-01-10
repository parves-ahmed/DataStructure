package com.example.DataStructure.LinkedList;

import java.util.Objects;

public class CreateLinkedList {

    public Node head;

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        CreateLinkedList list = new CreateLinkedList();
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;

        printLinkedList(list.head);
    }
    private static void printLinkedList(Node head){
        Node currentNode = head;
        while(Objects.nonNull(currentNode)){
            System.out.print(currentNode.getData() + "->");
            currentNode = currentNode.getNext();
        }
        System.out.print("null\n");
    }
}
