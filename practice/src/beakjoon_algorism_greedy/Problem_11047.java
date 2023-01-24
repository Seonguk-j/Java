package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 동전 0
 *  1. 동전의 종류N개 입력받는다.
 *  2. 결과 K를 입력받는다.
 *  3. 동전의 가치를 입력받는다.
 *  4. K를 만들기 위한 최소한의 동전갯수를 구한다.
 *  5. 동전갯수를 출력한다.
 */
public class Problem_11047 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int coin[] = new int[N];
		for(int i = 0; i < N; i++) {
			coin[i] = scanner.nextInt();
		}
		
		int coinN[] = new int[N];
		for(int i = N - 1; i >= 0; i--) {
			if(K > coin[i]) {
				coinN[i] = K / coin[i];
				K = K % coin[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum = sum + coinN[i];
		}
		System.out.println(sum);
	}

}
