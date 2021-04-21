/*Составить программу нахождения произведения квадратов первых двухсот чисел.*/

package by.jonline.cycle;

public class Task4 {

	public static void main(String[] args) {

		long s = 1;
		for (int i = 0; i < 200; i++) {
			s += (Math.pow(s, 2));
		}
		System.out.println(s);

	}

}
