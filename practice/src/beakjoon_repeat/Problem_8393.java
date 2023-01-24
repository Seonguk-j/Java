package beakjoon_repeat;

import java.util.Scanner;

public class Problem_8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		
		if(N >= 1 && N <= 10000) {
			for(int i = 1; i <= N; i++) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
