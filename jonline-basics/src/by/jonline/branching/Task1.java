package by.jonline.branching;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// Ветвления
		// Task 1
		Scanner input = new Scanner(System.in);
		System.out.println("Введите первый угл треугольника");
		int angle1 = input.nextInt();
		System.out.println("Введите первый угл треугольника");
		int angle2 = input.nextInt();
		input.close();
		if ((angle1 + angle2) < 180) {
			System.out.println("Такой треугольник существует");
			if (angle1 + angle2 == 90)
				System.out.println("Этот треугольник прямоугольный");
		} else
			System.out.println("Такого треугольника не существует");

	}
}