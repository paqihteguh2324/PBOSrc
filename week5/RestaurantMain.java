package week5;

import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		byte x,y;
		boolean z=true;
		String a;
		Restaurant menu = new Restaurant();
		Scanner input = new Scanner(System.in);
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 30);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		while(z==true) {
				System.out.println();
				System.out.println("Masukan nomor menu :");
				x = input.nextByte();
				System.out.println("Masukan banyak pesanan :");
				y = input.nextByte();
				menu.pesanMenuMakanan(x, y);
				menu.tampilMenuMakanan();
				System.out.println("ingin jajan lagi [Y/N]: ");
				a = input.next();
			if(a=="N" || a=="n") {
				z=false;
			}
		}
	}

}