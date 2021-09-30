package week3;
import java.util.*;
public class BukaTutupjalan {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		
		int plat1, plat2, plat3, plat4;
		String gabung;
		
		plat1 = keyboard.nextInt();
		plat2 = keyboard.nextInt();
		plat3 = keyboard.nextInt();
		plat4= keyboard.nextInt();
		
		
		gabung = String.valueOf(plat1) + String.valueOf(plat2) + String.valueOf(plat3) + String.valueOf(plat4);
	
		long semuaplat = Long.parseLong(gabung);
		//System.out.println(pengurangan);
		semuaplat = semuaplat - 999999;
		//System.out.println(kurang);
		byte modulo = (byte)(semuaplat % 5);
		//System.out.println(modulo);
		
		if (modulo == 0) {
			System.out.println("Berhenti");
		}
		else if (modulo != 0) {
			System.out.println("Jalan");
		}
	}
}

