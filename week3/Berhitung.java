package week3;
import java.util.*;
public class Berhitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String OPERATOR;
		int jml=0;
		float A, B,jmlbagi=0;
		
		System.out.println("minimal input 1 dan maksimal input 1000");
		A = keyboard.nextFloat();
		OPERATOR = keyboard.next();
		B = keyboard.nextFloat();
		
		while(jml==0 && jmlbagi==0) {
		   if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
			     switch (OPERATOR){
		             	case "+" : jml = (int)(A+B);
		             				break; // Penjumlahan
		             	case "/" : jmlbagi =A/B;
		             				break; // Pembagian
		             	case "*" : jml = (int)(A*B);
		             				break; // perkalian
		             	case "-" : jml = (int)(A-B);	
		             				break; // pengurangan
		             	case "%" : jml = (int)(A%B);
		             				break; // sisa bagi
		             	default : System.out.println("Tidak Ada");
		       	     }
		         } else {
		        	 System.out.println("Tidak bisa, angka kurang dari 1 atau lebih dari 1000");
		         }
		}
		         if(jml==0) {
		        	 System.out.println(jmlbagi);
		         }else{
		        	 System.out.println(jml);
		        	 
		         }
		    }
			

	}
