/*
 *Antonio Edwards
 *CIS 255 Summer 2024
 *Instructor Dave Harden
 *7/7/2024
 *
 *Lab 7.26: Artwork label (classes/constructors)
 *
 *This Artwork class creates an Artwork object consisting of three fields. Those fields are title, yearCreated, and 
 *artist. The title and yearCreated fields have getters, and are set through the use of multiple constructors. Overloading 
 *the constructor creates functionality that allows for setting the values of these fields, including the Artist type field.
 */
public class Artwork {
   // TODO: Declare private fields - title, yearCreated
	private String title;
	private int yearCreated;
	
   
   // TODO: Declare private field artist of type Artist 
	private Artist artist;

	
	
	
	
	
   // TODO: Define default constructor
	/**
	 * Default constructor
	 */
	public Artwork() {
		title = "unknown";
		yearCreated = -1;
	}
   
	
	
	
	
	
   /**
    * 
    * @return title field
    */
	public String getTitle() {
		return title;
	}
	
	
	
	
	/**
	 * 
	 * @return yearCreated field
	 */
	public int getYearCreated() {
		return yearCreated;
	}

	
	
	
	
	
   // TODO: Define second constructor to initialize 
   //       private fields (title, yearCreated, artist)
	/**
	 * Sets the params to their respective fields
	 * @param title
	 * @param yearCreated
	 * @param artist
	 */
	public Artwork(String title, int yearCreated, Artist artist) {
		this.title = title;
		this.yearCreated = yearCreated;
		this.artist = artist;
	}
	
	
	
	
	/**
	 * Uses the artist method printInfo to print the information
	 * of the artist, then outputs the title and year it was created
	 */
	public void printInfo() {
		artist.printInfo();
		System.out.printf("Title: %s, %d\n", title, yearCreated);
	}
                                                                                          

   }

