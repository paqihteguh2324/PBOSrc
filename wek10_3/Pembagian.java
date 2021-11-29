package wek10_3;

import java.util.Scanner;
public class Pembagian {
	
	
	
        public static void tanpaException(int pembilang, int pembagi) {
        System.out.println("Pembagian " + pembilang + "/" + pembagi + " adalah = " + (pembilang/pembagi));
    }


        public static void Exception(int pembilang, int pembagi) {
        try {
            System.out.println("Pembagian " + pembilang + "/" + pembagi + " adalah = " + (pembilang/pembagi));
        }
        catch (Exception e) {
            System.out.println("pembagi tidak boleh angka nol!!" );
        	}
        }
        
        public static void main(String [] args) {
        	int pembilang, pembagi;
        	Scanner input = new Scanner(System.in);
            System.out.print("Masukkan angka pembilang = ");
            pembilang = input.nextInt();
            System.out.print("Masukkan angka pembagi = ");
            pembagi = input.nextInt();
            //tanpaException(pembilang,pembagi);
            Exception(pembilang,pembagi);
        }
}
