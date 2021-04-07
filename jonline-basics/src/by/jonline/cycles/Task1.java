package by.jonline.cycles;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		Scanner input = new Scanner(System.in);
		System.out.println("Введите любое целое положительное число");
		int in = input.nextInt();
		input.close();
		int sum = 0;
		int a = 1;
		for (int i = 0; i < in; i++) {
			sum += a++;

		}
		System.out.println("Ответ: " + sum);
	}

}
