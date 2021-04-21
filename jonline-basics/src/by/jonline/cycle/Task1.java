/*
 * Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * 
 * */

package by.jonline.cycle;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите любое целое положительное число");
		int in = input.nextInt();

		int sum = 0;
		int a = 1;
		for (int i = 0; i < in; i++) {
			sum += a++;

		}
		System.out.println("Ответ: " + sum);
	}

}
