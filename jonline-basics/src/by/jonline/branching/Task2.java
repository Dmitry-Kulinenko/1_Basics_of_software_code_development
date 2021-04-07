package by.jonline.branching;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 2
		Scanner input = new Scanner(System.in);
		System.out.println("Введите A");
		int a = input.nextInt();
		System.out.println("Введите B");
		int b = input.nextInt();
		System.out.println("Введите C");
		int c = input.nextInt();
		System.out.println("Введите D");
		int d = input.nextInt();
		input.close();
		int a1 = 0;
		int b1 = 0;
		if (a < b) {
			a1 = a;
		} else {
			a1 = b;
		}
		if (c < d) {
			b1 = c;
		} else {
			b1 = d;
		}
		if (a1 > b1) {
			System.out.println("Ответ " + a1);
		} else {
			System.out.println("Ответ " + b1);
		}

	}

}
