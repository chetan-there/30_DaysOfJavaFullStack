package com.ct.day9;
//Task 2: Insert a New Node at the Beginning (Head Insertion)
class Node2{
	String data;
	Node2 next;
	
	public Node2(String data) {
	this.data=data;
	this.next=null;
	}
}

public class Task2 {
	public static void main(String[] args) {
		Node2 head = new Node2("amar");
		
		head.next=new Node2("akbar");
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
