/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 * 
 * */

package by.jonline.cycle;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		long a = in.nextLong();
		System.out.print("Введите второе число: ");
		long b = in.nextLong();
		int[] digits = new int[10];

		while (a != 0) {
			digits[(int) (a % 10)] = 1;
			a = a / 10;
		}

		while (b != 0) {
			int d = (int) (b % 10);
			digits[d] = digits[d] | 2;
			b = b / 10;
		}

		System.out.print("Общие цифры: ");
		for (int d = 0; d < 10; d++)
			if (digits[d] == 3)
				System.out.print(d);
		System.out.println();
	}

}
