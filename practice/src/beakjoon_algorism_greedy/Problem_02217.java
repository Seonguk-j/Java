package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 로프
 *  1. 로프의 수 N을 입력받는다.
 *  2. 각 로프에 걸릴 수 있는 중량을 입력받는다.
 *  3. 가장 적은 중량을 버틸수있는 로프의 중량을 찾는다.
 *  4. 로프의 수N 과 최소 중량을 곱한다.
 */
public class Problem_02217 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int W[] = new int[N];
		for(int i = 0; i < N; i++) {
			W[i] = scanner.nextInt();
		}
		
		Arrays.sort(W);
		System.out.println(N * W[0]);
	}

}
