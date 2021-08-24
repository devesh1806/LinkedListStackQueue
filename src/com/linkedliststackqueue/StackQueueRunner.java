package com.linkedliststackqueue;
import java.util.Scanner;

public class StackQueueRunner {
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinked = new MyLinkedList();
		MyLinkedListQueue myLinkedQueue = new MyLinkedListQueue();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Stack 2.Queue");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			myLinked.push(firstNode);
			myLinked.push(secondNode);
			myLinked.push(thirdNode);
			myLinked.printList();
			
			myLinked.peek();
			break;
			
		case 2:
			myLinkedQueue.enQueue(thirdNode);
			myLinkedQueue.enQueue(secondNode);
			myLinkedQueue.enQueue(firstNode);
			myLinkedQueue.printList();
			
			myLinkedQueue.deQueue();
			myLinkedQueue.size();
			myLinkedQueue.isEmpty();
			break;
			
		default:
			break;
			
		}
	}
}
