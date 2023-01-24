package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 수들의 합
 *  1. 자연수 S입력받는다.
 *  2. S를 만들 수 있는 서로다른 자연수 N을 구한.
 */
public class Problem_01789 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		int N = 0;
		int sum = 0, i = 1, count = 0;
		
		while(S >= sum) {
			sum += i;
			i++;
			count++;
		}
		System.out.println(count - 1);
	}

}
