package com.ct.day8;

/**
 * Represents a single node in a singly linked list.
 * Each node stores an integer value and a reference to the next node.
 */
class Node {

    int data;   // Value stored in this node
    Node next;  // Reference to the next node in the list (null if this is the last node)

    /**
     * Constructor initializes a node with a given value.
     * The next pointer is set to null by default, meaning no next node yet.
     */
    public Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        // Creating the head node — this marks the start of the linked list.
        Node head = new Node(10);

        // Manually linking nodes to form a chain: 10 -> 20 -> 30 -> 40
        // Each assignment connects the current node to the next one.
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Iterating through the linked list starting from head.
        // Loop continues until we reach a null reference (end of list).
        Node current = head; // Using a separate pointer so we don't lose the head reference
        while (current != null) {
            System.out.print(current.data + " "); // Print the value of the current node
            current = current.next;               // Move to the next node
        }
    }
}