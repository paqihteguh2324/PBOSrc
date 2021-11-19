package week9_2;


import java.util.*;

public class AvengedSimulator {
	public static void addSuperHero(List<SuperHero> s,String name,int level,String hero) {
		SuperHero temp = null;
		switch(hero) {
			case "FlyingDutchMan":
				temp = new FlyingDutchMan(level, name);
				break;
			case "ManRay":
				temp = new ManRay(level, name);
				break;
			case "DirtyBubble":
				temp = new DirtyBubble(level, name);
				break;
		}
		s.add(temp);
	}
	
	public static void main(String[] args) {
		 List<SuperHero> superhero = new ArrayList<SuperHero>();
		 addSuperHero(superhero, "Gennichiro", 0, "ManRay");
		 addSuperHero(superhero, "Shirai", 255, "FlyingDutchMan");
		 addSuperHero(superhero, "Gyoubu Masataka Oniwa", 553, "ManRay");
		 addSuperHero(superhero, "Arnastria", 666, "DirtyBubble");
		 addSuperHero(superhero, "Tatenari", 36556, "FlyingDutchMan");
		 for (SuperHero heroes : superhero) {
			 System.out.println("===============================");
			 heroes.identity();
			 heroes.showPowers();
			 System.out.println("===============================");
		 }
		 
	}
}