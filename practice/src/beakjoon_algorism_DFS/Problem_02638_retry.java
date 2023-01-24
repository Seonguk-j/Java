package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_02638_retry {
	static int[][] cheese;
	static boolean[][] check;
	static int M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<Point> cheeseList = new ArrayList<Point>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int output = 0;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cheese = new int [N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				cheese[i][j] = Integer.parseInt(st.nextToken()) + 1;
				if(cheese[i][j] == 2) {
					cheeseList.add(new Point(i, j));
				}
			}
		}
		
		while(cheeseList.size() != 0) {
			check = new boolean[N][M];
			dfs(0, 0);
			melting();
			output++;
		}
		System.out.println(output);
	}
	
	static void dfs(int y, int x) {
		check[y][x] = true;
		cheese[y][x] = 0;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < M && Y >= 0 && Y < N && !check[Y][X] && cheese[Y][X] != 2) {
				dfs(Y, X);
			}
		}
	}
	
	static void melting() {
		for(int i = 0; i < cheeseList.size(); i++) {
			int cnt = 0;
			int x = cheeseList.get(i).x;
			int y = cheeseList.get(i).y;
			for(int j = 0; j < 4; j++) {
				int X = x + dx[j];
				int Y = y + dy[j];
				if(check[Y][X] && cheese[Y][X] == 0) {
					cnt++;
				}
			}
			if(cnt >= 2) {
				cheese[y][x] = 0;
				cheeseList.remove(i);
				i--;
			}
		}
	}
}

//class Point{
//	int x;
//	int y;
//	Point(int y, int x){
//		this.x = x;
//		this.y = y;
//	}
//}