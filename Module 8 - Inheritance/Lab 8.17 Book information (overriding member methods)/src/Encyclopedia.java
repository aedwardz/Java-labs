/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/11/2024
 * 
 * Lab 8.17: Book information
 * 
 * This Encyclopedia class is a derived class of the book class, that has its own private fields and
 * methods. Therefore, Encyclopedia inherits those fields and methods. Out of all members of the 
 * book class, it overrides the printInfo method by using the "super" keyword to call the defined 
 * version of its base class, then adding two additional lines
 */
public class Encyclopedia extends Book {
   // TODO: Declare private fields
	private String edition;
	
	private int numPages;
  
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
	/**
	 * Sets the edition field
	 * @param edition value to be set
	 */
   public void setEdition(String edition) {
	   this.edition = edition;
   }
   
   
   
   
   /**
    * Sets the numPages field
    * @param pages value to be set
    */
   public void setNumPages(int pages) {
	   numPages = pages;
	   
   }
  
   
   
   // TODO: Define accessor methods -
   //       getEdition(), getNumPages()
   /**
    * 
    * @return edition field
    */
   public String getEdition() {
	   return edition;
   }
   
   
   
   
   /**
    * 
    * @return numPages field
    */
   public int getNumPages() {
	   return numPages;
   }
   
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class
   
   /**
    * Overrides the printInfo method of the book class 
    */
   @Override
   public void printInfo() {
	   super.printInfo();
	   System.out.println("   Edition: " + edition);
	   System.out.println("   Number of Pages: " + numPages);
	   
   }
   
}