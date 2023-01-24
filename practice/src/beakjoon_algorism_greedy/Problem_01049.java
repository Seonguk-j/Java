	package beakjoon_algorism_greedy;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	/*
	 * 기타줄
	 *  1. 끊어진 기타줄 수 N, 브랜드 수 M
	 *  2. 6개세트 가격, 1개 가격을 브랜드 별로 입력받음.
	 *  3. 6개세트 가격, 1개 가격 각각 오름차순 정렬.
	 *  4. 비교 후 결과도
	 */
	public class Problem_01049 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int m6[] = new int[M];
			int m1[] = new int[M];
			for(int i = 0; i < M; i++) {
				m6[i] = sc.nextInt();
				m1[i] = sc.nextInt();
			}
			Arrays.sort(m6);
			Arrays.sort(m1);
			
			int money = 0;
			if((N % 6) != 0) {
				money = Math.min(m6[0] * (N / 6 + 1), m1[0] * N);
				money = Math.min(m6[0] * (N / 6) + m1[0] * (N % 6), money);
			}
			else {
				money = Math.min(m6[0] * N / 6, m1[0] * N);
			}
			System.out.println(money);
		}
	
	}
