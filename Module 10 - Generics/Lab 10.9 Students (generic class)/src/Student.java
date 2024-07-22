/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/21/2024
 * 
 * 10.9 LAB: Students (generic class)
 * 
 * This class implements a comparable Class. Using the three private fields, the class overrides both the 
 * compareTo and toString methods. The compareTo methods compares the GPA, last name, and first name fields
 * in that order of precedence, returning a 1, 0, or -1 depending on those comparisons
 */

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private Double GPA;
	
	
	
	
	/**
	 * A constructor for a Student object
	 * @param first
	 * @param last
	 * @param gradeAverage
	 */
	public Student(String first, String last, double gradeAverage) {
		firstName = first;
		lastName = last;
		GPA = gradeAverage;
	}
	
	
	
	
	
	/**
	 * Overrides the compareTo method to compare the GPA, LastName, and firstName
	 */
	@Override
	public int compareTo(Student otherStudent) {
		int gpaComparison = GPA.compareTo(otherStudent.GPA);
		if (GPA < otherStudent.GPA) {
			return 1;
		}
		else if (GPA > otherStudent.GPA) {
			return -1;
		}
		
        int lastNameComparison = lastName.compareTo(otherStudent.lastName);
        if (lastNameComparison != 0) {
        	return lastNameComparison;
        }
        return firstName.compareTo(otherStudent.firstName);
        
	}
	
	
	
	
	/**
	 * Overrides the toString method to return a specially formatted String.
	 */
	public String toString() {
		return String.format("%.2f %s, %s", GPA, lastName, firstName);
	}
}
