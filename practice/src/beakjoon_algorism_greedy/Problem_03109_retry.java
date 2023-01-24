package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 빵집
 *  1. 숫자 R, C입력받음.
 *  2. 크기가 RxC인 boolean배열에 x로 false를, .으로 true입력함.
 *  3. j열(C에 속함)과 j + 1열을 비교하여 가능한 경로 구함.
 */
public class Problem_03109_retry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char[][] arr = new char[R][C];
		int count = 0;
		
		for(int i = 0; i < R; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		
//		for(int i = 0; i < R; i++) {
//			for(int j = 0; j < C; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}
	
	
}
