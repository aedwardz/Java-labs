/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden 
 * 7/24/2024
 * 
 * 12.6 LAB: File name change
 * 
 * This program takes input a single filename. Using this file name, a FileInputStream
 * object is created. A scanner then reads through each line of the given file, replacing the 
 * ending file type. The modified string is then output to the standard output
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String fileName = scnr.next();
      FileInputStream fs = new FileInputStream(fileName);
      Scanner inFS = new Scanner(fs);
      
      while (inFS.hasNext()) {
    	  String line = inFS.next();
    	  String newLine = line.replace("_photo.jpg", "_info.txt");
    	  System.out.println(newLine);
      }
   }
}
