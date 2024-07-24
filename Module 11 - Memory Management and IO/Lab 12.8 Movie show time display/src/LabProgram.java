/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/24/2024
 * 
 * 12.8 LAB: Movie show time display
 * 
 * THis program takes input a file name referring to a csv. Each line of the CSV holds movie information
 * including the time it will be playing, the title of the movie, and the rating of the move.Each line
 * may contain information on the same movie, so when writing the information to the standard output, 
 * multiple times should be accounted for.
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
public class LabProgram {
//	public static ArrayList<String> getAllTitles(Scanner inStream){
//		
//		
//		
//	}
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String fileName = scnr.next();
      FileInputStream fStream = new FileInputStream(fileName);
      Scanner reader = new Scanner(fStream);
      
      //allow next to not just stop at newlines, but commas and /r characters   
      reader.useDelimiter(",|\n|\r");
      
      
      
      String time;
      String title;
      String rating;
      String line = "";
      String prev = null;
      
      while(reader.hasNext()) {
    	  time = reader.next();
    	  title = reader.next();
    	  rating = reader.next();
    	  ///Remove lines 48-50 for zybooks submission
    	  if (reader.hasNext()) {
    		  reader.next();
    	  }
    	  if (prev == null) {
    		  line = String.format("%-44.44s | %5s | %s", title, rating, time);
    	  }
    	  else {
    		  if (prev.equals(title)) {
    			  line += " " + time;
    		  }
    		  else {
    			  System.out.println(line);
    			  line = String.format("%-44.44s | %5s | %s", title, rating, time);
    		  }
    	  }
    	  
    	  prev = title;
      }
      System.out.println(line);
      fStream.close();
   }
}
