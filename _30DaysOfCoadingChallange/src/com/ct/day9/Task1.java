package com.ct.day9;
// Task 1 : create the node and insert one node 
 class Node1{
	String data;
	Node1 next;
	
	public Node1(String data) {
	this.data=data;
	this.next=null;
	}
}

public class Task1 {
	
	public static void main(String[] args) {
		
		Node1 head = new Node1("amar");
		
		while(head != null) {
			System.out.println(head.data);
			head= head.next;
		}
		
	}
	

}
