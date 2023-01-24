package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 저울
 *  1. N입력받음.
 *  2. N크기의 배열 입력받음.
 *  3. 배열 정렬.
 *  4. 누적합 + 1보다 arr[i]가 더크면 안됨.
 *  5. 누적합 + 1 출력
 */
public class Problem_02437 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int weight = 1;
		for(int i = 0; i < N; i++) {
			if(weight >= arr[i]) {
				weight += arr[i];
			}
			else {
				break;
			}
		}
		System.out.println(weight);
	}

}
