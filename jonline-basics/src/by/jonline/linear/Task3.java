/*
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 */
package by.jonline.linear;

class Task3 {

	public static void main(String[] args) {

		double x = Math.toRadians(35);
		double y = Math.toRadians(66);
		double z;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.printf("z = %1$.3f \n", z);

	}

}
