package week9_2;

public class ManRay extends SuperHero {

	public ManRay(int powerLevel, String name) {
		super(powerLevel, name);
		// TODO Auto-generated constructor stub
		Power laser = new LaserEye();
		Power strength=new Strength();
		addPower(laser);
		addPower(strength);
	}

	@Override
	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the ManRay! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");	
	}


}