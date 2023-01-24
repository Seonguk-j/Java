package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 주유소
 *  1. 도시의 갯수 N을 입력받는다.
 *  2. 도시사이의 거리 d[N-1]입력받는다.
 *  3. 도시별 기름값 oil[N]입력받는다.
 *  4. 현 도시다 기름값이 낮은 도시까지 가는데 필요한 최소한의 거리를 계산한다.
 *  5. 기름값 * 거리를 계산하여 출력한다.
 */
public class Problem_13305 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] d = new int[N - 1];
		int[] oil = new int[N];
		
		for(int i = 0; i < d.length; i++) {
			d[i] = scanner.nextInt();
		}
		for(int i = 0; i < oil.length; i++) {
			oil[i] = scanner.nextInt();
		}
		
		int dSum[] = new int[N];
		int oilMin[] = new int[N];
		for(int i = 0; i < N - 2; i ++) {
			for(int j = i + 1; j < N; j++) {
				if(oil[i] >= oil[j]) {
					for(int k = i; k < j; k++) {
						dSum[i] += d[k];
					}
					oilMin[i] = oil[i];
					i = j;
				}
			}
		}
		
		int total = 0;
		for(int i = 0; i < N; i++) {
			total += dSum[i] * oilMin[i];
		}
		System.out.println(total);
	}

}
