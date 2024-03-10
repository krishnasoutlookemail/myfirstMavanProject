package mavenPracticeProject;

public class Calculator {
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int product(int a, int b) {
		return a*b;
	}
	public static int quotient(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum of the given numbers is"+add(5,3));
		System.out.println("difference of the given numbers is"+subtract(5,3));
		System.out.println("product of the given numbers is"+product(5,3));
		System.out.println("quotient of the given numbers is"+quotient(15,3));
	}

}
