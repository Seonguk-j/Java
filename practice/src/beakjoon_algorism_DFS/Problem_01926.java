package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//class Point{
//	int x;
//	int y;
//	
//	Point(int y, int x) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class Problem_01926 {
	static int[][] paper;
	static ArrayList<Point> paint = new ArrayList<Point>();
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[][] check;
	static int n, m, cnt, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		paper = new int[n][m];
		check = new boolean[n][m];
		max = 0;
		int paintCount = 0;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
				if(paper[i][j] == 1) {
					paint.add(new Point(i, j));
				}
				else {
					check[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < paint.size(); i++) {
			int x = paint.get(i).x;
			int y = paint.get(i).y;
			cnt = 0;
			if(!check[y][x]) {
				dfs(y, x);
				if(cnt != 0) {
					max = Math.max(max, cnt);
					paintCount++;
				}
			}
		}
		System.out.println(paintCount);
		System.out.println(max);
	}
	
	static void dfs(int y, int x) {
		cnt++;
		check[y][x] = true;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < m && Y >= 0 && Y < n && !check[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
