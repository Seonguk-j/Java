package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_14267 {
	
	static ArrayList<Integer>[] arr;
	static long[] person;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> start = new ArrayList<Integer>();
		int head = 0;
		
		person = new long[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 0; i < n + 1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(x != -1) {
				arr[x].add(i + 1);
				if(x == 1) {
					start.add(i + 1);
				}
			}
			else {
				head = i + 1;
			}
		}
				
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			person[x] += y;
		}
		
		for(int i : start)
		dfs(i, head);
		
		for(int i = 1; i < n + 1; i++) {
			System.out.print(person[i] + " ");
		}
	}
	
	static void dfs(int man, int boss) {
		person[man] += person[boss];
		for(int i = 0; i < arr[man].size(); i++) {
			dfs(arr[man].get(i), man);
		}
	}
}
