package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 수 묶기
 *  1. N입력받기
 *  2. 배열에 수 입력받기
 *  3. 입력받은 수 오름차순 정렬
 *  4. 음수 갯수 구하기(0을 포함한)
 *  5. 1의 갯수 구하기
 *  6. 1을 제외한 양수의 갯수 구하기
 *  7. 음수의 조합에 대한 결과 함수 만들기
 *  8. 양수의 조합에 대한 결과 함수 만들기
 */
public class Problem_01744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int countMinus = 0;
		int countOne = 0;
		int countPlus = 0;
		
		for(int i = 0; i < N; i++) {
			if(arr[i] <= 0) {
				countMinus++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == 1) {
				countOne++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(arr[i] > 1) {
				countPlus++;
			}
		}
		
		int sumMinus = 0;
		if(countMinus % 2 == 0) {
			for(int i = 0; i < countMinus; i += 2) {
				sumMinus += arr[i] * arr[i + 1];
			}
		}
		else {
			for(int i = 0; i < countMinus - 1; i += 2) {
				sumMinus += arr[i] * arr[i + 1];
			}
			sumMinus = sumMinus + arr[countMinus - 1];
		}
		
		int sumPlus = 0;
		if(countPlus % 2 == 0) {
			for(int i = N - 1; i >= N - countPlus; i -= 2) {
				sumPlus += arr[i] * arr[i - 1];
			}
			sumPlus += countOne;
		}
		else {
			for(int i = N - 1; i > N - countPlus; i -= 2) {
				sumPlus += arr[i] * arr[i - 1];
				}
			sumPlus += countOne + arr[N - countPlus];
			}
		
		System.out.println(sumMinus + sumPlus);
	}

}
