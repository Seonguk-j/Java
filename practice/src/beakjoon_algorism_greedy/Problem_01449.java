package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 수리공 항승
 *  1. 물새는곳의 갯수 N, 테이프길이 L입력받는다.
 *  2. 크기가 N인 배열에 위치 입력받는다.
 *  3. 위치들을 비교하여 먼곳 - 가까운곳 + 1이 L보다 클경우 count해준다.
 *  4. count값을 출력한다.
 */
public class Problem_01449 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		int count = 1;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr[j] - arr[i] + 1 > L) {
					count++;
					i = j;
				}
			}
		}
		System.out.println(count);
	}

}
