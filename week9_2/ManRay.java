package week9_2;

public class ManRay extends SuperHero {

	public ManRay(int powerLevel, String name) {
		super(powerLevel, name);
		addPower(new LaserEye());
        addPower(new Strength());;
	}

	@Override
	public void identity() {
		System.out.printf("It's %s, the ManRay! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");	
	}


}