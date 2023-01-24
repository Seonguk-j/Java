package practice;

import java.util.Scanner;

public class Day10_test01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		while(true) {
			int primaryNumber = 1;
						
			for(int i = 2; i <= N; i++) {
				if(N % i == 0) {
					primaryNumber = i;
					System.out.println(i);
					break;
				}
				else {
					continue;
				}
			}

			if(N == 1) {
				break;
			}
			
			N = N / primaryNumber;
		}
	}

}
