package beakjoon_algorism_greedy;

import java.io.*;
import java.util.*;

public class Problem_14659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N - 1; i++) {
			int start = 0, finish = 0, kill = 0;
			
			for(int j = i + 1; j < N; j++) {
				if(arr[i] < arr[j]) {
					start = i;
					finish = j - 1;
					kill = finish - start;
					max = Math.max(max, kill);
					i = j;
				}
				else if(j == N - 1) {
					start = i;
					finish = j;
					kill = finish - start;
					max = Math.max(max, kill);
				}
			}
		}
		System.out.println(max);
	}

}
