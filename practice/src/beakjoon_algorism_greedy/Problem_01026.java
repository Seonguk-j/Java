package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 보물
 *  1. 길이N 입력받는다.
 *  2. 배열 A 입력받느다.
 *  3. 배열 B 입력받는다.
 *  4. 함수 S가 최소가 되도록 A의 배열을 재배열한다.(B는 움직일수 없다.)
 *  5. 함수 S의 결과를 출력한다.
 */
public class Problem_01026 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = scanner.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum = sum + A[i] * B[N - 1 - i];
		}
		
		System.out.println(sum);
	}

}
