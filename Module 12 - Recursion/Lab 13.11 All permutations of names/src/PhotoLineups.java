/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.11
 * 
 * This program takes String inputs until "-1" is entered. If the given inputs
 * are valid, they are inserted into the ArrayList, namesList. Using a method
 * called printAllPermutations, each permutation of these names being printed 
 * is output recursively.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
	
	/**
	 * Prints all permutations of names in an Array
	 * @param permList ArrayList of permutations
	 * @param nameList ArrayList of names to be permuted
	 */
	public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
	   int i;
	   int nameSize = nameList.size();
	   String name;
	   
	   if (nameSize == 0) {
		   for (i = 0; i < permList.size(); i++) {
			   if (i != permList.size()-1) {
				   System.out.print(permList.get(i) + ", ");
			   }
			   else {
				   System.out.println(permList.get(i));
			   }	   
		   }
		   
	   }
	   else {
		   for (i = 0; i < nameSize; i++) {
			   name = nameList.get(i);
			   nameList.remove(i);
			   permList.add(name);
			   printAllPermutations(permList, nameList);
			   
			   nameList.add(i, name);
			   permList.remove(permList.size() - 1);
			   
		   }
	   }
   
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      // TODO: Read a list of names into nameList; stop when -1 is read. Then call recursive method.
      name = scnr.next();
      while (!name.equals("-1")) {
    	  nameList.add(name);
    	  name = scnr.next();
 
      }
      printAllPermutations(permList, nameList);
   }
}
