/*
 * Найти max{min(a, b), min(c, d)}
 * */

package by.jonline.branching;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите A");
		int a = input.nextInt();
		System.out.println("Введите B");
		int b = input.nextInt();
		System.out.println("Введите C");
		int c = input.nextInt();
		System.out.println("Введите D");
		int d = input.nextInt();

		int minAB = 0;
		int minCD = 0;

		if (a < b) {
			minAB = a;
		} else {
			minAB = b;
		}
		if (c < d) {
			minCD = c;
		} else {
			minCD = d;
		}

		if (minAB > minCD) {
			System.out.println("Ответ " + minAB);
		} else {
			System.out.println("Ответ " + minCD);
		}

	}

}
