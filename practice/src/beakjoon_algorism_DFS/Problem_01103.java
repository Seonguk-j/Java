package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_01103 {
	
	static char[][] map;
	static boolean[][] check;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int R, C, cnt, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		check = new boolean[R][C];
		for(int i = 0; i < R; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		dfs(0, 0, 0);
		System.out.println(max);
	}
	
	static void dfs(int y, int x, int count) {
		if(max != -1) {
			count++;
			max = Math.max(max, count);
			check[y][x] = true;
			for(int i = 0; i < 4; i++) {
				int X = x + dx[i] * (map[y][x] - 48);
				int Y = y + dy[i] * (map[y][x] - 48);
				if(X >= 0 && X < C && Y >= 0 && Y < R && map[Y][X] != 'H') {
					if(check[Y][X]) {
						max = -1;
						break;
					}
					else {
						dfs(Y, X, count);
					}
				}
			}
			check[y][x] = false;
		}
	}

}
