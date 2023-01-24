package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Problem_02212 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < N - 1; i++) {
			pq.add(arr[i + 1] - arr[i]);
		}
				
		for(int i = 0 ; i < K - 1; i++) {
			pq.poll();
		}
		
		int sum = 0;
		for(int i = 0; i < N - K; i++) {
			sum += pq.peek();
			pq.poll();
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
