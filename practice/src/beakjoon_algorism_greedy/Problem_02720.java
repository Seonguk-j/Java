package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 세탁소 사장 동혁
 *  1. 케이스 갯수 T입력받음
 *  2. 크기T의 배열에 케이스별 거스름돈 C입력받음
 *  3. [T][4]의 크기 배열에 거스름돈 갯수 넣는 함수 만듬
 *  4. 배열 출력
 */
public class Problem_02720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] exchange = new int [N];
		int[][] number = new int [N][4];
		
		for(int i = 0; i < N; i++) {
			exchange[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 4; j++) {
				if(exchange[i] / 25 > 0) {
					number[i][0] = exchange[i] / 25;
					exchange[i] = exchange[i] % 25;
				}
				else if(exchange[i] / 10 > 0) {
					number[i][1] = exchange[i] / 10;
					exchange[i] = exchange[i] % 10;
				}
				else if(exchange[i] / 5 > 0) {
					number[i][2] = exchange[i] / 5;
					exchange[i] = exchange[i] % 5;
				}
				else {
					number[i][3] = exchange[i];
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(number[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
