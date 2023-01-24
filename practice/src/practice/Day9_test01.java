package practice;

import java.util.Scanner;

/*
 * 평균 이상 학생의 평균과 합계
 *  1. 학생수 N을 입력받는다.
 *  2. 학생들의 점수를 입력받는다.
 *  3. 학생들의 평균성적을 구한다.
 *  4. 평균이상의 학생들의 성적을 합한다.
 *  5. 출력한다.
 */
public class Day9_test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int score[] = new int [N];
		for(int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum = sum + score[i];
		}
		
		double ever = (double)sum / N;
		
		int goodsum = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			if(score[i] > ever) {
				goodsum = goodsum + score[i];
				count++;
			}
		}
		
		double goodever = (double)goodsum/count;
		
		System.out.println(goodever);
		System.out.println(goodsum);
	}

}
