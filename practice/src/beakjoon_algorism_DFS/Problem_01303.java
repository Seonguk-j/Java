package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_01303 {
	
	static char[][] map;
	static boolean[][] check;
	static int N, M, W, B, cnt;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[M][N];
		check = new boolean[M][N];
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!check[i][j]) {
					cnt = 0;
					if(map[i][j] == 'W') {
						dfs(i, j, 'W');
						W += cnt * cnt;
					}
					else {
						dfs(i, j, 'B');
						B += cnt * cnt;
					}
				}
			}
		}
		System.out.println(W + " " + B);
	}
	
	static void dfs(int y, int x, char color) {
		cnt++;
		check[y][x] = true;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < N && Y >= 0 && Y < M && !check[Y][X] && map[Y][X] == color) {
				dfs(Y, X, color);
			}
		}
		
	}

}
