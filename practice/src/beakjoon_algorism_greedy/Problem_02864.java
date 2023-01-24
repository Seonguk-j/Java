package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 5와 6의 차이
 *  1. String A, B입력받는다.
 *  2. A, B의 합이 최소가 되게 하려면 6을 5로 바꿔준다.
 *  3. A, B의 합이 최대가 되게 하려면 5를 6으로 바꿔준다.
 *  4. 최솟값과 최댓값을 출력한다.
 */
public class Problem_02864 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		
		int minA = Integer.parseInt(A.replace('6', '5'));
		int minB = Integer.parseInt(B.replace('6', '5'));
		
		int maxA = Integer.parseInt(A.replace('5', '6'));
		int maxB = Integer.parseInt(B.replace('5', '6'));
		
		System.out.print(minA + minB + " ");
		System.out.print(maxA + maxB);		
	}

}
