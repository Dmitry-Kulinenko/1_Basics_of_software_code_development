/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой.
 * */

package by.jonline.branching;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите X1 точки A");
		int x1 = input.nextInt();
		System.out.println("Введите Y1 точки A");
		int y1 = input.nextInt();
		System.out.println("Введите X2 точки B");
		int x2 = input.nextInt();
		System.out.println("Введите Y2 точки B");
		int y2 = input.nextInt();
		System.out.println("Введите X3 точки C");
		int x3 = input.nextInt();
		System.out.println("Введите Y3 точки C");
		int y3 = input.nextInt();

		if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
