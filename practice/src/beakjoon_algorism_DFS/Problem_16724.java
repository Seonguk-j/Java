package beakjoon_algorism_DFS;
/*
 * 피리 부는 사나이
 *  1. 값 입력받음.
 *  2. ArrayList<Point>[][] map에 연결관계 입력.
 *  3. for문 사용하여 연관그룹 갯수 찾음.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_16724 {
	
	static ArrayList<Point>[][] map;
	static boolean[][] check;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		check = new boolean[N][M];
		map = new ArrayList[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = new ArrayList<Point>();
			}
		}
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				char dir = str.charAt(j);
				int x, y;
				if(dir == 'U') {
					x = j;
					y = i - 1;
				}
				else if(dir =='D') {
					x = j;
					y = i + 1;
				}
				else if(dir =='L') {
					x = j - 1;
					y = i;
				}
				else {
					x = j + 1;
					y = i;
				}
				map[i][j].add(new Point(y, x));
				map[y][x].add(new Point(i, j));
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!check[i][j]) {
					cnt++;
					dfs(i, j);
				}
			}
		}
		System.out.println(cnt);
	}
	
	static void dfs(int y, int x) {
		check[y][x] = true;
		for(int i = 0; i < map[y][x].size(); i++) {
			int nextX = map[y][x].get(i).x;
			int nextY = map[y][x].get(i).y;
			if(!check[nextY][nextX]) {
				dfs(nextY, nextX);
			}
		}
	}

}

//class Point{
//	int x;
//	int y;
//	public Point(int y, int x) {
//		this.x = x;
//		this.y = y;
//	}
//}
