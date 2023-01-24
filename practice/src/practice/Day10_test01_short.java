package practice;

import java.util.Scanner;

public class Day10_test01_short {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i = 2; i <= N; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N=N/i;
			}
		}
	}

}
