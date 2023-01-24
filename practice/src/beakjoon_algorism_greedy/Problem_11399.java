package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * ATM
 *  1. 돈을 뽑을 사람수를 입력받는다.
 *  2. Pi번째 사람이 출금하는데 걸리는 시간을 입력받는다.
 *  3. 출력하는데 걸리는 시간이 짧을수록 시간이 절약된다.(시간이 짧게 걸리는사람이 먼저 출력하도록 순서를 정한다.)
 *  4. 각 사람별로 소요되는 시간을 구한다.
 *  5. 시간의 합을 구한다.
 */
public class Problem_11399 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int P[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			P[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(P[i] > P[j]) {
					int temp = P[i];
					P[i] = P[j];
					P[j] = temp;
				}
			}
		}
		
		int sum = P[0];
		for(int i = 0; i < N - 1; i++) {
			sum = P[i+1] + sum;
			P[i+1] = sum;
		}
		
		int total = 0;
		for(int i = 0; i < N; i++) {
			total = P[i] + total;
		}
		
		System.out.println(total);
	}

}
