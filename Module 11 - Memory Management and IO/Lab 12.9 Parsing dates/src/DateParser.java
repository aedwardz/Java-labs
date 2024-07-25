/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/24/2024
 * 
 * 12.9 LAB: Parsing dates
 * 
 * This program takes in lines of input until "-1" is input. For each line, the program checks that the format
 * of the string is "month day, year". If it is not that format, then the input is skipped. if it is in the 
 * correct format, the line is parsed using the substring method. The string is broken down into individual
 * components and reformatted into "monthInt-date-year".
 */
import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String date;
      String year;
      String day;
      String month;
      
      while (!input.equals("-1")) {
    	  try {
    	  date = input.substring(0, input.indexOf(','));
    	  year = input.substring(input.indexOf(',')+2);    	
    	  day = date.substring(date.indexOf(" ")+1);    	  
    	  month = date.substring(0, date.indexOf(" "));
    	  
    	  
    	  System.out.printf("%d-%s-%s\n",getMonthAsInt(month), day, year);
    	  input = scnr.nextLine();
    	  
    	  }
    	  catch (StringIndexOutOfBoundsException e) {
    		  input = scnr.nextLine();
    	  }

    	  
     
   }
}
}
