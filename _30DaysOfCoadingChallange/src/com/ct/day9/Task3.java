package com.ct.day9;
// Task 3: Add a Third Node at the End

class Node3{
	String data;
	Node3 next;
	
	public Node3(String data) {
	this.data= data;
	this.next=null;	}
}
public class Task3 {
	public static void main(String[] args) {
		Node3 head = new Node3("amar");
		
		head.next = new Node3("akbar");
		
		head.next.next =new Node3("anthony");
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
