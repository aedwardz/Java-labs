/*
 *Antonio Edwards
 *CIS 255 Summer 2024
 *Instructor Dave Harden
 *7/7/2024
 *
 *Lab 7.26: Artwork label (classes/constructors)
 *
 *This Artist class creates an artist object consisting of three fields. Those fields are artistName, birthYear, and 
 *deathYear. Each of these fields have getters, and are set through the use of multiple constructors. Overloading 
 *the constructor creates functionality that allows for setting the values of these fields
 */

public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
	private String artistName;
	private int birthYear;
	private int deathYear;

   // TODO: Define default constructor
	/*
	 * A default constructor that sets default values for each field
	 */
	public Artist() {
		artistName = "unknown";
		birthYear = -1;
		deathYear = -1;
		
	}
	
	
	
	
	
	/**
	 * Constructor that sets the params, respectively
	 * @param name 
	 * @param bYear
	 * @param dYear
	 */
	public Artist(String name, int bYear, int dYear) {
		artistName = name;
		birthYear = bYear;
		deathYear = dYear;
	}

 
   
	
	
	
   /**
    * 
    * @return artistName field
    */
	public String getName() {
		return artistName;
	}
	
	
	
	
	/**
	 * 
	 * @return birthYear field
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	
	
	
	/**
	 * 
	 * @return deathYear field
	 */
	public int getDeathYear() {
		return deathYear;
	}
   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
	
	
	/**
	 * outputs a specially formatted string depending on the birth and death year
	 */
	public void printInfo() {
		System.out.printf("Artist: %s ", artistName);
		if (birthYear > -1 && deathYear > -1) {
			System.out.printf("(%d to %d)\n", birthYear, deathYear);
		}
		else if (birthYear > -1 && deathYear < 0 ) {
			System.out.printf("(%d to present)\n", birthYear);
		}
		else {
			System.out.println("(unknown)");
		}
	}

}