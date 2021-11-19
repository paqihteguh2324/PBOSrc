package week9_1;


public class Paint {
	private double coverage; //number of square feet per gallon

	//-----------------------------------------
	// Constructor: Sets up the paint object.
	//-----------------------------------------
	public Paint(double c)
	{
		coverage = c;
	}

	//---------------------------------------------------
	// Returns the amount of paint (number of gallons)
	// needed to paint the shape given as the parameter.
	//---------------------------------------------------

	public double amount(Sphere s)
	{
		System.out.println ("Computing amount for " + s);
		return s.area()/coverage;
	}
	
	public double amount(Rectangle s)
	{
		System.out.println ("Computing amount for " + s);
		return s.area()/coverage;
	}
	
	public double amount(Cylinder s)
	{
		System.out.println ("Computing amount for " + s);
		return s.area()/coverage;
	}
}