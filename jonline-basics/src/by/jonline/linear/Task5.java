package by.jonline.linear;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 5
		double T = 5250;
		double HH = Math.floor(T / 1200);
		double MM = Math.floor((T / 1200 - HH) * 60);
		double SS = ((T / 1200 - HH) * 60 - MM) * 60;
		System.out.printf("№5 %1$.0fч %2$.0fмин %3$.0fс\n", HH, MM, SS);
	}

}
