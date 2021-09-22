package AplikasiGrade;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {	
	float  Ntugas=101, NUTS=101, NUAS=101, grade;
	byte hasil;
	String nama;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("===================================");
	System.out.print("Nama              : ");
	nama = keyboard.next();
	
	 do{
	System.out.print("input nilai tugas : ");
	Ntugas = keyboard.nextFloat();
	}while(Ntugas<0.0 || Ntugas>100.0);
	
	 do {
	System.out.print("input nilai UTS   : ");
	NUTS = keyboard.nextFloat();
	}while(NUTS<0.0 || NUTS>100.0);
	
	 do{
	System.out.print("input nilai UAS   : ");
	NUAS = keyboard.nextFloat();
	}while(NUAS<0.0 || NUAS>100.0);
	
	System.out.println("===================================");
	grade= Ntugas/100*20+NUTS/100*35+NUAS/100*45;
	hasil= (byte)grade;
	System.out.printf(" \nnilai %d \n", hasil);
	if(grade > 85) {
		System.out.println("***********");
		System.out.println("* Grade A *");
		System.out.println("***********");
	}else if(grade>= 75 && grade <= 84){
		System.out.println("***********");
		System.out.println("* Grade B *");
		System.out.println("***********");
	}else if(grade>= 65 && grade <= 74){
		System.out.println("***********");
		System.out.println("* Grade C *");
		System.out.println("***********");
	}else if(grade>= 49 && grade <= 64){
		System.out.println("***********");
		System.out.println("* Grade D *");
		System.out.println("***********");
	}else if(grade<50){
		System.out.println("***********");
		System.out.println("* Grade E *");
		System.out.println("***********");
	}
	System.out.println("===================================");
	
	}

}
