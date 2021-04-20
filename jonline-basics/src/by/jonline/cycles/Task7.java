/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 * 
 * */
package by.jonline.cycles;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите начало промежутка m");
		int m = input.nextInt();
		System.out.println("Введите конец промежутка n");
		int n = input.nextInt();

		int i = 2;
		while (m <= n) {
			if ((m % 2 == 0 || m % 3 == 0 || m % 5 == 0) && m != 2 && m != 3 && m != 5) {
				System.out.printf("\nЧисло %d \nЕго делители ", m);
				while (m > i) {
					if (m % i == 0) {
						System.out.print(" | " + i);
					}
					i++;
				}
			}
			i = 2;
			m++;
		}
	}
}
