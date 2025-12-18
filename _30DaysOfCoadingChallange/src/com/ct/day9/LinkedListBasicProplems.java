package com.ct.day9;

class Node{
	String data;
	Node next;
	
	public Node(String data) {
		this.data=data;
		this.next=null;
	}
}

public class LinkedListBasicProplems {

	
	public static void main(String[] args) {
		
		Node head = new Node("amar");

		head.next = new Node("akbar");
		
		head.next.next = new Node("anthony");
		
		Node mid = new Node("bharat");
		
		mid.next = head.next.next;
		
		head.next.next = mid;
		
		while(head != null) {
			System.out.println(head.data);
			head=head.next;
		}
		
	}

}
