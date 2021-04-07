package by.jonline.cycles;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Ведите первое число");
		int a = input.nextInt();
		System.out.println("Ведите второе число");
		int b = input.nextInt();
		int c1 = 10;
		int c2 = 1;
		int mod1 = 1;

		int mod2 = 1;
		int counter = 1;

		input.close();

		while ((a != 0) || (b != 0)) {
			mod1 = a % c1;
			a -= mod1;
			if (mod1 != 0) {
				System.out.printf("Разряд %d >> %d", counter, mod1 / c2);
			}

			mod2 = b % c1;
			b -= mod2;
			if (mod2 != 0) {
				System.out.println("  " + mod2 / c2);
			}

			c1 *= 10;
			c2 *= 10;
			counter++;

		}
	}

}
