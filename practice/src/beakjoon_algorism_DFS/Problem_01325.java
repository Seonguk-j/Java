package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Problem_01325 {
	
	static ArrayList<Integer>[] arr;
	static boolean[] check;
	static int[] cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		cnt = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[y].add(x);
		}
		
		for(int i = 1; i <= N; i++) {
			check = new boolean[N + 1];
			dfs(i, i);
			pq.add(cnt[i]);
		}
		int max = pq.poll();
		for(int i = 1; i <= N; i++) {
			if(cnt[i] == max) {
				System.out.print(i + " ");
			}
		}
		br.close();
	}
	
	static void dfs(int input, int index) {
		if(!check[input]) {
			cnt[index]++;
			check[input] = true;
			for(int i = 0; i < arr[input].size(); i++) {
				dfs(arr[input].get(i), index);
			}
		}
	}

}
