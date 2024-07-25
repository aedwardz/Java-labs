/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden 
 * 7/24/2024
 * 
 * 12.10 LAB: Parsing food data
 * 
 * This program takes input a single filename. Using this file name, a fileinputstream is created. 
 * using a scanner, lines are read so that the lined may be parsed in a specific way. The lines, representing
 * the availability of certain items are reformatted into a new string to be output to the standard output.
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String fileName = scnr.next();
      FileInputStream fStream = new FileInputStream(fileName);
      Scanner reader = new Scanner(fStream);
      reader.useDelimiter("\t|\n");
      
      String category;
      String item1;
      String item2;
      String status;
      
      
      
      while(reader.hasNext()) {
    	  category = reader.next();
    	  item1 = reader.next();
    	  item2 = reader.next();
    	  status = reader.next();
    	  
    	  if (status.equals("Available")) {
    		  System.out.printf("%s (%s) -- %s\n", item1, category, item2);
    	  }
    	  
      }
      fStream.close();
      reader.close();
      
      
   }
}
