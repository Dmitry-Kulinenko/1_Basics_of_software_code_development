package by.jonline.cycles;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task2
		Scanner input = new Scanner(System.in);
		System.out.println("Вевите начало отрезка a");
		int a = input.nextInt();
		System.out.println("Вевите конец отрезка b");
		int b = input.nextInt();
		System.out.println("Вевите конец шаг h");
		int h = input.nextInt();
		input.close();

		while (a <= b) {
			if (a <= 2) {
				System.out.println(a * (-1));
			} else {
				System.out.println(a);
			}
			a += h;
		}
	}

	public Task2() {
		// TODO Auto-generated constructor stub
	}

}
