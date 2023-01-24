package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 게임을 만든 동준이
 *  1. 레벨수 N 입력받음
 *  2. 크기가 N인 배열에  레벨별 경험치 입력받음
 *  3. 마지막 값부터 시작하여 이전값을 비교해서 이전값의 값이마지막값보다 작아지게 1씩 줄이는것을 count함.
 *  4. 최종 count값 출력
 */
public class Problem_02847_retry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = N - 1; i > 0; i--) {
			while(true) {
				if(arr[i] <= arr[i - 1]) {
					arr[i - 1]--;
					count++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
