package week3;
import java.util.*;
public class GajiAgent {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);		
		final int gajipokok = 500000;
		final int hargaItem = 50000;
		int penjualan, bonus, denda, gajiakhir = 0;
		
		penjualan = keyboard.nextInt();
		if (penjualan >= 80) {
			bonus = (penjualan * hargaItem) * (35/100);
			gajiakhir = gajipokok + bonus ;
			System.out.println(gajiakhir);
		} 
		else if (penjualan >= 40 && penjualan < 80) {
			bonus = (penjualan * hargaItem) * (25/100);
			gajiakhir = gajipokok + bonus;
			System.out.println(gajiakhir);
		}
		else if (penjualan <= 15 && penjualan >= 1) {
			denda = ((15 * hargaItem) - (14 * hargaItem)) * 15/100;
			gajiakhir = gajipokok - denda;
			System.out.println(gajiakhir);		}
		else {
			bonus = penjualan * (hargaItem * 10/100);
			gajiakhir = gajipokok + bonus;
			System.out.println(gajiakhir);		}
}
}
