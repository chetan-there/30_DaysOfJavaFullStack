package com.ct.day9;
//Task 4: Insert a new node in the middle

// Node class represents a single element in the linked list
class Node4 {
    String data;   // stores the value
    Node4 next;    // pointer to the next node

    public Node4(String data) {
        this.data = data;
        this.next = null; // next is null by default
    }
}

public class Task4 {

    public static void main(String[] args) {

        // Step 1: Create the first node (head)
        Node4 head = new Node4("amar");

        // Step 2: Link second node
        head.next = new Node4("akbar");

        // Step 3: Link third node
        head.next.next = new Node4("anthony");

        // Step 4: Create the new middle node
        Node4 mid = new Node4("bharat");

        // Step 5: Insert "bharat" between "akbar" and "anthony"
        // mid → anthony
        mid.next = head.next.next;

        // akbar → mid
        head.next.next = mid;

        // Step 6: Traverse and print the linked list
        Node4 temp = head; // use temp so head is not lost
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}