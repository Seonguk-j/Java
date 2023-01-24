package beakjoon_algorism_greedy;

import java.util.Scanner;

public class Problem_02839 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = N/5;
		
		if(N == 4 || N == 7) {
			System.out.println("-1");
		}
		else if(N%5 == 0) {
			System.out.println(count);
		}
		else if(N%5 == 1 || N%5 == 3) {
			System.out.println(count + 1);
		}
		else {
			System.out.println(count + 2);
		}

	}

}

