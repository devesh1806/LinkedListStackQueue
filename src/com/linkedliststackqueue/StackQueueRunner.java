package com.linkedliststackqueue;

public class StackQueueRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinked = new MyLinkedList();
		
		System.out.println("Stack Implementation: ");
		myLinked.push(firstNode);
		myLinked.push(secondNode);
		myLinked.push(thirdNode);
		myLinked.printList();
	}
}
