import java.util.Scanner;

public class Day6_test01 {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int substract(int a, int b) {
		return a - b;
	}
	
	public static int multiple(int a, int b) {
		return a * b;
	}
	
	public static double divide(int a, int b) {
		return (double)a / (double)b;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(add(5,5));
		System.out.println(substract(5,8));
		System.out.println(multiple(5,5));
		System.out.println(divide(12,5));
	}

}
