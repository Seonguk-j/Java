package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 내리막 길
 *  1. 배열의 크기 입력받음.
 *  2. 각 위치별 높이 입력받음.
 *  3. 높이가 현재보다 낮은경우 이동하여 최종지점에 도착할 경우 count
 *  4. count 출력.
 */
public class Problem_01520_retry {
	
	static int[][] map, cnt;
	static int M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		cnt = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				cnt[i][j] = -1;
			}
		}
		
		System.out.println(dfs(0, 0));
		br.close();
	}
	
	static int dfs(int x, int y) {
		if(x == M - 1 && y == N - 1) {
			return 1;
		}
		if(cnt[x][y] == -1) {
			cnt[x][y] = 0;
			for(int i = 0; i < 4; i++) {
				int X = x + dx[i];
				int Y = y + dy[i];
				
				if(X >= 0 && X < M && Y >= 0 && Y < N && map[x][y] > map[X][Y]) {
					cnt[x][y] += dfs(X, Y);
				}
			}
		}
		return cnt[x][y];
	}

}
