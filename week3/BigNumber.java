package week3;
import java.util.*;
import java.math.BigInteger;
public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger A,B,C,D;
		Scanner keyboard = new Scanner(System.in);
		
		A=keyboard.nextBigInteger();
		B=keyboard.nextBigInteger();
		
		C=A.add(B);
		D=A.multiply(B);
		
		System.out.println(C);
		System.out.println(D);
		
	}

}
