/*
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 */
package by.jonline.linear;

public class Task2 {

	public static void main(String[] args) {

		float a = 3.5f;
		float b = 4.1f;
		float c = 5.8f;
		double z;

		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.printf("z = %1$.3f \n", z);

	}

}
