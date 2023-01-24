package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
 * 안테나
 */
public class Problem_01260_2 {
	
	public static boolean[][] arr;
	public static boolean[] visited;
	public static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N + 1][N + 1];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = true;
		}
		visited = new boolean[N + 1];
		dfs(V);
		
		visited = new boolean[N + 1];
		System.out.println();
		bfs(V);
		br.close();
	}
	
	public static void dfs(int start){
		
		visited[start] = true;
		System.out.print(start + " ");
		for(int i = 1; i < arr[start].length; i++) {
			if(arr[start][i]) {
				if(!visited[i]) {
					dfs(i);
				}
			}
		}
	}
	
	public static void bfs(int start) {
		
		if(!visited[start])
			System.out.print(start + " ");

		visited[start] = true;
		
		for(int i = 1; i < arr[start].length; i++) {
			if(!visited[i] && arr[start][i]) {
				q.add(i);
			}
		}
		
		if(!q.isEmpty()) {
			bfs(q.poll());
		}
	}

}
