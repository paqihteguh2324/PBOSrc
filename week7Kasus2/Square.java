package week7Kasus2;


public class Square extends Rectangle{
	Square(){
		super();
	}
	
	Square(double side){
		super(side, side);
	}
	
	Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return getLenght();
	}
	
	public void setSide(double side) {
		setLenght(side);
		setWidth(side);
	}
	
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of\n" + super.toString();
	}
}