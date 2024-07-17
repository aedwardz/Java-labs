/*
 * Antonio Edwards
 * CIS 255 Summer 2025
 * Instructor Dave Harden
 * 7/16/2024
 * 
 * Lab 9.7: Exception handling to detect input String vs. Integer
 * 
 * This program takes input until a -1 is given. While taking input, a try and catch block is used to check that there
 * is no mismatch in types between what the user gives and what the scanner excepts. These inputs represent a name and 
 * an age. If the wrong type of information is given, then the name is assigned with the age 0. If the information is valid,
 * the program outputs that persons name along with their age
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String inputName;
      int age;
      
      inputName = scnr.next();
      while (!inputName.equals("-1")) {
         // FIXME: The following line will throw an InputMismatchException.
         //        Insert a try/catch statement to catch the exception.
    	 try {
    		 age = scnr.nextInt();
    		 
    	 }
    	 catch (InputMismatchException e) {
    		 age = -1;
    		 scnr.next();
    		 scnr.next();
    		 
    	 }
    	 System.out.println(inputName + " " + (age + 1));
		 inputName = scnr.next();
      }
   }
}