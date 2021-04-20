/*
 * Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
 */

package by.jonline.branching;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите первый угл треугольника");
		int angle1 = input.nextInt();
		System.out.println("Введите второй угл треугольника");
		int angle2 = input.nextInt();

		if ((angle1 + angle2) < 180) {
			System.out.println("Такой треугольник существует");
			if (angle1 + angle2 == 90)
				System.out.println("Этот треугольник прямоугольный");
		} else
			System.out.println("Такого треугольника не существует");

	}
}