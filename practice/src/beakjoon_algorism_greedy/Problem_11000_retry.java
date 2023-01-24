package beakjoon_algorism_greedy;

import java.io.*;
import java.util.*;

public class Problem_11000_retry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(time[0][1]);
		
		for(int i = 1; i < N; i++) {
			if(pq.peek() <= time[i][0]) {
				pq.poll();
			}
			
			pq.add(time[i][1]);
		}
		
		System.out.println(pq.size());
		br.close();
	}

}
