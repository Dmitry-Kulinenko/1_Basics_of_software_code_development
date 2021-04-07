package by.jonline.linear;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 4
		double x1 = 123.456;
		double x2 = (int) x1; // выделяем целую часть
		double x3 = (x1 - x2) * 1000; // выделяем дробную часть
		x2 = x2 / 1000;
		double z4 = x3 + x2; // меняем местами
		System.out.printf("¹4 %1.3f \n", z4);
	}

}
