/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.15
 * 
 * This program takes input of a size and values to be inserted into a linked list. 
 * Using the members of the IntNode class, the program pass the head node of the list into
 * the method printLinkedList. The method recursively prints the data in each node of the list
 * separated by comma
 */

import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive printLinkedList() method here. */
	/**
	 * Recursively prints the data in each node of a linked list
	 * @param head the head node of a linked list
	 */
	public static void printLinkedList(IntNode head) {
		if (head == null) {
			return;
		}
		else {
			head.printData();
			printLinkedList(head.getNext());
		}
		
		
	}
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;
      int value;
      
      size = scnr.nextInt();
      value = scnr.nextInt();
      IntNode headNode = new IntNode(value); // Make head node as the first node
      IntNode lastNode = headNode;      // Node to add after
      IntNode newNode = null;           // Node to create
      
      // Insert the second and the rest of the nodes
      for (int n = 0; n < size - 1; ++n) {
         value = scnr.nextInt();
         newNode = new IntNode(value);
         lastNode.insertAfter(newNode);
         lastNode = newNode;
      }
      
      // Call printLinkedList() with the head node
      printLinkedList(headNode);
   }
}
