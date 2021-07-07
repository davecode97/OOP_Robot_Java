// David
// Guadalajara, Mex 2020
package robotPackage;

public class Main {

	public static void main(String[] args) {
		// -------- R O B O T ------
		Robot r1 = new Robot("Tom", "Red", 30);
		Robot r2 = new Robot("Jerry", "Blue", 40);
		
		r1.introduceSelf();
		r2.introduceSelf();
		
		// -------- P E R S O N --------
		Person p1 = new Person("Alice", "Agressive", false);
		Person p2 = new Person("Becky", "Talkactive", true);
		
		// Relationship Person class with Robot class
		p1.robotOwned = r1;
		p2.robotOwned = r2;
		
		// Calling the person's relationship in Robot class
		p1.robotOwned.introduceSelf();
		p2.robotOwned.introduceSelf();
		
		/*
		 * If we want to follow someone like Instagram or Facebook
		 * The we could do it's to create an object as an atributte at the 
		 * Robot class and then class the object as follows:
		 */
		
		r1.LokingAt = r2;
		r2.LokingAt = r1;
	}

}
