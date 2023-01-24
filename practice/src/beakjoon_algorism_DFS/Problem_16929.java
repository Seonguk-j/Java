package beakjoon_algorism_DFS;
/*
 * Two Dots
 * o 1. 배열의 크기 N, M입력받음.
 * o 2. 배열 입력받음.
 *  3. 0,0 ~ N - 2, M - 2까지 4개짜리 써클 존재유무 확인.
 *  4. 없을 경우 dfs를 이용하여 써클 존재유무 확인.
 *  5. 출력.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_16929 {
	
	static int N, M, size;
	static char[][] map;
	static boolean[][] check;
	static boolean circle;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		check = new boolean[N][M];
		map = new char[N][M];
		for(int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < N - 1; i++) {
			if(!circle) {
				for(int j = 0; j < M - 1; j++) {
					if(map[i][j] == map[i + 1][j] && map[i][j] == map[i][j + 1] && map[i][j] == map[i + 1][j + 1]) {
						circle = true;
						break;
					}
				}
			}
			else
				break;
		}
		if(!circle) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					size = 0;
					dfs(i, j, i, j, map[i][j]);
				}
			}
		}
		
		if(circle)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	static void dfs(int y, int x, int endY, int endX, char compare) {
		check[y][x] = true;
		size++;
		if(!circle) {
			for(int i = 0; i < 4; i++) {
				int X = x + dx[i];
				int Y = y + dy[i];
				if(size > 3 && X == endX && Y == endY) {
					circle = true;
				}
				else {
					if(X >= 0 && X < M && Y >= 0 && Y < N && !check[Y][X] && map[Y][X] == compare)
						dfs(Y, X, endY, endX, compare);
				}
			}
		}
		check[y][x] = false;
		size--;
	}

}
