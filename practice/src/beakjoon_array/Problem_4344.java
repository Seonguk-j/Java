package beakjoon_array;

import java.util.Scanner;

/*
 * 평균은 넘겠지
 * 1. 과목의 수 입력을 받는다.
 * 2. 과목별 학생의 수와 학생들의 점수를 입력받는다.
 * 3. 과목별 평균을 구한다.
 * 4. 과목별 평을 넘긴 학생의 비율을 구한다.
 */
public class Problem_4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		for(int i = 0; i < C; i++){
			int N = scanner.nextInt();
			int score[] = new int[N];
			for(int j = 0; j < N; j++) {
				score[j] = scanner.nextInt();
				System.out.print(score[j] + " ");
			}
			System.out.println();
		}
	}

}
