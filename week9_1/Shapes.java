package week9_1;

public abstract class Shapes {
	protected String shapeName;
	protected double _area;
	
	public Shapes(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public double area() {
		return _area;
	}
	public String toString() {
		return shapeName;
	}
}
