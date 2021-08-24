package com.linkedliststackqueue;

public class MyLinkedList <E> {
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void push(INode myNode) {
		add(myNode);
	}
	
	public void peek() {
		while(head!=null) {
			System.out.println(head.getKey());
			pop();
		}
	}
	
	public void pop() {
		System.out.println(head.getKey()+" popped from top of stack.");
		INode temp = head.getNext();
		head = temp;
	}
	
	public void printList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = this.head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp != tail) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printformat);
	}
}
