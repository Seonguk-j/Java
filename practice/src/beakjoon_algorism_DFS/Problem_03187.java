package beakjoon_algorism_DFS;
/*
 * 양치기 꿍
 *  1. 입력받음
 *  2. 울타리부분은 false
 *  3. true인 부분 dfs
 *  4. dfs중 양, 늑대의 수 cnt
 *  5. 더 많은 수 남김
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_03187 {
	
	static char[][] map;
	static boolean[][] check;
	static int R, C, cntW, cntS, wolf, sheep;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		check = new boolean[R][C];
		map = new char[R][C];
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
				if(map[i][j] == '#') {
					check[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(!check[i][j]) {
					cntW = cntS = 0;
					dfs(i, j);
					if(cntW < cntS)
						sheep += cntS;
					else
						wolf += cntW;
				}
			}
		}
		
		System.out.println(sheep + " " + wolf);
	}
	
	static void dfs(int y, int x) {
		if(map[y][x] == 'v')
			cntW++;
		else if(map[y][x] == 'k')
			cntS++;
		
		check[y][x] = true;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < C && Y >= 0 && Y < R && !check[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
