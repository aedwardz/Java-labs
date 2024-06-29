/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/28/2024
 * 
 * Lab 6.28: Sort an Array
 * 
 * This program takes a first input being an integer representing the size of the array that will later be sorted. 
 * The rest of the inputs are the elements that will be sorted in the array. The array is then sorted in the method "sortArray"
 * in descending order, then output with each element seperated by a comma.
 */

import java.util.Scanner;

public class LabProgram {
	/**
	 * This method uses the bubble sort algorithm to sort an array
	 * @param arr an array with a max capacity of 20 elements
	 */
	public static void sortArray(int [] arr, int size) {
		int temp;
		
		for (int i = size-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numElements = scnr.nextInt();
		
		int [] nums = new int [numElements];
		
		for (int i = 0; i < numElements; i++ ) {
			nums[i] =  scnr.nextInt();
		}
		sortArray(nums, numElements);
		for (int num: nums) {
			System.out.print(num + ",");
		}
		System.out.println();
		
		
	}
}
