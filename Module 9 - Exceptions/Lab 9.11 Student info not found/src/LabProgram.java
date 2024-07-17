/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/17/2024
 * 
 * 9.11 LAB: Student info not found
 * 
 * This program Takes input a txt file, and two other inputs. The contents of the text file are read into a file input stream
 * Depending on the next input, the program will either look for the ID or name associated with the the student info given in
 * the third input. This is done by using to functions, findID and findName. Both of these functions throw exceptions. If either 
 * of these exceptions are thrown, their messages are output in the main method.

 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   
	/**
	 * This function uses a Student's name to find their ID in the given Scanner
	 * @param studentName a String containing the Student name to be searched
	 * @param infoScnr A scanner containing the contents of the file
	 * @return the ID associated with that student's name
	 * @throws Exception If the Student name has no associated ID
	 */
   public static String findID(String studentName, Scanner infoScnr) throws Exception {
	   String info;
	   String id = null;
	   while (infoScnr.hasNext()) {
		   info = infoScnr.next();
		   if (info.equals(studentName)) {
			   id = infoScnr.next();
		   }
	   }
	   if (id == null) {
		   throw new Exception("Student ID not found for " + studentName);
	   }
	   else {
		   return id;
	   }
	   
   }
   
   
   
   
   
   
   /**
    * This function uses a StudentID to find their name
    * @param studentID A string representing a student ID 
    * @param infoScnr A scanner containing the contents of a file
    * @return The Student name associated with the given ID
    * @throws Exception if the student's name is not found
    */
   public static String findName(String studentID, Scanner infoScnr) throws Exception {
	   String info;
	   String prev = null;
	   String name = null;
	   while (infoScnr.hasNext()) {
		   info = infoScnr.next();
		   if (info.equals(studentID)) {
			   name = prev;
		   }
		   prev = info;
	   }
	   if (name == null) {
		   throw new Exception("Student name not found for " + studentID);
	   }
	   else {
		   return name;
	   }
	   
   }
   
   
   
   
   
   
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String studentID;
      String studentInfoFileName;
      FileInputStream studentInfoStream = null;
      Scanner studentInfoScanner = null;
      
      // Read the text file name from user
      studentInfoFileName = scnr.next();

      // Open the text file
      studentInfoStream = new FileInputStream(studentInfoFileName);
      studentInfoScanner = new Scanner(studentInfoStream);
      
      // Read search option from user. 0: findID(), 1: findName()
      int userChoice = scnr.nextInt();

      // FIXME: findID() and findName() may throw an Exception.
      //        Insert a try/catch statement to catch the exception and output the exception message.
      try {
	      if (userChoice == 0) {
	         studentName = scnr.next();
	         studentID = findID(studentName, studentInfoScanner);
	         System.out.println(studentID);
	      }
	      else {
	         studentID = scnr.next();
	         studentName = findName(studentID, studentInfoScanner);
	         System.out.println(studentName);
	      }
	      }
      catch (Exception e) {
    	  System.out.println(e.getMessage());
      }
      studentInfoStream.close();
   }
}
