/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/24/2024
 * 
 * 12.7 LAB: Course Grade
 * 
 * THis program takes input a file name referring to a tsv. In this tsv that represents
 * scores for students in a class, each line is parsed so that the grade may be calculated
 * for that student, using the function computGrade. Once the Student's grade is calculated, 
 * The grade is added to that line, and written to the file, report.txt, along with class averages
 * for each exam.
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LabProgram {
	/**
	 * Computes the average of integers in an ArrayList
	 * @param scores an ArrayList of integers representing exam scores
	 * @return a double representing the class averages
	 */
	public static double computeAverage(ArrayList<Integer> scores) {
		int i;
		int sum = 0;
		for (i = 0; i < scores.size(); i++) {
			int score = scores.get(i);
			sum += score;
		}
		double average = sum / (i / 1.0);
		return average;
	}
	
	
	/**
	 * This functions turns integer points into a letter grade
	 * @param points the number of points
	 * @return the number of points converted into a letter grade
	 */
	public static char computeGrade(double points) {

		if (points >= 90) {
			return 'A';
		}
		if (points >= 80) {
			return 'B';
		}
		if (points >= 70) {
			return 'C';
		}
		if (points >= 60) {
			return 'D';
		}
		return 'F';		
	}
	
	
	
	
	
	
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      String fileName = scnr.next();
      FileInputStream fileStream = new FileInputStream(fileName);
      Scanner fileReader = new Scanner(fileStream);
      FileOutputStream outputStream = new FileOutputStream("report.txt");
      PrintWriter writer = new PrintWriter(outputStream);
      int m1;
      int m2; 
      int fin;
      double average;
      String fName;
      String lName;   
      ArrayList<Integer> m1Scores = new ArrayList<Integer>();
      ArrayList<Integer> m2Scores = new ArrayList<Integer>();
      ArrayList<Integer> finScores = new ArrayList<Integer>();
      
      
      /* TODO: Read a file name from the user and read the tsv file here. */

     
     while(fileReader.hasNext()) {
    	 //parse the line
    	 fName = fileReader.next();
    	 lName = fileReader.next();
    	 
    	 m1 = fileReader.nextInt();
    	 m1Scores.add(m1);
    	 
    	 m2 = fileReader.nextInt();
    	 m2Scores.add(m2);
    	 
    	 fin = fileReader.nextInt();
    	 finScores.add(fin);
    	 
    	 average = (m1 + m2 + fin ) / 3.0;
    	 char grade = computeGrade(average);
    	 
    	 //write to file
    	 writer.printf("%s\t%s\t%d\t%d\t%d\t%c\n", fName, lName, m1, m2, fin, grade);
     }
     
     double m1Average = computeAverage(m1Scores);
     double m2Average = computeAverage(m2Scores);
     double finAverage = computeAverage(finScores);
     
     writer.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", m1Average, m2Average, finAverage);
     
      
     writer.close();
     outputStream.close();
      
   }
}