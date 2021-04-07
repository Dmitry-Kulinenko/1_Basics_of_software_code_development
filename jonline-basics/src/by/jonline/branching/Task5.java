package by.jonline.branching;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 5
		Scanner input = new Scanner(System.in);
		System.out.println("Введите X");
		double x = input.nextDouble();
		input.close();
		if (x <= 3) {
			System.out.println("F(x)= " + (Math.pow(x, 2) - 3 * x + 9));

		} else
			System.out.println("F(x)= " + (1 / (Math.pow(x, 3) + 6)));

	}

}
