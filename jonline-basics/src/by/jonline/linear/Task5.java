/*
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc
 */
package by.jonline.linear;

public class Task5 {

	public static void main(String[] args) {

		double T = 5250;
		double HH = Math.floor(T / 1200);
		double MM = Math.floor((T / 1200 - HH) * 60);
		double SS = ((T / 1200 - HH) * 60 - MM) * 60;
		System.out.printf("%1$.0f сек = %2$.0fч %3$.0fмин %4$.0fс\n", T, HH, MM, SS);
	}

}
