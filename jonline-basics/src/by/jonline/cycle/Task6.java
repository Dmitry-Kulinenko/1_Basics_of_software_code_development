/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * 
 * */

package by.jonline.cycle;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String a;
		System.out.println("Введите строку");

		a = input.next();

		for (int i = 0; i < a.length(); i++) {

			System.out.println("Код символа " + a.charAt(i) + " - " + +(int) a.charAt(i));

		}

	}

}
