package beakjoon_algorism_greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 보석도둑
 * 1. 보석 수량 N, 가방 수량 K 입력받음
 * 2. 보석 무게 Mi, 보석 가격 Vi입력받음(N개)
 * 3. 가방 수용무게 Ci입력받음 (K개)
 * 4. Vi를 기준으로 배열 정렬
 * 5. Mi, Ci비교
 * 6. 합계산 후 출력.
 */
public class Problem_01202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[][] jewel = new int [N][2];
		for(int i = 0; i < N; i++) {
			jewel[i][0] = sc.nextInt();
			jewel[i][1] = sc.nextInt();
		}
		
		int[] C = new int [K];
		for(int i = 0; i < K; i++) {
			C[i] = sc.nextInt();
		}
		
		Arrays.sort(jewel, new Comparator<int[]>(){
			
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
				}
			return o2[1] - o1[1];
			}
		});
		Arrays.sort(C);
		
		int money = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				if(jewel[i][0] <= C[j]) {
					money += jewel[i][1];
					C[j] = 0;
					i++;
				}
			}
		}
		System.out.println(money);
	}

}
