package robotPackage;

public class Person {
	private String name;
	private String personality;
	private boolean isSitting; 
	protected Robot robotOwned; // Robot's Relationship
	
	public Person(String Name, String Personality, boolean IsSitting)
	{
		this.name = Name;
		this.personality = Personality;
		this.isSitting = IsSitting;
	}
	
	public void sitDown()
	{
		this.isSitting = true;
	}
	
	public void standUp()
	{
		this.isSitting = false;
	}
}
