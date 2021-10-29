package week7Kasus1;

public class Circle {
	private double radius;
	private String color;

	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}

	public Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}
	
	//task 1.1
	public Circle(double r, String n) {// 3rd constructor
		radius = r;
		color = n;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
		
	public void setRadius(double radius) {
			this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	//-------------------------------------------
	
	public double getArea() {	//Returns the area of this Circle instance
		return radius*radius*Math.PI;
	}

	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}