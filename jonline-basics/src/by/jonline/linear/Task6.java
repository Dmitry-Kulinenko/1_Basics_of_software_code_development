/*
 * Для данной области составить линейную программу, 
 * которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае:
 */
package by.jonline.linear;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите координату X");
		int x = input.nextInt();
		System.out.println("Введите координату Y");
		int y = input.nextInt();

		System.out.println((Math.abs(x) <= 2 && y >= 0 && y <= 4) || (Math.abs(x) <= 4 && y >= -2 && y <= 0));

	}

}
