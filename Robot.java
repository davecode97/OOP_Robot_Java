package robotPackage;

public class Robot 
{
	private String name;
	private String color;
	private int weight;
	protected Robot LokingAt;
	
	public Robot(String Name, String Color, int Weight)
	{
		this.name = Name;
		this.color = Color;
		this.weight = Weight;
	}
	
	public void introduceSelf()
	{
		System.out.println("My name is "+this.name);
	}
}
