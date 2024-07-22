/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/21/2024
 * 
 * 10.9 LAB: Students (generic class)
 * 
 * This class implements a comparable Class. Using the two private fields, the class overrides both the 
 * compareTo and toString methods. The compareTo methods compares the department and number fields
 * in that order of precedence, returning a 1, 0, or -1 depending on those comparisons. to String returns
 * a string formatted as the department and number separated by a comma.
 */
public class Course implements Comparable<Course>{
	private String department;
	private Integer number;
	
	
	
	/**
	 * A constructor for a Course object
	 * @param dept
	 * @param num
	 */
	public Course(String dept, int num) {
		department = dept;
		number = num;
		
	}
	
	
	/**
	 * Overrides the compare to method to compare the department and number fields
	 */
	@Override
	public int compareTo(Course otherCourse) {
		int comparison = department.compareTo(otherCourse.department);
		if (comparison == 0) {
			return number.compareTo(otherCourse.number);
		}
		return comparison;
		
	}
	
	
	
	
	/**
	 * Overrides the toString method and returns a specially formatted string
	 */
	@Override
	public String toString() {
		return department + " " + number; 
	}
}
