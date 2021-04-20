/*
 * Найти сумму квадратов первых ста чисел.
 */

package by.jonline.cycles;

public class Task3 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += (int) Math.pow(a, 2);
			a++;
		}
		System.out.println(sum);
	}

}
