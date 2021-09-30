package week3;

import java.util.*;

public class Inputdanoutput {

	public static void main(String[] args) {
		String s;
		Scanner keyboard = new Scanner(System.in);
		s = keyboard.nextLine();
		keyboard.close();
		s.trim();
		if(s.length()==0) {
			System.out.println("String kosong");
		}else {
			
			String[] data = s.split("[, !._?'@]");
			System.out.println(data.length);
			int i;
			for(i=0;i<=data.length-1 ;i++) {
				System.out.println(data[i]);
				}
			}
		
		
	}
}
