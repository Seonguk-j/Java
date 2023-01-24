package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_14716 {
	
	static boolean[][] arr;
	static int M, N, cnt;
	static int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
	static int[] dy = {0, 1, -1, 1, 0, 1, -1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new boolean[M][N];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				if(st.nextToken().equals("1"))
					arr[i][j] = true;
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j]) {
					cnt++;
					dfs(i, j);
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	static void dfs(int y, int x) {
		arr[y][x] = false;
		for(int i = 0; i < 8; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < N && Y >= 0 && Y < M && arr[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
