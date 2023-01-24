package beakjoon_algorism_DFS;
/*
 * 모양 만들기
 *  1. 입력받음.
 *  2. 0의 위치 따로 저장.
 *  3. 0주변에 1이 있을 경우 0의 값을 1로 변경 후 갯수 카운트.
 *  4. for문 돌려서 가장 큰값 출력.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_16932 {
	
	static ArrayList<Point> arr = new ArrayList<Point>();
	static int[][] map;
	static boolean[][] check;
	static int max, cnt, M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		check = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 0) {
					arr.add(new Point(i, j));
				}
			}
		}
		for(Point node : arr) {
			int x = node.x;
			int y = node.y;
			for(int i = 0; i < 4; i++) {
				int X = x + dx[i];
				int Y = y + dy[i];
				if(X >= 0 && X < M && Y >= 0 && Y < N && map[Y][X] == 1) {
					check = new boolean[N][M];
					cnt = 0;
					dfs(y, x);
					max = Math.max(max, cnt);
				}
			}
		}
		System.out.println(max);
	}

	static void dfs(int y, int x) {
		check[y][x] = true;
		cnt++;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < M && Y >= 0 && Y < N && map[Y][X] == 1 && !check[Y][X]) {
				dfs(Y, X);
			}
		}
	}
}

//class Point{
//	int y, x;
//	Point(int y, int x){
//		this.y = y;
//		this.x = x;
//	}
//}
