import java.util.Scanner;

public class Day6_clac {

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
	
	public static int calc(int a, char operator, int b) {
		if(operator == '+') {
			return add(a, b);
		}
		else if(operator == '-') {
			return substract(a, b);
		}
		else if(operator == '*') {
			return multiple(a, b);
		}
		else if(operator == '/') {
			return (int)divide(a, b);
		}
		else {
			return -99999;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int b = scanner.nextInt();
	
		System.out.println(calc(a, operator, b));
	}

}
