package by.jonline.cycles;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger s = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			s = s.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(s);

	}

}
