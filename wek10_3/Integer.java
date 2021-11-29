package wek10_3;

import java.util.Scanner;

//public class Integer {
//    public static void main(String [] args) {
//        int inputan;
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("masukkan inputan : ");
//        inputan = keyboard.nextInt();
//    }
//}

public class Integer {
    public static void main(String [] args) {
        int inputan;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("masukkan inputan : ");
            inputan = keyboard.nextInt();
        }
        catch (Exception e) {
            System.out.println("inputan hanya boleh bilangan integer!");
        }
    }
}