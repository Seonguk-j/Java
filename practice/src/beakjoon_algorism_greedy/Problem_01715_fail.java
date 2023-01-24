package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 카드배열
 *  1. 비교할 카드종류를 입력받는다.
 *  2. 각 카드별 수량을 입력받는다.
 *  3. 카드 수량을기준으로 오름차순 정렬한다.
 *  4. 가장 적은 수의 카드 두개를 합한다.
 *  5. 3~4를 반복하여 N-1번째까지 구해진 배열들을 합하여 최종값을 구한다.
 */
public class Problem_01715_fail {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 0; i < N - 1; i++) {
			Arrays.sort(arr);
			arr[i+1] = arr[i+1] + arr[i];
			arr[i] = arr[i + 1];
		}
		
		int sum = 0;
		for(int i = 0; i < N - 1; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
