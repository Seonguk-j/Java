package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 거스름돈
 *  1. 거스름돈 n입력받음.
 *  2. 동전은 2, 5원짜리
 *  3. 거스름돈 최소
 */
public class Problem_14916 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count;
		
		if(n == 1 || n ==3) {
			count = -1;
		}

		else if(n >= 5) {
			count = n / 5;
			n = n % 5;
			if(n % 2 == 0) {
				count += n / 2;
			}
			else {
				count += (n + 5) / 2 - 1;
			}
		}
		else {
			count = n / 2;
		}
		System.out.println(count);
	}

}
