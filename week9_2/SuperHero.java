package week9_2;


import java.util.ArrayList;
import java.util.List;

public abstract class SuperHero {
	protected int powerLevel;
	protected String name;
	protected List<Power> powerList;
	
	public SuperHero(int powerLevel,String name) 
	{
		this.powerLevel = powerLevel;
		this.name = name;
		this.powerList = new ArrayList<Power>();
	}

	public int getPowerLevel() 
	{
		return powerLevel;
	}

	public String getName() 
	{
		return name;
	}
	
	public void addPower(Power power)
	{
		powerList.add(power);
	}
	
	public abstract void identity();
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for (Power temp : powerList) {
			temp.doPower();
		}
	};
}
