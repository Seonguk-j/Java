package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_16946 {
	
	static boolean[][] map, check;
	static int[][] output;
	static int N, M, cnt;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<Point> arr = new ArrayList<Point>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new boolean[N][M];
		output = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == '1') {
					map[i][j] = true;
					arr.add(new Point(i, j));
				}
			}
		}
		
		for(Point input : arr) {
			cnt = 0;
			int x = input.x;
			int y = input.y;
			if(map[y][x]) {
				check = new boolean[N][M];
				dfs(y, x);
				output[y][x] = cnt % 10;
				map[y][x] = true;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}
	
	static void dfs(int y, int x) {
		cnt++;
		map[y][x] = true;
		check[y][x] = true;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < M && Y >= 0 && Y < N && !map[Y][X] && !check[Y][X]) {
				dfs(Y, X);
			}
		}
		map[y][x] = false;
	}

}

//class Point{
//	int x, y;
//	public Point(int y, int x) {
//		this.x = x;
//		this.y = y;
//	}
//}
