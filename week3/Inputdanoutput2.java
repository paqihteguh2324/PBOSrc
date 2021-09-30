package week3;

import java.util.*;
public class Inputdanoutput2 {

	public static void main(String[] args) {
		String[] inistring;
		short[] iniinteger;
		inistring = new String[3];
		iniinteger = new short[3];
		Scanner scannan = new Scanner(System.in);
		
		
		inistring[0] = scannan.next();
		iniinteger[0] = scannan.nextShort();
		inistring[1] = scannan.next();
		iniinteger[1] = scannan.nextShort();
		inistring[2] = scannan.next();
		iniinteger[2] = scannan.nextShort();
		scannan.close();
		
		System.out.println("================================");
		int i;
		for(i=0;i<=2; i++) {
			
			System.out.printf("%-15s%03d\n", inistring[i], iniinteger[i]);
		}
		System.out.println("================================");
		
	}

}
