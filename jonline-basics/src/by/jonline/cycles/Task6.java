package by.jonline.cycles;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		char b;
		while (true) {
			System.out.println("Введите символ или exit для выхода");
			a = input.next();

			if (a.equals("exit")) {
				break;
			}
			b = a.charAt(0);
			int c = b;
			System.out.println("Код символа " + c);

		}
		input.close();
	}

}
