package beakjoon_array;

import java.util.Scanner;

/*
 * OX퀴즈
 * 1. 입력받기
 * 2. 
 */
public class Problem_8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum[] = new int[N];
		
		for(int j = 0; j < N; j++) {
			String input = scanner.next();
			char answer[] = new char[input.length()];
			for(int i = 0; i < input.length(); i++) {
				answer[i] = input.charAt(i);
			}
			
			int score[] = new int[input.length()];
			int serialScore = 0;
			for(int i = 0; i < input.length(); i++) {
				if(answer[i] == 'O') {
					serialScore++;
					score[i] = serialScore;
				}
				else{
					serialScore = 0;
					score[i] = serialScore;
				}
			}
			
			for(int i = 0; i < input.length(); i++) {
				sum[j] = sum[j] + score[i];
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(sum[i]);
		}
	}

}
