package week10_2;

import java.util.*;

public class Hexadecimal {
    public static int IntHexadecimal(String hex) {
        try {
            return Integer.parseInt(hex,16);
        } catch (Exception e) {
            System.out.println("inputan bukan hexadecimal!!");
            return 0;
        }
    }
    public static String inputHex() {
        String hex=null;
        try (Scanner sc = new Scanner(System.in)) {
            if (true) {
                System.out.print("Masukkan bilangan hexadecimal : ");
                hex = sc.next();
                int cek = IntHexadecimal(hex);
                System.out.println( "hasil : " +cek);
            }
        }
        return "Exit";
    }

    public static void main(String[] args) {
        inputHex();
    }
}