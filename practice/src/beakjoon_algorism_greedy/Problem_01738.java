package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 병든 나이트
 *  1. 칸의 크기 N, M입력받음.
 *  2. 칸의 크기에 따른 조건별 식 작성.
 *  3. 최대방문 칸수 출력.
 */
public class Problem_01738 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int count;
		if(N > 2) {
			if(M >= 7)
				count = M - 2;
			else if(M >= 4)
				count = 4;
			else
				count = M;
		}
		else if(N == 2) {
			if(M >= 7)
				count = 4;
			else
				count = 1 + (M - 1) / 2;
		}
		else
			count = 1;
			
		System.out.println(count);
	}

}
