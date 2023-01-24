package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//class Point{
//	int x;
//	int y;
//	Point(int y, int x){
//		this.x = x;
//		this.y = y;
//	}
//}

public class Problem_01743 {
	
	static ArrayList<Point> garbage = new ArrayList<Point>();
	static boolean[][] aisle;
	static int N, M, cnt;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		aisle = new boolean[N + 1][M + 1];
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()) - 1;
			int c = Integer.parseInt(st.nextToken()) - 1;
			aisle[r][c] = true;
			garbage.add(new Point(r, c));
		}
		
		for(int i = 0; i < garbage.size(); i++) {
			int x = garbage.get(i).x;
			int y = garbage.get(i).y;
			if(aisle[y][x]) {
				cnt = 0;
				dfs(y, x);
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
	
	static void dfs(int y, int x) {
		cnt++;
		aisle[y][x] = false;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < M && Y >= 0 && Y < N && aisle[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
