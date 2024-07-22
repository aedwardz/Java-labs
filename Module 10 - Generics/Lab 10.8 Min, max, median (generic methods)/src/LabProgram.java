/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/21/2024
 * 
 * 10.8 LAB: Min, max, median (generic methods)
 * 
 * This program fills three arraylists with input values, using the three defined methods. After the creation
 * of the lists, another method uses these lists and returns their minimum, medium, and maximum inserted into an
 * arraylist. Each of these are printed using a user defined method
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {

   // Input 5 Integers and return the Integers in an ArrayList
	/**
	 * Reads 5 integers in an arraylist
	 * @param scnr allows reading values
	 * @return an arraylist of 5 integers
	 */
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
      /* Type your code here. */
	   ArrayList<Integer> numList = new ArrayList<Integer>();
	   int input;
	   for (int i = 0; i < 5; i++) {
		   input = scnr.nextInt();
		   numList.add(input);
		   
	   }
	   return numList;
   }

   // Input 5 Doubles and return the Doubles in an ArrayList
   /**
    * Input 5 doubles and stores them in an arraylist
    * @param scnr allows inputs to be read from the user
    * @return the arraylist of doubles
    */
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
      /* Type your code here. */
	   ArrayList<Double> numList = new ArrayList<Double>();
	   double input;
	   for (int i = 0; i < 5; i++) {
		   input = scnr.nextDouble();
		   numList.add(input);
		   
	   }
	   return numList;
   }

   // Input 5 Strings, and return the Strings in an ArrayList
   /**
    * Fills an arraylist of Strings
    * @param scnr Inputs to be read
    * @return the arraylist filled with 5 inputs
    */
   public static ArrayList<String> inputWords(Scanner scnr) {
      /* Type your code here. */
	   ArrayList<String> numList = new ArrayList<String>();
	   String input;
	   for (int i = 0; i < 5; i++) {
		   input = scnr.next();
		   numList.add(input);
		   
	   }
	   return numList;
   }

   // Output the elements of the ArrayList parameter
   /**
    * Prints all elements of a given array
    * 
    * @param <TheType> Generic type 
    * @param list list of TheType objects
    */
   public static <TheType extends Comparable<TheType>>
      void print(ArrayList<TheType> list) {
      /* Type your code here. */
	   for (int i = 0; i < list.size(); i++) {
		   TheType element = list.get(i);
		   System.out.print(element + " ");
		   }
	   System.out.println();
	   
   }

   // Return the min, median, and max of the ArrayList parameter in a new ArrayList
   /**
    * creates an arraylist of statistics relating to the given arraylist
    * @param <TheType> generic type
    * @param list list to be converted into statics
    * 
    * @return an arrayList Of statistics for the given arrayList
    */
   public static <TheType extends Comparable<TheType>>
      ArrayList<TheType> getStatistics(ArrayList<TheType> list)
   {
      /* Type your code here. */
	   Collections.sort(list);
	   TheType minimum = list.get(0);
	   TheType median = list.get(list.size()/2);
	   TheType maximum = list.get(list.size()-1);
	   
	   ArrayList<TheType> stats = new ArrayList<TheType>();
	   stats.add(minimum);
	   stats.add(median);
	   stats.add(maximum);
	   
	   return stats;
	   
	   
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();
      
      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
