package by.jonline.linear;

class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Task 3
		double x = Math.toRadians(35);
		double y = Math.toRadians(66);
		double z3 = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.printf("¹3 %1$.3f \n", z3);

	}

}
