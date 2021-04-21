/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен 
 * заданному е. Общий член ряда имеет вид*/

package by.jonline.cycle;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Ведите e");
		double e = input.nextDouble();

		int n = 1;
		double a = 0;
		double sum = 0;

		do {
			sum += a;
			a = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
			n++;
		} while (a >= e);

		System.out.printf("Ответ %.3f", sum);

	}

}
