package by.jonline.cycles;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter e");
		double e = input.nextDouble();
		input.close();
		int n = 1;
		double a = 0;
		double sum = 0;

		do {
			sum += a;
			a = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
			n++;
		} while (a >= e);
		System.out.printf("Answer is %.3f", sum);

	}

}
