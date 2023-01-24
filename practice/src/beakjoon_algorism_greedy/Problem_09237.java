package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_09237 {
	
	static Integer[] arr;
	static int max = 0, cnt = 2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new Integer[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < N - 1; i++) {
			max = Math.max(max, cnt + arr[i]);
			cnt++;
		}
		System.out.println(max);
	}

}
