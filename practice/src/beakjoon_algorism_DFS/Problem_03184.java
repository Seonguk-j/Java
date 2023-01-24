package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_03184 {
	
	static char[][] map;
	static boolean[][] check;
	static int R, C, sheep, wolf, compareS, compareW;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		check = new boolean[R][C];
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
				if(map[i][j] == '#') {
					check[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(!check[i][j]) {
					compareS = compareW = 0;
					dfs(i, j);
					if(compareS > compareW) {
						sheep += compareS;
					}
					else {
						wolf += compareW;
					}
				}
			}
		}
		System.out.println(sheep + " " + wolf);
	}
	
	static void dfs(int y, int x) {
		check[y][x] = true;
		if(map[y][x] == 'v') {
			compareW++;
		}
		else if(map[y][x] == 'o') {
			compareS++;
		}
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < C && Y >= 0 && Y < R && !check[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
