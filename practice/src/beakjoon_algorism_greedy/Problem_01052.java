package beakjoon_algorism_greedy;

import java.io.*;
import java.util.*;

public class Problem_01052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		long compare = N;
		
		long[] arr = new long[K];
		for(int i = 0; i < K; i++) {
			arr[i] = 1;
		}
		
		for(int i = 0; i < K; i++) {
			if(i != K - 1) {
				while(true) {
					if(arr[i] < N)
						arr[i] = arr[i] * 2;
					else {
						arr[i] = arr[i] / 2;
						break;
					}
				}
				N -= arr[i];
			}
			else {
				while(true) {
					if(arr[i] < N)
						arr[i] = arr[i] * 2;
					else {
						arr[i] = arr[i];
						break;
					}
				}
			}
		}
		
		int output = 0;
		for(int i = 0; i < K; i++) {
			output += arr[i];
		}
		output -= compare;
		System.out.println(output);
	}

}
