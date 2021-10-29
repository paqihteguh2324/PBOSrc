package week7Kasus2;


public class Circle extends Shape {
	private double radius;
	
	Circle(){
		super();
		this.radius = 1.0;
	}	
	
	Circle(double radius){
		super();
		this.radius = radius;
	}	
	
	Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*Math.PI*radius;
	}
	
	public String toString() {
		return "A Circle with radius=" + getRadius() + ", which is subclass of \n" + super.toString();
	}
}