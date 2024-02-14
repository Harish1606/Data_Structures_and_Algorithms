package com.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(13);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(18);
        list.insert(2, 7);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.display();
        System.out.println();
        list.deleteLast();
        list.display();
        System.out.println();
        list.delete(1);
        list.display();
    }
}
