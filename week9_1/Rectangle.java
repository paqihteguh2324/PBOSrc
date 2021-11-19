package week9_1;

public class Rectangle extends Shapes{ 
	private double length;
	private double width;
	public Rectangle(double length, double width) 
	{
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double area() 
	{
		return length*width;
	}
	
	public String toString()
	{
		return super.toString() + " of length " + this.length + " and width " + this.width;
	}
}
