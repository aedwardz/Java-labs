/*
 * Antonio Edwards 
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/17/2024
 * 
 * Lab 10.5: What order? (generic methods)
 * 
 * This program takes in 4 inputs of the same type and determines their order. Using the 
 * generic method, checkOrder, the program determines whether the inputs are in ascending order,
 * descending order, or unordered. Based on those orders, the program will output the value
 * returned by checkOrder
 */

import java.util.Scanner;

public class WhatOrder {
   
	/**
	 * This method takes a collection of generic type objects and checks their order
	 * @param <T> generic types extending Comparable class
	 * @param a generic object
	 * @param b generic object
	 * @param c generic object 
	 * @param d generic object
	 * @return 1 if descending, 0 if no order, -1 if ascending
	 */
	public static <T extends Comparable<T>>
	int checkOrder(T a, T b, T c, T d) {
		if (a.compareTo(b) < 0 && b.compareTo(c) < 0 && c.compareTo(d) < 0) {
			return -1;
		}
		else if (a.compareTo(b) > 0 && b.compareTo(c) > 0 && c.compareTo(d) > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}



   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
   }
}
