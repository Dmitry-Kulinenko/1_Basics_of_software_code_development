/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */

package by.jonline.linear;

public class Task4 {

	public static void main(String[] args) {

		double x1 = 123.456;
		double x2;
		double x3;
		double z;

		x2 = (int) x1; // выделяем целую часть
		x3 = (x1 - x2) * 1000; // выделяем дробную часть
		x2 = x2 / 1000;
		z = x3 + x2; // меняем местами

		System.out.printf("z = %1.3f \n", z);
	}

}
