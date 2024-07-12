/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/12/2024
 * 
 * Lab 8.18: Course Information
 * 
 * This class, Course, serves as a base class of the OfferedCourse class, which implies that OfferCourse inherits all members of 
 * this class. Course defines 2 fields and setters and getters for each. It then uses these fields to define a method named 
 * "printInfo" that prints out lines of information corresponding to each field.
 */
public class Course{
   // TODO: Declare private fields
	private String courseNumber;
	
	private String courseTitle;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
	/**
	 * Sets the courseNumber field
	 * @param num String value to be set
	 */
	public void setCourseNumber(String num) {
		courseNumber = num;
	}
	
	
	
	
	/**
	 * Sets the courseTitle field
	 * @param title String value to be set
	 */
	public void setCourseTitle(String title) {
		courseTitle = title;
	}


   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
	/**
	 * 
	 * @return courseNumber field
	 */
	public String getCourseNumber() {
		return courseNumber;
	}
	
	
	
	
	/**
	 * 
	 * @return courseTitle field
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	
	
	
   // TODO: Define printInfo()
	/**
	 * Prints a line of output corresponding to each field
	 */
	public void printInfo() {
		System.out.println("Course Information:");
		System.out.println("   Course Number: " + courseNumber);
		System.out.println("   Course Title: " + courseTitle);
	}
 
}
