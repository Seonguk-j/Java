package beakjoon_repeat;

import java.util.Scanner;

public class Problem_2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num >= 1 && num <= 9) {
			for(int i = 1; i <= 9; i++) {
				int output = num * i;
				System.out.println(num + " * " + i + " = " + output);
			}
		}
	}

}
