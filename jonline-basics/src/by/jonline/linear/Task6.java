package by.jonline.linear;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 6
		Scanner input = new Scanner(System.in);
		System.out.println("Введите координату X");
		int x = input.nextInt();
		System.out.println("Введите координату Y");
		int y = input.nextInt();
		input.close();
		System.out.println((Math.abs(x) <= 2 && y >= 0 && y <= 4) || (Math.abs(x) <= 4 && y >= -2 && y <= 0));

	}

}
