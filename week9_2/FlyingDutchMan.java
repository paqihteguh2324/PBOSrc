package week9_2;

public class FlyingDutchMan extends SuperHero {

	public FlyingDutchMan(int powerLevel, String name) {
		super(powerLevel, name);
		 addPower(new Flying());
	     addPower(new LaserEye());
	}

	@Override
	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the FlyingDutchMan! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");		
	}

	
	
	
}
