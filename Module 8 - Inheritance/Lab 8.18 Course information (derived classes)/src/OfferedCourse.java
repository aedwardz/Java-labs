/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/12/2024
 * 
 * Lab 8.18: Course Information
 * 
 * This class, OfferedCourse, is a derived class of the Course class, which implies that it inherits all members of said class.
 * OfferredCourse defines three additional fields and setters and getters for each.
 */
public class OfferedCourse extends Course {
   // TODO: Declare private fields
	private String instructorName;
	
	private String location;
	
	private String classTime;
	

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
	/**
	 * Sets the instructorName field
	 * @param name value to be set
	 */
	public void setInstructorName(String name) {
		instructorName = name;
	}
	
	
	
	
	/**
	 * Sets the location field
	 * @param loc String value to be set
	 */
	public void setLocation(String loc) {
		location = loc;
	}
	
	
	
	
	/**
	 * Sets the classTime field
	 * @param time String value to be set
	 */
	public void setClassTime(String time) {
		classTime = time;
	}


   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
	/**
	 * 
	 * @return instructorName field
	 */
	public String getInstructorName() {
		return instructorName;
	}
	
	
	
	/**
	 * 
	 * @return location field
	 */
	public String getLocation() {
		return location;
	}
	
	
	
	
	/**
	 * 
	 * @return classTime field
	 */
	public String getClassTime() {
		return classTime;
	}
	
	
	


}