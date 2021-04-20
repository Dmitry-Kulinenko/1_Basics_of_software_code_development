/*
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

package by.jonline.linear;

public class Task1 {

	public static void main(String[] args) {

		float a = 3.5f;
		float b = 4.1f;
		float c = 5.8f;
		float z;

		z = ((a - 3) * b / 2) + c;

		System.out.printf("z = %1$.3f \n", z);

	}

}
