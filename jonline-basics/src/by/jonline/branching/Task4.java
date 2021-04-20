/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 * */

package by.jonline.branching;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите размер A прямоугольного отверстия");
		int a = input.nextInt();
		System.out.println("Введите размер B прямоугольного отверстия");
		int b = input.nextInt();
		System.out.println("Введите размер X кирпича ");
		int x = input.nextInt();
		System.out.println("Введите размер Y кирпича");
		int y = input.nextInt();
		System.out.println("Введите размер Z кирпича");
		int z = input.nextInt();

		if (((x < a) && (y < b)) || ((x < b) && (y < a)) || ((x < a) && (z < b)) || ((x < b) && (z < a))
				|| ((y < a) && (z < b)) || ((y < b) && (z < a))) {
			System.out.println("Кирпич пройдёт через отверстие");
		} else {
			System.out.println("Кирпич не пройдёт через отверстие");
		}
	}

}
