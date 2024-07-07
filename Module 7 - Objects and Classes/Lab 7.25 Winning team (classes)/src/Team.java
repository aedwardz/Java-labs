/**
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/5/2024
 * 
 * Lab 7.25: Winning team (classes)
 * 
 * This program creates a Team class with various fields and getters and setters for each field.
 * Additionally, the getWinPercentage uses the private fields to calculate a win percentage for the team,
 * using casting to return a double. Lastly, The printStanding method outputs a specially formatted string, using getWinPercentage
 * in the process
 */
public class Team {
   // TODO: Declare private fields - name, wins, losses
	private String name;
	private int wins;
	private int losses;
   
   
   // TODO: Define mutator methods - 
   //       setName(), setWins(), setLosses ()
	/**
	 * Sets the name field
	 * @param name a String 
	 */
   public void setName(String name) {
	   this.name = name;
   }
   
   
   
   
   
   /**
    * Sets the wins field
    * @param wins number of wins
    */
   public void setWins(int wins) {
	   this.wins = wins;
   }
   
   
   
   
   /**
    * Sets the losses field
    * @param losses the number of losses
    */
   public void setLosses(int losses) {
	   this.losses = losses;
   }
   
   
   
   
   /**
    * Returns the name field
    * @return String name
    */
   public String getName() {
	   return name;
   }
   
   
   
   
   /**
    * Returns the wins fiels
    * @return number of wins
    */
   public int getWins() {
	   return wins;
   }
   
   
   
   
   /**
    * Returns the losses field
    * @return the number of losses
    */
   public int getLosses() {
	   return losses;
   }
   
   
   
   
   /**
    * Calculates the win percentage based on wins and losses
    * @return double reprecenting the percentage of wins
    */
   public double getWinPercentage() {
	   return ((double) wins / (wins + losses));
   }
   
   
   
   
   /**
    * Prints a specially formatted string
    */
   public void printStanding() {
	   double percent = getWinPercentage();
	   System.out.printf("Win percentage: %.2f\n", percent);
	   if (percent >= 0.5) {
		   System.out.printf("Congratulations, Team %s has a winning average!\n", name);
	   }
	   else {
		   System.out.printf("Team %s has a losing average.\n", name);
	   }
	   
   }

   
}