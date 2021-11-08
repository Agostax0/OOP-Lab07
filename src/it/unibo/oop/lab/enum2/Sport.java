/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
	
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(5,Place.INDOOR, "Basket"),
	VOLLEY(6,Place.INDOOR, "Volley"),
	TENNIS(1,Place.OUTDOOR,"Tennis"),
	BIKE(1,Place.OUTDOOR,"Bike"),
	F1(1,Place.OUTDOOR,"F1"),
	MOTOGP(1,Place.OUTDOOR,"MotoGp"),
	SOCCER(11,Place.OUTDOOR,"Soccer");
	
	private int players;
	private Place place;
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	
	final String actualName;
	
	Sport(int players, Place place, final String actualName) {
		this.place = place;
		this.players = players;
		this.actualName = actualName;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport(Sport sport) {
		return sport.players==1;
	}
	
	public boolean isIndoorSport(Sport sport) {
		return sport.place==Place.INDOOR;
	}
	
	public Place getPlace(Sport sport) {
		return sport.place;
	}
	
	public String ToString() {
		return this.actualName+"is a "+this.players+"sport and it is played:"+(this.place == Place.INDOOR ? "Indoor" : "Outdoor");
	}
}
