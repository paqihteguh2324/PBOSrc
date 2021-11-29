package week9_2;

public class DirtyBubble extends SuperHero {

	public DirtyBubble(int powerLevel, String name) {
		super(powerLevel, name);
		addPower(new Strength());
        addPower(new Flying());
	}

	@Override
	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the FlyingDutchMan! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");
	}

}
