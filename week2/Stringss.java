package week2;

import java.util.*;

public class Stringss {

    public static void main(String[] args) {

        String A,B;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Masukan kata pertama  : ");
        A=sc.next();
        
        System.out.print(" Masukan kata kedua    : ");
        B=sc.next();

        System.out.println(A.length()+B.length());
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.printf(A.substring(0,1).toUpperCase()+A.substring(1, A.length()));
        System.out.println(" " + B.substring(0,1).toUpperCase()+B.substring(1, B.length()));



    }


}
