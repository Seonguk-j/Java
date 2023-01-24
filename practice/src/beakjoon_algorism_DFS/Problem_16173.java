package beakjoon_algorism_DFS;
/*
 * 점프왕 쩰리(Small)
 * o 1. int[n][n]map 에 값 입력받음
 *  2. map[i][j]의 값에 dx, dy곱해서 이동.
 *  3. 최종 map[n - 1][n - 1]에 도달하면 승리.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_16173 {
	
	static int[][] map;
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static boolean output;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for(int i = 0 ; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0);
		if(output)
			System.out.println("HaruHaru");
		else
			System.out.println("Hing");
	}
	
	static void dfs(int y, int x) {
		if(map[y][x] == 0)
			output = false;
		else if(map[y][x] == -1)
			output = true;
		else {
			for(int i = 0; i < 2; i++) {
				int X = x + map[y][x] * dx[i];
				int Y = y + map[y][x] * dy[i];
				if(X < n && Y < n) {
					dfs(Y, X);
				}
			}
		}
	}

}
