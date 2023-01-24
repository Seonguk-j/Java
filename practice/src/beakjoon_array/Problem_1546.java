package beakjoon_array;

import java.util.Scanner;

/*
 * 스페셜저지
 * 1. 과목의 수를 입력받는다.
 * 2. 성적을 입력받는다.
 * 3. 최고점수를 찾아낸다.
 * 4. 각 과목의 점수/최고점수 *100을 해준다.
 * 5. 수정된 점수의 평균을 구한다.
 */
public class Problem_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int score[] = new int[N];
		for(int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i+1; j < N; j++) {
				if(score[N-1] <= score[N-2]) {
					if(score[i] >= score[j]) {
						max = score[i];
					}
				}
				else {
					max = score[N-1];
				}
			}
		}
		
		double fakeScore[] = new double[N];
		for(int i = 0; i < N; i++) {
			fakeScore[i] = ((double)score[i]/max)*100;
		}
		double fakeSum = 0;
		for(int i = 0; i < N; i++) {
			fakeSum = fakeSum + fakeScore[i];
		}
		double fakeAver = fakeSum/N;
		System.out.println(fakeAver);
	}

}
