/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/11/2024
 * 
 * Lab 8.16: Instrument information
 * 
 * This class is a derived class of the Instrument class. Since the Instrument class is a
 * concrete class, there is no need to override its defined methods. However, since String Instrument 
 * has its own set of unique fields, defining accessor and mutator methods for each field is necessary.
 */
public class StringInstrument extends Instrument {

	private int numOfStrings;
	
	private int numOfFrets;
	
	private boolean isBowed;

   
	/**
	 * Sets the numOfStrings field
	 * @param num value to be set
	 */
	public void setNumOfStrings(int num) {
		numOfStrings = num;
	}
	
	
	
	
	/**
	 * Sets the numOfFrets field
	 * @param num value to be set
	 */
	public void setNumOfFrets(int num) {
		numOfFrets = num;
	}
	
	
	
	
	/**
	 * Sets the isBowed field
	 * @param val value to be set
	 */
	public void setIsBowed(boolean val) {
		isBowed = val;
	}

	
	
	
	
	/**
	 * 
	 * @return numOfStrings field
	 */
	public int getNumOfStrings() {
		return numOfStrings;
	}
	
	
	
	
	
	/**
	 * 
	 * @return numOfFrets field
	 */
	public int getNumOfFrets() {
		return numOfFrets;
	}
	
	
	
	
	/**
	 * 
	 * @return isBowed field
	 */
	public boolean getIsBowed() {
		return isBowed;
	}

}

