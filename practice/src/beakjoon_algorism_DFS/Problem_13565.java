package beakjoon_algorism_DFS;
/*
 * 침투
 *  1. 격자 MxN입력받음.
 *  2. char배열에 입력받음.
 *  3. 0행의 0값에 해당하는 칸만 dfs진행.
 *  4. M - 1행에 도착하는 값 있을 경우 Yes출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_13565 {
	
	static char[][] arr;
	static boolean[][] check;
	static int M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean output;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		check = new boolean[M][N];
		arr = new char[M][N];
		for(int i = 0; i < M; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		for(int i = 0; i < N; i++) {
			if(!output) {
				if(arr[0][i] == '0') {
					dfs(0, i);
				}
			}
			else
				break;
		}
		
		if(output)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	static void dfs(int y, int x) {
		check[y][x] = true;
		if(y != M - 1) {
			for(int i = 0; i < 4; i++) {
				int X = x + dx[i];
				int Y = y + dy[i];
				if(X >= 0 && X < N && Y >= 0 && Y < M && arr[y][x] == arr[Y][X] && !check[Y][X]) {
					dfs(Y, X);
				}
			}
		}
		else
			output = true;
	}

}
