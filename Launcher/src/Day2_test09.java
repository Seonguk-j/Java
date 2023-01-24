import java.util.Scanner;

public class Day2_test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
