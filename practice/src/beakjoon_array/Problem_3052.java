package beakjoon_array;

import java.util.Scanner;

/*
 * 나머지
 * 1. 숫자 10개를 입력받는다.
 * 2. 42로 나눈 나머지값을 구한다.
 * 3. 나머지값들을 비교하여 서로다른 나머지가 몇가지인지 구한다.
 */
public class Problem_3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N[] = new int[10];
		for(int i = 0; i < N.length; i++) {
			N[i] = scanner.nextInt();
		}
		
		int remain[] = new int[10];
		for(int i = 0; i < N.length; i++) {
			remain[i] = N[i] % 42;
		}
		
		int count[] = new int[10];
		for(int i = 0; i < N.length - 1; i++) {
			for(int j = i + 1; j < N.length; j++) {
				if(remain[i] != remain[j]) {
					count[i]++;
				}
			}
		}
		
		int output = 0;
		for(int i = 0; i < N.length; i++) {
			if(count[i] == 9 - i) {
				output++;
			}
		}
		System.out.println(output);
	}

}
